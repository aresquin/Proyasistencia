
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Javabeans.Empresa;
import Javabeans.Usuario;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class EmpresaDAO extends ConexionBd{
    private Query qs;
    private Empresa objEmpresa;
    private Helpers hp;
    private String filter[][] = new String[0][0];
    private Usuario objUsu;
    
    PreparedStatement  pt = null;
    
    public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            qs= new Query();
            if (filter.length <= 0){
                filter = new String[0][0];
            }           
           String campos[] = new String[2];
            campos[0]="idare";
            campos[1]="name";
            String Table = "empresa";
            datos = qs.getAll(campos,Table, filter);
            tblDatos.setModel(datos);   
        }
        catch(Exception e)
        {
            System.out.println("Dao_EmpresaDao: "+e);
        }
    
    }
    /*
     * Registro de Empresas
     */
    public int save(String name,String ruc, int state){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = "empresa";
            String now = hp.getDateNow();
            
            objEmpresa = new Empresa(0,name,ruc,false,now,now);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setString(1,objEmpresa.getName());
            pt.setString(2,objEmpresa.getRuc());
            pt.setBoolean(3,objEmpresa.isEstado());
            pt.setDate(4,date.valueOf(objEmpresa.getCreated()));
            pt.setDate(5,date.valueOf(objEmpresa.getModified()));
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_EmpresaDAO: "+e);
            return i;
        }
    }
    
    /*
     * Actualizacion de Empresa
     */
    public int update(int id, String name,String ruc, int state){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = "empresa";
            String now = hp.getDateNow();
            
            objEmpresa = new Empresa(0,name,ruc,false,now,now);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setString(1,objEmpresa.getName());
            pt.setString(2,objEmpresa.getRuc());
            pt.setBoolean(3,objEmpresa.isEstado());
            //pt.setDate(3,date.valueOf(objArea.getModified()));
            pt.setDate(4,date.valueOf(objEmpresa.getCreated()));
            pt.setDate(5,date.valueOf(objEmpresa.getModified()));
            pt.setInt(6,objEmpresa.getIdempr());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_EmpresaDAO: "+e);
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
            objEmpresa = new Empresa();
            hp = new Helpers();
            qs= new Query();
            String Table = "empresa";
            
            objEmpresa.setIdempr(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objEmpresa.getIdempr());
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_EmpresaDAO: "+e);
            return i;
        }
    }
    
    public int find(String name,JTable tblDatos) {
        int i = 0;
        try {
            if(!"".equals(name)){
                filter = new String[1][2];
                filter[0][0] = "name";
                filter[0][1] = name; 
            }
            getTableAll(tblDatos);
        }
        catch(Exception e){
            System.out.println("Dao_EmpresaDAO_find : "+e);
        }
        return i;
    }
    
    /*
     * Cargar valores de busqueda al modelo 
     */
    public int getValues(int idusu){
       int i=0;
        try{
            objEmpresa =  new Empresa();
            qs= new Query();
            //Preparando
            String campos[] = new String[5];
            campos = qs.getRecords("area",idusu);
            objEmpresa.setName(campos[1]);
            objEmpresa.setRuc(campos[2]);
            objEmpresa.setEstado(Boolean.valueOf(campos[3]));
            objEmpresa.setCreated(campos[4]);
            objEmpresa.setModified(campos[5]);
            i=1;
            
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_EmpresaDAO_delete: "+e);
            return i;
        }
    }
}