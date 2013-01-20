package Utilitarios;


public class Data {
    //MDI

    public String G_MAIN_WIDTH;                     //Tamaño de MDI
    public String G_MAIN_HEIGHT;                    //Tamaño de MDI
    public String G_STATES[] = new String[2];       //Valores de los estados para formularios
    public String G_BOOLEAN[] = new String[2];      //Valores de los estados para la base de datos
    public String G_TYPEHOR[] = new String[4];      //Valores de los estados para la base de datos
    public static String G_EXCLUDE[] = new String[1];      //Datos excluidos para la actualizacion de registros
    public String G_AREA[] = new String[3];
    public String G_DIAS[] = new String[8];
    public String G_TITULOS[]= new String[27];
    public String TYPEDATE[]= new String[2];
    public int DIMENTION[]= new int[9];
    public String G_TIPOH[]= new String[3];
    public String G_TIPOREG[]= new String[3];
    public String G_TIPOEXTRA[] = new String[2];
    public String G_MODULOS[] = new String[7];
    
    public Data()
    {
        
        G_MAIN_WIDTH = "";
        G_MAIN_HEIGHT = "";
        
        G_TIPOREG[1]="Entrada";
        G_TIPOREG[2]="Salida";
        
        G_STATES[0]="Inactivo";
        G_STATES[1]="Activo";
        
        G_BOOLEAN[0]="false";
        G_BOOLEAN[1]="true";
        
        G_AREA[0]="PRODUCCION";
        G_AREA[1]="ADMINISTRACION";
        G_AREA[2]="SISTEMAS";
        
        G_TYPEHOR[1]="Full time";
        G_TYPEHOR[2]="Part time";
        G_TYPEHOR[3]="Night time";
        
        G_EXCLUDE[0]="created";
        
        G_DIAS[1]="Lunes";
        G_DIAS[2]="Martes";
        G_DIAS[3]="MIercoles";
        G_DIAS[4]="JUeves";
        G_DIAS[5]="Viernes";
        G_DIAS[6]="Sabado";
        G_DIAS[7]="Domingo";
        
        G_TITULOS[0]="Area";
        G_TITULOS[1]="Empresa";
        G_TITULOS[2]="Tipo de Empleado";
        G_TITULOS[3]="Moneda";
        G_TITULOS[4]="Roles";
        G_TITULOS[5]="Ciudad";
        G_TITULOS[6]="Estado de Empleado";
        G_TITULOS[7]="Modulos";
        G_TITULOS[8]="Tipo de justificacion";
        G_TITULOS[9]="Area: Cargo";
        G_TITULOS[10]="Empresa: Sucursal";
        G_TITULOS[11]="Empresa: Dias no laborables";
        G_TITULOS[12]="Roles: Permisos";
        G_TITULOS[13]="Usuario";
        G_TITULOS[14]="Reportes";
        G_TITULOS[15]="Consultas";
        G_TITULOS[16]="Horarios";
        G_TITULOS[17]="Empleado";
        G_TITULOS[18]="Empleado: Horarios";
        G_TITULOS[19]="Empleado: Salarios";
        G_TITULOS[20]="Empleado: Vacaciones";
        G_TITULOS[21]="Empleado: Extra-descuento";
        G_TITULOS[22]="Justificaciones";
        G_TITULOS[23]="Asistencia";
        G_TITULOS[24]="Login";
        G_TITULOS[25]="Sistema de Asistencia";
        G_TITULOS[26]="Recuperar Contraseña";
        
        TYPEDATE[0]="String";
        TYPEDATE[1]="integer";
        
        DIMENTION[0]=8;//dni,telefono
        DIMENTION[1]=10;//ruc,simbol
        DIMENTION[2]=15;//recibo,ipcliente
        DIMENTION[3]=30;//nombre -->area,cargo,ciudad,empresa,estadoemp,modulos,moneda,permisos,roles,sucursal,tipoempleado,tipohorario,tiporeg
        DIMENTION[4]=30;//username,pass
        DIMENTION[5]=50;//nombre -->empleado,horarios,tipojustificaciones
        DIMENTION[6]=50;//apellidos,ubicacion,direccion,correo
        DIMENTION[7]=150;//motivo
        DIMENTION[8]=200;//nombre -->exception
        
        G_TIPOH[1]="Trabajo";
        G_TIPOH[2]="Refrigerio";
        
        G_TIPOEXTRA[0]="Extra";
        G_TIPOEXTRA[1]="Descuento";

        G_MODULOS[0] = "Asistencia";
        G_MODULOS[1] = "Justificaciones";
        G_MODULOS[2] = "Empleados";
        G_MODULOS[3] = "Horarios";
        G_MODULOS[4] = "Consulta";
        G_MODULOS[5] = "Configuraciones";
        G_MODULOS[6] = "Reportes";

    }
    
}
