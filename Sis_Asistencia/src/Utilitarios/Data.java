package Utilitarios;


public class Data {
    //MDI
    public String G_MAIN_WIDTH;                     //Tamaño de MDI
    public String G_MAIN_HEIGHT;                    //Tamaño de MDI
    public String G_STATES[] = new String[2];       //Valores de los estados para formularios
    public String G_BOOLEAN[] = new String[2];      //Valores de los estados para la base de datos
    public static String G_EXCLUDE[] = new String[1];      //Datos excluidos para la actualizacion de registros
    
    public Data()
    {
        
        G_MAIN_WIDTH = "";
        G_MAIN_HEIGHT = "";
        
        G_STATES[0]="Inactivo";
        G_STATES[1]="Activo";
        
        G_BOOLEAN[0]="false";
        G_BOOLEAN[1]="true";
        
        G_EXCLUDE[0]="created";
    }
    
}
