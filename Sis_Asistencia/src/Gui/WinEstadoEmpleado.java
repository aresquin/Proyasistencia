
package Gui;
import Dao.EstadoEmpleadoDAO;
import Javabeans.EstadoEmp;
import Utilitarios.Data;
import Utilitarios.Query;
import Utilitarios.Validators;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class WinEstadoEmpleado extends javax.swing.JInternalFrame {

    private EstadoEmpleadoDAO objest;
    private Query qs;
    private Data dt;
    private EstadoEmp est;
    private Validators val;
    private String _error="Gui_Estado_Empleado";
    public WinEstadoEmpleado() {
        initComponents();
        cargaForm();
    }
    /**
     * Formulario para el mantenimiento de las areas de la empresa.
     */
    public void cargaForm(){
        try {
            objest = new EstadoEmpleadoDAO();
            qs = new Query();
            objest.getTableAll(tblest, lblcant);
        } catch (Exception e) {
            System.out.println(_error+"_CargaForm:"+e);
        }
    }        
    public void cleanBox(){
        lblId.setText("");
        txtName.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlListado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblest = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblcant = new javax.swing.JLabel();
        PnlDatos = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitemRegistrar = new javax.swing.JMenuItem();
        mitemUpdate = new javax.swing.JMenuItem();
        jmitemDelete = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        pnlListado.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado"));

        tblest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblestMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblest);

        jLabel5.setText("Total: ");

        lblcant.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlListadoLayout = new javax.swing.GroupLayout(pnlListado);
        pnlListado.setLayout(pnlListadoLayout);
        pnlListadoLayout.setHorizontalGroup(
            pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnlListadoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(17, 17, 17)
                        .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 64, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlListadoLayout.setVerticalGroup(
            pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de los estados (empleados)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        jLabel1.setText("Id");

        jLabel2.setText("Nombre");

        lblId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PnlDatosLayout = new javax.swing.GroupLayout(PnlDatos);
        PnlDatos.setLayout(PnlDatosLayout);
        PnlDatosLayout.setHorizontalGroup(
            PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDatosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName)
                    .addGroup(PnlDatosLayout.createSequentialGroup()
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 107, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlDatosLayout.setVerticalGroup(
            PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDatosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDatosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))
                    .addGroup(PnlDatosLayout.createSequentialGroup()
                        .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(86, 86, 86))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Archivo.png"))); // NOI18N
        jMenu1.setText("Archivo");

        mitemRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/registrar.png"))); // NOI18N
        mitemRegistrar.setText("Registrar");
        mitemRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemRegistrarMousePressed(evt);
            }
        });
        jMenu1.add(mitemRegistrar);

        mitemUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/actualizar.png"))); // NOI18N
        mitemUpdate.setText("Actualizar");
        mitemUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemUpdateMousePressed(evt);
            }
        });
        jMenu1.add(mitemUpdate);

        jmitemDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/eliminar.png"))); // NOI18N
        jmitemDelete.setText("Eliminar");
        jmitemDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmitemDeleteMousePressed(evt);
            }
        });
        jMenu1.add(jmitemDelete);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Editar.png"))); // NOI18N
        jMenu2.setText("Edit");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/limpiar.png"))); // NOI18N
        jMenuItem4.setText("Limpiar");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem4MousePressed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Cerrar.png"))); // NOI18N
        jMenu3.setText("Cerrar");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu3MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pnlListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(PnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pnlListado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_jMenu3MousePressed

    private void mitemRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemRegistrarMousePressed
        try{
        val = new Validators("estadoemp");    
        Object[] datos = {txtName.getText()};
        Object[] tipos = {2};
        if(val.validar(datos,tipos)){    
            dt = new Data();
            String name = txtName.getText();
            objest = new EstadoEmpleadoDAO();
            int i = objest.save(name);
            if (i == 0) {
                JOptionPane.showInputDialog(null,"No se pudo grabar datos");
            }
            else {
                objest.getTableAll(tblest, lblcant);
                cleanBox();
                JOptionPane.showMessageDialog(null,"Nuevo estado registrado");      
            }
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
        }catch(Exception e){
            System.out.println(_error+"_Register:"+e);
        }
    }//GEN-LAST:event_mitemRegistrarMousePressed

    private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MousePressed
       cleanBox();
    }//GEN-LAST:event_jMenuItem4MousePressed

    private void mitemUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemUpdateMousePressed
        try{
        val = new Validators("estadoemp");    
        Object[] datos = {txtName.getText(),lblId.getText()};
        Object[] tipos = {2};
        if(val.validar(datos,tipos)){      
            if( !"".equals(lblId.getText())){
                dt = new Data();
                int id = Integer.parseInt(lblId.getText());
                String name = txtName.getText();
                objest = new EstadoEmpleadoDAO();
                int i = objest.update(id,name);
                if (i == 0) {
                    JOptionPane.showMessageDialog(null,"No se pudo actualizar el estado");
                }
                else {
                    objest.getTableAll(tblest, lblcant);
                    cleanBox();
                    JOptionPane.showMessageDialog(null,"Estado actualizado");      
                }       
            }
       }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
        }catch(Exception e){
            System.out.println(_error+"_Update:"+e);
        }
    }//GEN-LAST:event_mitemUpdateMousePressed

    private void jmitemDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmitemDeleteMousePressed
        try{
        val = new Validators("estadoemp");    
        Object[] datos = {lblId.getText()};
        Object[] tipos = {};
        if(val.validar(datos,tipos)){ 
             int i;      
             i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);

             if(i==0) {   
                if( !"".equals(lblId.getText())){    
                    dt = new Data();
                    int id = Integer.parseInt(lblId.getText());
                    objest = new EstadoEmpleadoDAO();
                    i = objest.delete(id);
                    if (i == 0) {
                        JOptionPane.showInputDialog(null,"No se pudo eliminar el estado");
                    }
                    else {
                        objest.getTableAll(tblest, lblcant);
                        cleanBox();
                        JOptionPane.showMessageDialog(null,"Estado eliminado");      
                    }
                }
             }
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
        }catch(Exception e){
            System.out.println(_error+"_Delete:"+e);
        }
    }//GEN-LAST:event_jmitemDeleteMousePressed

    private void tblestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblestMousePressed
       est = new EstadoEmp();
       int fsel;
       fsel = this.tblest.getSelectedRow();
       DefaultTableModel m = new DefaultTableModel();
       m = (DefaultTableModel) this.tblest.getModel();
       String idArea = String.valueOf(m.getValueAt(fsel, 0));
       //Asigando valores obtenidos
       lblId.setText(idArea);
       est = objest.getValues(Integer.parseInt(idArea));
       txtName.setText(est.getNombre());
    }//GEN-LAST:event_tblestMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmitemDelete;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblcant;
    private javax.swing.JMenuItem mitemRegistrar;
    private javax.swing.JMenuItem mitemUpdate;
    private javax.swing.JPanel pnlListado;
    private javax.swing.JTable tblest;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
