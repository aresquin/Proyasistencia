
package Utilitarios;

import java.io.*;
import java.util.Calendar;
import javax.swing.JTable;


public class Helpers{
    
    /*
     * Metodo optener contenido de un archivo de texto
     */
    public String readFiles(File lectura) throws IOException{
        
    BufferedReader entrada = new BufferedReader(new FileReader(lectura));
    String renglon;
    String Str_Texto="";
        while ((renglon = entrada.readLine()) != null)
        {
            for (int i = 0; i < renglon.length(); i++)
            {
               Str_Texto += String.valueOf(renglon.charAt(i)); 
            }
        }
    return Str_Texto;
    }
    
    /*
     * Obtener la fecha actual
     */
    public String getDateNow(){
        String date;
        
        Calendar c = Calendar.getInstance();
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH));
        String annio = Integer.toString(c.get(Calendar.YEAR));
        date = annio+"-"+mes+"-"+dia;
                
        return date;
    }
     /*
     * Tamaño de columnas de los Jtable
     */
    public void setWidthJtable(JTable tblDatos, int[] args){
        for(int i=0;i<args.length;i++){
            tblDatos.getColumnModel().getColumn(i).setPreferredWidth(args[i]);
            tblDatos.getColumnModel().getColumn(i).setMinWidth(args[i]);
            tblDatos.getColumnModel().getColumn(i).setMaxWidth(args[i]);    
        }
    }
     /*
     * Formateo de fecha
     */
    
    
    public String getFormatDate(String fecha)
    {
        String date;
        String [] arrayfecha = fecha.split("-");
        date = arrayfecha[2]+"-"+arrayfecha[1]+"-"+arrayfecha[0];
        return date;
    }
     
    /*
     * Encriptador
     */
    
    
    /*
     * Desencriptador
     */
            
}
