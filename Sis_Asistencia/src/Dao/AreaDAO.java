package Dao;

import Javabeans.Area;
import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.postgresql.util.PSQLException;


public class AreaDAO extends ConexionBd{

    private Query qs;
    private Area objArea;
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
    public AreaDAO(){
        _table = "area";
        _error = "Dao_AreaDao_";
        filter = new String[0][0];
        campos = new String[2];
        campos[0]="idare";
        campos[1]="nombre";
        witdhcolum = new int[1];
        witdhcolum[0]=50;
    }

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
     * Registro de areas
     */
    public int save(String name, boolean state){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            objArea = new Area(0,name,now,now,state);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setString(1,objArea.getName());
            pt.setBoolean(2,objArea.getState());
            pt.setDate(3,date.valueOf(objArea.getCreated()));
            pt.setDate(4,date.valueOf(objArea.getModified()));
            
            
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
     * Actualizacion de areas
     */
    public int update(int id, String name, boolean state){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            
            objArea = new Area(id,name,now,now,state);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setString(1,objArea.getName());
            pt.setBoolean(2,objArea.getState());
            pt.setDate(3,date.valueOf(objArea.getModified()));
            pt.setInt(4,objArea.getIdare());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error + "update: "+e);
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
            objArea = new Area();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            
            objArea.setIdare(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objArea.getIdare());
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
        }
        catch (PSQLException pg) {
            try{
                Date date = new Date(0000-00-00);
                getConexion();
                qs= new Query();
                objArea = new Area();
                objArea = getValues(id);
                objArea.setState(false);
                pt = qs.sqlUpdate(this._table);
                pt.setString(1,objArea.getName());
                pt.setBoolean(2,objArea.getState());
                pt.setDate(3,date.valueOf(objArea.getModified()));
                pt.setInt(4,id);
                //Ejecucion y cierre
                i= pt.executeUpdate();
                if(i>0){
                    i = -1;
                }
                pt.close();
                closeConexion();
            } catch(Exception e) {
                System.out.println(_error + "PSQL_delete: "+e);
            }
        }
        catch(Exception e){
            System.out.println(_error + "delete: "+e);
        }
        return i;
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
    

    /*
     * Cargar valores de busqueda al modelo 
     */
    public Area getValues(int idusu){
       objArea =  new Area();
       objVal = new Validators();
        try{
            qs= new Query();
            //Preparando
            String campos[] = new String[6];
            campos = qs.getRecords(_table,idusu);
            objArea.setName(campos[2]);
            objArea.setState(objVal.StringToBoolean(campos[3]));
            objArea.setCreated(campos[4]);
            objArea.setModified(campos[5]);
            
            return objArea;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objArea;
        }
    }

}
    