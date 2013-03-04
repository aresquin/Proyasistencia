
package Dao;

import Appi.TimeOPeration;
import Javabeans.Area;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.ConexionBd;
import Utilitarios.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ConsultaDAO {
    
    private Query qs;
    private Area objArea;
    private Helpers hp;
    private Data dt;
    private String filter[][];
    private String campos[];
    private int witdhcolum[];
    private String _table;
    private String _error;
    private ResultSet rs = null;
    private ResultSet rs_extra = null;
    private Statement s = null;
    private Statement s_extra = null;
    private PreparedStatement  pt = null;
    private ConexionBd con;
    private Connection conexion;
    private TimeOPeration tm;
    private String DateEmp[];
    private String _Table;

    public ConsultaDAO(){
        _error = "Dao_ConsultaDAO_";
        filter = new String[0][0];
        campos = new String[0];
        witdhcolum = new int[6];
        witdhcolum[0]=180;
        witdhcolum[1]=80;
        witdhcolum[2]=75;
        witdhcolum[3]=75;
        witdhcolum[4]=75;
        witdhcolum[5]=60;
        _table = "report";
    }
    public void setTable(String table) {
        this._Table = table;
    }
    
    public void getTableAll(JTable tblDatos , JLabel lblcant){
        try{
            DefaultTableModel datos;
            qs= new Query();
            hp = new Helpers();
            if (filter.length <= 0){
                filter = new String[0][0];
            }
            String Table = this._table;
            datos = qs.getAll(this.campos,Table,filter);
            tblDatos.setModel(datos);
            hp.setWidthJtable(tblDatos,witdhcolum);
            int num = tblDatos.getRowCount();
            lblcant.setText(String .valueOf(num));
        }
        catch(Exception e){
            System.out.println(_error + "getTableAll: "+e);
        }
    }
    public void findAsistencia(String args[]) {
        qs = new Query();
        Statement s = null;
        con = new ConexionBd();
        try {
            //Campos de la tabla report
            String lista[];
            campos = set_camp_registro();
            //Campos para la consulta
            qs.create_report(campos);
            String[] camp = new String[2];
            camp[0] = "fecha";
            //camp[1] = "idtip_reg%G_TIPOREG";
            camp[1] = "hora";
            DateEmp = qs.getRecords("empleado",Integer.parseInt(args[0]));
            //Filtros
            filter = new String[2][2];
            filter[0][0] = "int_idemp";
            filter[0][1] = args[0];
            filter[1][0] = "bet_fecha_" + args[1];
            filter[1][1] = args[2];
            helper_asistencia(filter, camp, args[1], args[2]);
            filter = new String[0][0];
        }
        catch(Exception e){
            System.out.println(_error + "findAsistencia : "+e);
        }
    }
    public void destroid_report() {
        qs.destroid_report();
    }
    public void gettabel(JTable tblDatos, JLabel lblcant) {
        getTableAll(tblDatos,lblcant);
    }
    //Ejecucion de la consulta
    private void helper_asistencia(String filter[][], String camp[],
            String fechInicio, String fechFinal) throws SQLException, ParseException{
        qs= new Query();
        hp= new Helpers();
        dt = new Data();
        //Declaracion
        SimpleDateFormat fhora = new SimpleDateFormat("HH:mm:ss");
        String Consulta = "";
        Object[] fila;
        String[] temp;
        String tbl;
        int count = 0;
        int ind = 0;
        con.getConexion();
        conexion = con.getConetion();
        s = conexion.createStatement();
        //Titulos
        //System.out.println("1");
        //System.out.println("table: " + this._Table + "filter: "+filter[0][0]+" - "+filter[0][1]);
        Consulta = qs.getQueryList(camp, this._Table + "/fecha", filter);
        //System.out.println("consulta: "+Consulta);
        rs = s.executeQuery(Consulta);
        ResultSetMetaData meta = rs.getMetaData();
        int nCols = meta.getColumnCount();
        fila = new Object[nCols];
        //Logica
        fechFinal = qs.getDay(fechFinal, "+");
        String fechActual = fechInicio;
        int dia = 0;
        String Total="00:00";
        do {
            ind = 0;
            //Ejecucion de consulta
            filter[1][0] = "bet_fecha_" + fechActual;filter[1][1] = fechActual;
            Consulta = qs.getQueryList(camp, this._Table + "/fecha", filter);
            //System.out.println(Consulta);
            rs = s.executeQuery(Consulta);
            boolean countReg = false;
            //Registro del reporte
            String[] campReg;
            campReg = new String[6];
            dia = Integer.parseInt(qs.getDayOfTheWeek(fechActual));
            while(rs.next()){
                countReg = true;
                count++;
                for(int i=0; i<nCols; ++i){
                    fila[i] = rs.getObject(i+1);
                    //Temporal
                    if(ind >= 2 && i == 1 ){
                        campReg[ind]=String.valueOf(fila[i]);
                        ind++;
                    }
                    if(ind < 2){
                        if(ind == 0) {
                            fila[i] = fila[i] + " (" + dt.G_DIAS[dia] + ")";
                        }
                        campReg[ind]=String.valueOf(fila[i]);
                        ind++;
                    }
                }
            }
            //Suma
            if(countReg == true) {
                if(ind == 3){
                    campReg[4] = campReg[2];campReg[2] = "";campReg[3] = "";
                    campReg[5] = calculoHoras(campReg, 2);
                } else if(ind == 5){
                    campReg[5] = calculoHoras(campReg, 4);
                }
                Total = tm.SumaHoras(String.valueOf(Total), String.valueOf(campReg[5]));
            }
            //No existen registros del dia
            if(countReg == false) { 
                campReg = new String[6];
                campReg[0]=String.valueOf(fechActual + " (" + dt.G_DIAS[dia] + ")");
                //Domingo
                if(dia == 7) {
                    campReg[1]=String.valueOf("");
                }
                else {
                    int cVal=0;
                    String[] args =  new String[5];
                    args[0]="nolaborables";
                    args[1]="idempr";
                    args[2]=DateEmp[14];
                    args[3]="fecha";
                    args[4]=fechActual;
                    cVal = qs.getCountRegister(args);
                    if(cVal > 0) {
                        campReg[1]=String.valueOf("Dia no laborable");
                    } 
                    if(cVal == 0){
                        cVal = qs.getcount("vacaciones where idemp='" + DateEmp[1] +"' and '"+fechActual+"'>=f_ini and '"+fechActual+"'<=f_final");
                        if(cVal > 0) {
                            campReg[1]=String.valueOf("Vacaciones");
                        } 
                    }
                    if(cVal == 0){
                        args =  new String[7];
                        args[0]="justificaciones";
                        args[1]="empleado_idemp";
                        args[2]=DateEmp[1];
                        args[3]="fecha";
                        args[4]=fechActual;
                        args[5]="idtip_jus";
                        args[6]="2";
                        cVal = qs.getCountRegister(args);
                        if(cVal > 0) {
                            campReg[1]=String.valueOf("Justificado");
                        }
                    }
                    if(cVal == 0)
                        campReg[1]=String.valueOf("Falto");
                    }
               for(int i=2;i<campReg.length;i++){
                   campReg[i]=String.valueOf("");
               }
            }
            register_report(campReg);
        fechActual = qs.getDay(fechActual, "+");
        } while(!fechActual.equals(fechFinal));
         String[] campReg = new String[6];
         campReg[0] = "";
         campReg[1] = "";
         campReg[2] = "";
         campReg[3] = "";
         campReg[4] = "Total";
         campReg[5] = Total;
        register_report(campReg);
    }
        
    public String calculoHoras(String[] args, int op){
                String suma="";
        try {
            tm = new TimeOPeration();
            DateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            if (op == 2) {
                String inicio = args[1];
                String termino = args[4];
                Date date_ini = sdf.parse(inicio);
                Date date_fin = sdf.parse(termino);
                Time hrs = tm.restarTime(Time.valueOf(sdf.format(date_fin)),
                        Time.valueOf(sdf.format(date_ini)));
                suma = String.valueOf(hrs);
            }
            if(op == 4) {
                String inicio = args[1];
                String termino = args[4];
                String ref_inicio = args[2];
                String ref_termino = args[3];
                Date date_ini = sdf.parse(inicio);
                Date date_fin = sdf.parse(termino);
                Date date_ref_ini = sdf.parse(ref_inicio);
                //Date ref = sdf.parse("12:00:00");
                Date date_ref_fin = sdf.parse(ref_termino);
                Time hrs_trabajo = tm.restarTime(Time.valueOf(sdf.format(date_ref_ini)),
                        Time.valueOf(sdf.format(date_ini)));
                Time hrs_refrigerio = tm.restarTime(Time.valueOf(sdf.format(date_fin)),
                        Time.valueOf(sdf.format(date_ref_fin)));
                System.out.println("trabajo: "+hrs_trabajo+" refrigerio: "+hrs_refrigerio);
                //Time hrs = tm.sumarTime(hrs_trabajo, hrs_refrigerio);
                //hrs = tm.restarTime(hrs, Time.valueOf(sdf.format(ref)));
                //suma = String.valueOf(hrs);
                suma = tm.SumaHoras(String.valueOf(hrs_trabajo), String.valueOf(hrs_refrigerio));
                
                System.out.println("Suma: "+suma);
            } 
        } catch(Exception e) {
            System.out.println(_error + "calculoHoras: "+e);
        }
        return suma;
    }
    
    public void register_report(String[] args) {
        pt = null;
        try {
            String query = "insert into report values(";
            for(int i=0;i<args.length;i++){
                query = query + "'" + args[i] + "'";
                if(args.length!=i+1) { 
                    query = query + ",";
                }
            }
            query = query + ")";
            pt  = conexion.prepareStatement(query);
            pt.executeUpdate();
            pt.close();   
        }
        catch(Exception e){
            System.out.println(_error + "register_findAsistencia : "+e);
        }
    }
    
    public String[] set_camp_registro(){
        String campos[] = new String[6];
        campos[0] = "fecha";
        campos[1] = "ingreso";
        campos[2] = "refrigerio_ing";
        campos[3] = "refrigerio_sal";
        campos[4] = "salida";
        campos[5] = "horas";
        return campos;
    }
    public String[] set_camp_justificaciones(){
        String campos[] = new String[5];
        campos[0] = "recibo";
        campos[1] = "descripcion";
        campos[2] = "hora_ini";
        campos[3] = "hora_final";
        campos[4] = "salida";
        return campos;
    }
   public void create_report_justificaciones(String args[]){
       qs= new Query();
       con = new ConexionBd();
       try {
            Statement s = null;
            Statement s_extra = null;
            campos = set_camp_justificaciones();
            qs.create_report(campos);
            con.getConexion();
            conexion = con.getConetion();
            s = conexion.createStatement();
            s_extra = conexion.createStatement();
            String[] campReg = new String[5];
            String Consulta;
            String ConsultaTipo = "select * from tipo_justificaciones";
            //System.out.println(Consulta);
            
            rs = s.executeQuery(ConsultaTipo);
            int i;
            while(rs.next()){
                i = 0;
                Consulta = "select * from justificaciones "
                        + "where idtip_jus = " +rs.getInt(1)
                        + " and empleado_idemp="+args[0];
                rs_extra = s_extra.executeQuery(Consulta);
                while(rs_extra.next()){
                    if(i==0){
                        campReg[0] = rs.getString(2);
                        campReg[1] = "";
                        campReg[2] = "";
                        campReg[3] = "";
                        campReg[4] = "";
                        register_report(campReg);i++;
                    }
                    campReg[0] = rs_extra.getString(7)+"("+rs_extra.getString(5)+")";
                    campReg[1] = rs_extra.getString(4);
                    campReg[2] = rs_extra.getString(8);
                    campReg[3] = rs_extra.getString(9);
                    campReg[4] = rs_extra.getString(6);
                    register_report(campReg);
                }
            }
            con.closeConexion();
       } catch(Exception e){
           System.out.println(_error + "create_report_justificaciones : "+e);
       }

       
   }
}
