
package Javabeans;

public class Empleado {
    private int idemp;
    private String nombres;
    private String apellidos;
    private String dni;
    private String telefono;
    private String retiro;
    private int huella;
    private String fmodificacion;
    private String fcreacion;
    private int idare;
    private int idtip;
    private int idest;
    private int idcar;
    private int idempr;
    
    /* Constructor final
     */
    public Empleado(int idemp, String nombres, String apellidos, String dni, String telefono, String retiro, int huella, String fmodificacion, String fcreacion, int idare, int idtip, int idest, int idcar, int idempr) {
        this.idemp = idemp;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.retiro = retiro;
        this.huella = huella;
        this.fmodificacion = fmodificacion;
        this.fcreacion = fcreacion;
        this.idare = idare;
        this.idtip = idtip;
        this.idest = idest;
        this.idcar = idcar;
        this.idempr = idempr;
         
    }
    
    
    /* Constructor por omisión
     */
    public Empleado() {
    }

    /**
     * @return the idemp
     */
    public int getIdemp() {
        return idemp;
    }

    /**
     * @param idemp the idemp to set
     */
    public void setIdemp(int idemp) {
        this.idemp = idemp;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the retiro
     */
    public String getRetiro() {
        return retiro;
    }

    /**
     * @param retiro the retiro to set
     */
    public void setRetiro(String retiro) {
        this.retiro = retiro;
    }

    /**
     * @return the huella
     */
    public int getHuella() {
        return huella;
    }

    /**
     * @param huella the huella to set
     */
    public void setHuella(int huella) {
        this.huella = huella;
    }

    /**
     * @return the fmodificacion
     */
    public String getFmodificacion() {
        return fmodificacion;
    }

    /**
     * @param fmodificacion the fmodificacion to set
     */
    public void setFmodificacion(String fmodificacion) {
        this.fmodificacion = fmodificacion;
    }

    /**
     * @return the fcreacion
     */
    public String getFcreacion() {
        return fcreacion;
    }

    /**
     * @param fcreacion the fcreacion to set
     */
    public void setFcreacion(String fcreacion) {
        this.fcreacion = fcreacion;
    }

    /**
     * @return the idare
     */
    public int getIdare() {
        return idare;
    }

    /**
     * @param idare the idare to set
     */
    public void setIdare(int idare) {
        this.idare = idare;
    }

    /**
     * @return the idtip
     */
    public int getIdtip() {
        return idtip;
    }

    /**
     * @param idtip the idtip to set
     */
    public void setIdtip(int idtip) {
        this.idtip = idtip;
    }

    /**
     * @return the idest
     */
    public int getIdest() {
        return idest;
    }

    /**
     * @param idest the idest to set
     */
    public void setIdest(int idest) {
        this.idest = idest;
    }

    /**
     * @return the idcar
     */
    public int getIdcar() {
        return idcar;
    }

    /**
     * @param idcar the idcar to set
     */
    public void setIdcar(int idcar) {
        this.idcar = idcar;
    }

    /**
     * @return the idempr
     */
    public int getIdempr() {
        return idempr;
    }

    /**
     * @param idempr the idempr to set
     */
    public void setIdempr(int idempr) {
        this.idempr = idempr;
    }
    
}
