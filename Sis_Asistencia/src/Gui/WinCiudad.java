
package Gui;

import Dao.CiudadDAO;
import Javabeans.Ciudad;
import Utilitarios.Config;
import Utilitarios.Query;
import Utilitarios.Validators;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class WinCiudad extends javax.swing.JInternalFrame {
    
    private CiudadDAO objciudad;
    private Ciudad ciudad;
    private Query qs;
    private Config cg;
    private Validators val;
    private String _error = "Gui_WinCiudad_";
    
    public WinCiudad() {
        initComponents();
        cargaForm();
    }
    
    public void cargaForm(){
        try {
            objciudad = new CiudadDAO();
            qs = new Query();
            objciudad.getTableAll(tblciudad);
        } catch (Exception e) {
            System.out.println(_error+"_CargaForm:" + e);
        }
    }
    
    public void cleanBox(){
        lblId.setText("");
        txtName.setText("");
        txtFilter.setText("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtFilter = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblciudad = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mfile = new javax.swing.JMenu();
        mitemregister = new javax.swing.JMenuItem();
        mitemupdate = new javax.swing.JMenuItem();
        mitemdelete = new javax.swing.JMenuItem();
        medit = new javax.swing.JMenu();
        mitemclear = new javax.swing.JMenuItem();
        mclose = new javax.swing.JMenu();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda de ciudades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        jLabel6.setText("Ciudad");

        btnFind.setText("Ok");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        tblciudad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblciudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblciudadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblciudad);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFind))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnFind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, 210));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles de la ciudad"));

        jLabel1.setText("Ciudad");

        jLabel4.setText("Id");

        lblId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(51, 51, 51)
                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtName))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 12, -1, -1));

        mfile.setText("Archivo");

        mitemregister.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mitemregister.setText("Registrar");
        mitemregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemregisterMousePressed(evt);
            }
        });
        mfile.add(mitemregister);

        mitemupdate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mitemupdate.setText("Actualizar");
        mitemupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemupdateMousePressed(evt);
            }
        });
        mfile.add(mitemupdate);

        mitemdelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mitemdelete.setText("Eliminar");
        mitemdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemdeleteMousePressed(evt);
            }
        });
        mfile.add(mitemdelete);

        jMenuBar1.add(mfile);

        medit.setText("Edit");

        mitemclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mitemclear.setText("Limpiar");
        mitemclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemclearMousePressed(evt);
            }
        });
        medit.add(mitemclear);

        jMenuBar1.add(medit);

        mclose.setText("Cerrar");
        mclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mcloseMousePressed(evt);
            }
        });
        mclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcloseActionPerformed(evt);
            }
        });
        jMenuBar1.add(mclose);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String name = txtFilter.getText();
        objciudad = new CiudadDAO();
        objciudad.find(name, tblciudad);
    }//GEN-LAST:event_btnFindActionPerformed

    private void tblciudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblciudadMouseClicked
        int fsel;
        fsel= this.tblciudad.getSelectedRow();
        if(fsel==-1){

        }
        else{
            try{
                ciudad = new Ciudad();
                DefaultTableModel m = new DefaultTableModel();
                m = (DefaultTableModel) this.tblciudad.getModel();
                String idciu = String.valueOf(m.getValueAt(fsel, 0));
                lblId.setText(idciu);
                ciudad = objciudad.getValues(Integer.parseInt(idciu));
                txtName.setText(ciudad.getName());

            }
            catch(Exception e){
                System.out.println(_error+"_Tblciudad:"+e);
            }

        }
    }//GEN-LAST:event_tblciudadMouseClicked

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemregisterMousePressed
        try{
        val = new Validators("ciudad");    
        Object[] datos = {txtName.getText()};
        Object[] tipos={2};
        if(val.validar(datos,tipos)){ 
            String name = txtName.getText();
            objciudad = new CiudadDAO();
            int i = objciudad.save(name);
            if (i == 0) {
                JOptionPane.showInputDialog(null,"No se pudo grabar datos");
            }
            else {
                objciudad.getTableAll(tblciudad);
                cleanBox();
                JOptionPane.showMessageDialog(null,"Nueva ciudad registrada");
            }
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
        }catch(Exception e){
            System.out.println(_error+"_Register:"+e);
        }
    }//GEN-LAST:event_mitemregisterMousePressed

    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed
        try{
        val = new Validators("ciudad");    
        Object[] datos = {txtName.getText(),lblId.getText()};
        Object[] tipos={2,0};
        if(val.validar(datos,tipos)){ 
            int id = Integer.valueOf(lblId.getText());
            String name = txtName.getText();
            objciudad = new CiudadDAO();
            System.out.println("ID: "+id);
            int i = objciudad.update(id,name);
            if (i == 0) {

                JOptionPane.showMessageDialog(null, "No se pudo actualizar datos");
            }
            else {
                objciudad.getTableAll(tblciudad);
                cleanBox();
                JOptionPane.showMessageDialog(null, "ciudad actualizadas");
            }
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
        }catch(Exception e){
            System.out.println(_error+"_Update:"+e);
        }
    }//GEN-LAST:event_mitemupdateMousePressed

    private void mitemdeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemdeleteMousePressed
        try{
        val = new Validators("ciudad");    
        Object[] datos = {lblId.getText()};
        Object[] tipos = {};
        if(val.validar(datos,tipos)){
            int i;      
            i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);

            if(i==0) {    
                int id = Integer.valueOf(lblId.getText());

                objciudad = new CiudadDAO();
                i = objciudad.delete(id);
                if(i==0) {
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar la ciudad");
                }
                else {
                    objciudad.getTableAll(tblciudad);
                    cleanBox();
                    JOptionPane.showMessageDialog(null,"Ciudad eliminada");
                }
            }
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
        }catch(Exception e){
            System.out.println(_error+"_Delete:"+e);
        }
    }//GEN-LAST:event_mitemdeleteMousePressed

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_mcloseMousePressed

    private void mcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcloseActionPerformed

    }//GEN-LAST:event_mcloseActionPerformed

    private void mitemclearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemclearMousePressed
        cleanBox();
    }//GEN-LAST:event_mitemclearMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JMenuItem mitemclear;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemregister;
    private javax.swing.JMenuItem mitemupdate;
    private javax.swing.JTable tblciudad;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
