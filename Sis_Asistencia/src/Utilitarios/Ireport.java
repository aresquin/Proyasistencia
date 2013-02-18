
package Utilitarios;

import java.awt.Container;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.sql.*;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import Utilitarios.ConexionBd;

public class Ireport  extends  ConexionBd{
    
    private Connection conn = null;
    private Helpers hp;
    private String[] args;
    private String _ubicacion = "reportes";
    private JasperReport masterReport= null;
    private Map parametro;
    private JasperPrint jasperPrint;
    private JasperViewer jviewer;
    
    private String idEmp;

    public void setargs(String[] args){
        this.args = args;
    }
/*    
    public void getConexionIreport() {
        try{
            //Obtener numero IP del servidor
            hp = new Helpers();
            File algun_archivo = new File("Host.txt");
            String IP=hp.readFiles(algun_archivo);
            String user = "postgres";
            String password = "sp1r4ls4c";
            String bd = "asistencia"; 
            String url = "Jdbc:postgresql://"+IP+"/"+bd;

            Class.forName("org.postgresql.Driver"); 
            conn = DriverManager.getConnection(url,user,password);
            if (conn != null){
               System.out.println("Conexion establecida");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
 */
    public void SelectReport(int op){
        
        switch(op) {
            case 1:ReportAsistencia(); break;
            case 2:ReportAsistencia_Log(); break;
            default:break;
        }
    }

    public void ReportAsistencia(){
    try{
        getConexion();
        conn = getConetion();
        File archivo = new  File("reportes/example.jasper");
        System.out.println("Cargando desde: " + archivo);
        if(archivo == null){
            System.out.println("No se encuentra el archivo.");
            System.exit(2);

        }
        JasperReport masterReport= null;
        try {
            masterReport= (JasperReport) JRLoader.loadObject(archivo);
        } catch (JRException e) {
            System.out.println("Error cargando el reporte maestro: " + e.getMessage());
        }
        //int codigo=Integer.parseInt(id);

        Map parametro= new HashMap();
        //parametro.put("idpers","");
        //parametro.put("Fecha_Inicial","");
        //parametro.put("Fecha_Final","");
        //parametro.put("Horario","");

        JasperPrint jasperPrint= JasperFillManager.fillReport(masterReport,parametro,conn);
        JasperViewer jviewer= new JasperViewer(jasperPrint,false);
        jviewer.setTitle("Asistencia Personal");
        jviewer.setVisible(true);
        closeConexion();
    } catch (Exception j) {
        System.out.println("Mensaje de Error:"+j);
    }
  }
    private void ReportAsistencia_Log() {
        try{
        Date date = new Date(0000-00-00);    
        getConexion();
        conn = getConetion();
        File archivo = new  File("src/reportes/justificaciones.jasper");
        System.out.println("Cargando desde: " + archivo);
        if(archivo == null){
            System.out.println("No se encuentra el archivo.");
            System.exit(2);

        }
        JasperReport masterReport= null;
        try{
            masterReport= (JasperReport) JRLoader.loadObject(archivo);
        } catch (JRException e) {
            System.out.println("Error cargando el reporte maestro: " + e.getMessage());
            System.exit(3);
        }
        //int codigo=Integer.parseInt(id);

        Map parametro= new HashMap();
        parametro.put("fin", date.valueOf("2013-02-22"));
        parametro.put("id", 4);
        parametro.put("inicio", date.valueOf("2013-02-14"));
        
        
        JasperPrint jasperPrint= JasperFillManager.fillReport(masterReport,parametro,conn);
        JasperViewer jviewer= new JasperViewer(jasperPrint,false);
        jviewer.setTitle("Asistencia Personal");
        jviewer.setVisible(true);
        closeConexion();
    } catch (Exception j) {
        System.out.println("Mensaje de Error:"+j);
    }
    }
}
