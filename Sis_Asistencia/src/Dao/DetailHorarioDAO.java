
package Dao;

import Javabeans.DetailHorario;
import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.Date;
import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DetailHorarioDAO extends ConexionBd{
    
    private Query qs;
    private DetailHorario objDetail;
    private Helpers hp;
    private Validators objVal;
    private String filter[][];
    private String campos[];
    private int witdhcolum[];
    private String _table;
    private String _error;
    
    PreparedStatement  pt = null;
    /*
     * Carga de datos
     */
    public DetailHorarioDAO(){
        _table = "detailhorario";
        _error = "Dao_DetailHorarioDAO_";
        filter = new String[0][0];
        campos = new String[5];
        campos[0]="iddet_hor";
        campos[1]="dia";
        campos[2]="idtip_reg";
        campos[3]="ingreso";
        campos[4]="salida";
        witdhcolum = new int[1];
        witdhcolum[0]=50;
    }
    
    //==========================================================================        
    public void getTableAll(JTable tblDatos){
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
        }
        catch(Exception e){
            System.out.println(_error + "getTableAll: "+e);
        }
    
    }
    /*
     * Registro de los detalles
     */
    public int save(int dia, int idtip_reg, String ingreso, String salida, int horario){
       int i=0;
        try{
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            objDetail = new DetailHorario(0,dia,idtip_reg,ingreso,salida,horario);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setInt(1,objDetail.getDia());
            pt.setInt(2,objDetail.getIdtip_reg());
            pt.setTimestamp(3,Timestamp.valueOf(objDetail.getIngreso()));
            pt.setTimestamp(4,Timestamp.valueOf(objDetail.getSalida()));
            pt.setInt(5,objDetail.getHorarios_idhor());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error + "save: "+e);
            return i;
        }
    }
     /*
     * Eliminar 
     */
    public int delete(int id){
       int i=0;
        try{
            //Preparando
            getConexion();
            objDetail = new DetailHorario();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            
            objDetail.setIddet_hor(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objDetail.getIddet_hor());
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error + "delete: "+e);
            return i;
        }
    }
    /*
     * Por defecto busca a travez de un like '%%'
     * int_ = Busqueda de entero
     * equ_ = busca exactamente la plabra
     */
    public int find(String name,JTable tblDatos) {
        int i = 0;
        try {
            if(!"".equals(name)){
                filter = new String[1][2];
                filter[0][0] = "nombre";
                filter[0][1] = name.toUpperCase(); 
            }
            getTableAll(tblDatos);
        }
        catch(Exception e){
            System.out.println(_error + "find : "+e);
        }
        return i;
    }
    
}
