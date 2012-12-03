
package Gui;


import Dao.EmpleadoDAO;
import Dao.UserDAO;
import Javabeans.Empleado;
import Utilitarios.Data;
import Utilitarios.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class WinEmpleado extends javax.swing.JInternalFrame {
    private EmpleadoDAO objempl;
    private Query qs;
    
    private Empleado modemp;
    private Data dt ;

    public WinEmpleado() {
        initComponents();
        cargaForm();
    }
    /**
     * Formulario para el mantenimiento de las areas de la empresa.
     */
    public void cargaForm(){
        try {
            objempl = new EmpleadoDAO();
            qs = new Query();
            qs.loadState(cboEstado,false);
            qs.loadChoice(cboEmpresa,"empresa","nombre");
            qs.loadChoice(cboArea,"area","nombre");
            qs.loadChoice(cboTipo,"tipoempleado","nombre");
            qs.loadChoice(cboSucursal,"sucursal","nombre");
            qs.loadChoice(cboCargo,"cargo","nombre");
            qs.loadChoice(cboAreaFilter,"area","nombre");
            objempl.getTableAll(tblEmpleado);

        } catch (Exception e) {
            System.out.println("Gui_Win_area: " + e);
        }
    }  
    public void cleanBox(){
        txtapellidos.setText("");
        txtdni.setText("");
        //txtdni.setm
        //txtnombres.setText("");
        txttelefono.setText("");
        cboArea.setSelectedIndex(0);
        cboCargo.setSelectedIndex(0);
        cboEmpresa.setSelectedIndex(0);
        cboEstado.setSelectedIndex(0);
        cboSucursal.setSelectedIndex(0);
        cboTipo.setSelectedIndex(0);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        pnlMantenimiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblempleado1 = new javax.swing.JLabel();
        cboEmpresa = new javax.swing.JComboBox();
        cboSucursal = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboArea = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cboCargo = new javax.swing.JComboBox();
        cboEstado = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cboAreaFilter = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitemregister = new javax.swing.JMenuItem();
        mitemupdate = new javax.swing.JMenuItem();
        mitemdelete = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        pnlMantenimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos personales"));
        pnlMantenimiento.setLayout(null);

        jLabel1.setText("Nombres");
        pnlMantenimiento.add(jLabel1);
        jLabel1.setBounds(10, 80, 64, 17);

        jLabel2.setText("Apellidos");
        pnlMantenimiento.add(jLabel2);
        jLabel2.setBounds(300, 90, 63, 17);
        pnlMantenimiento.add(txtnombres);
        txtnombres.setBounds(120, 80, 168, 27);

        jLabel4.setText("ID");
        pnlMantenimiento.add(jLabel4);
        jLabel4.setBounds(10, 30, 30, 29);
        pnlMantenimiento.add(txtapellidos);
        txtapellidos.setBounds(380, 80, 160, 27);

        jLabel7.setText("DNI");
        pnlMantenimiento.add(jLabel7);
        jLabel7.setBounds(10, 120, 100, 20);
        pnlMantenimiento.add(txtdni);
        txtdni.setBounds(120, 120, 160, 30);
        pnlMantenimiento.add(txttelefono);
        txttelefono.setBounds(380, 120, 160, 30);

        jLabel8.setText("Telefono");
        pnlMantenimiento.add(jLabel8);
        jLabel8.setBounds(300, 120, 70, 20);

        jLabel6.setText("Estado");
        pnlMantenimiento.add(jLabel6);
        jLabel6.setBounds(310, 40, 48, 17);

        lblempleado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMantenimiento.add(lblempleado1);
        lblempleado1.setBounds(120, 30, 70, 30);

        pnlMantenimiento.add(cboEmpresa);
        cboEmpresa.setBounds(120, 160, 160, 27);

        pnlMantenimiento.add(cboSucursal);
        cboSucursal.setBounds(380, 160, 160, 27);

        jLabel5.setText("Empresa");
        pnlMantenimiento.add(jLabel5);
        jLabel5.setBounds(10, 170, 70, 17);

        jLabel9.setText("Sucursal");
        pnlMantenimiento.add(jLabel9);
        jLabel9.setBounds(300, 170, 70, 17);

        jLabel10.setText("Area");
        pnlMantenimiento.add(jLabel10);
        jLabel10.setBounds(10, 210, 70, 17);

        pnlMantenimiento.add(cboArea);
        cboArea.setBounds(120, 200, 160, 27);

        jLabel11.setText("Cargo");
        pnlMantenimiento.add(jLabel11);
        jLabel11.setBounds(300, 210, 49, 17);

        pnlMantenimiento.add(cboCargo);
        cboCargo.setBounds(380, 200, 160, 27);

        pnlMantenimiento.add(cboEstado);
        cboEstado.setBounds(380, 40, 160, 27);

        jLabel12.setText("Tipo");
        pnlMantenimiento.add(jLabel12);
        jLabel12.setBounds(10, 250, 30, 17);

        pnlMantenimiento.add(cboTipo);
        cboTipo.setBounds(120, 240, 160, 27);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(1, 1, 1)));

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);

        jLabel3.setText("Area");

        jCheckBox1.setText("Activos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(cboAreaFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(jCheckBox1)
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboAreaFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        mitemregister.setText("Registrar");
        mitemregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemregisterMousePressed(evt);
            }
        });
        jMenu1.add(mitemregister);

        mitemupdate.setText("Actualizar");
        mitemupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemupdateMousePressed(evt);
            }
        });
        jMenu1.add(mitemupdate);

        mitemdelete.setText("Eliminar");
        mitemdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemdeleteMousePressed(evt);
            }
        });
        mitemdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemdeleteActionPerformed(evt);
            }
        });
        jMenu1.add(mitemdelete);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Horarios");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sueldos");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Vacaciones");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Cerrar");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(pnlMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemregisterMousePressed
        Data dt = new Data();
        String nombre = txtnombres.getText();
        String dni=txtdni.getText();
        String apellido=txtapellidos.getText();
        String telefono=txttelefono.getText();
        int  area = cboArea.getSelectedIndex();
        int cargo = cboCargo.getSelectedIndex();
        int tipo = cboTipo.getSelectedIndex();
        int sucursal = cboSucursal.getSelectedIndex();
        int empresa = cboEmpresa.getSelectedIndex();
        
        qs = new Query();
        //boolean estate = Boolean.valueOf(dt.G_BOOLEAN[cboEstado.getSelectedIndex()]);
        int estate=cboEstado.getSelectedIndex();
        //int rol = qs.idChoice("roles","nombre",String.valueOf(cboRol.getSelectedItem()));
       
        objempl = new EmpleadoDAO();
        int i = objempl.saveEmpleado(0,nombre,apellido,dni, telefono,area, tipo, estate,cargo,empresa,sucursal);
        if (i == 0) {
            JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
        }
        else {
            objempl.getTableAll(tblEmpleado);
            cleanBox();
            JOptionPane.showMessageDialog(null,"Nuevo usuario registrado");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_mitemregisterMousePressed

    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed
        Data dt = new Data();
        String nombre = txtnombres.getText();
        String dni=txtdni.getText();
        String apellido=txtapellidos.getText();
        String telefono=txttelefono.getText();
        int  area = cboArea.getSelectedIndex();
        int cargo = cboCargo.getSelectedIndex();
        int tipo = cboTipo.getSelectedIndex();
        int sucursal = cboSucursal.getSelectedIndex();
        int empresa = cboEmpresa.getSelectedIndex();
        
        qs = new Query();
        //boolean estate = Boolean.valueOf(dt.G_BOOLEAN[cboEstado.getSelectedIndex()]);
        int estate=cboEstado.getSelectedIndex();
        //int rol = qs.idChoice("roles","nombre",String.valueOf(cboRol.getSelectedItem()));
       
        objempl = new EmpleadoDAO();
        int i = objempl.updateEmpleado(0,nombre,apellido,dni, telefono,area, tipo, estate,cargo,empresa,sucursal);
        if (i == 0) {
            JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
        }
        else {
            objempl.getTableAll(tblEmpleado);
            cleanBox();
            JOptionPane.showMessageDialog(null,"Nuevo usuario actualizado");
        }     
    }//GEN-LAST:event_mitemupdateMousePressed

    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
     try {       int fsel;
                fsel = this.tblEmpleado.getSelectedRow();
                objempl = new EmpleadoDAO();
                DefaultTableModel m = new DefaultTableModel();
                m = (DefaultTableModel) this.tblEmpleado.getModel();
                String idEmp = String.valueOf(m.getValueAt(fsel, 0));
                
                //crear objeto modusu
                modemp = objempl.getValues(Integer.parseInt(idEmp));
                //Asigando valores obtenidos
                lblempleado1.setText(idEmp);
                txtnombres.setText(modemp.getNombres());
                txtapellidos.setText(modemp.getApellidos());
                txtdni.setText(modemp.getDni());
                txttelefono.setText(modemp.getTelefono());
                qs.loadChoiceDefault(cboCargo,"cargo","nombre",modemp.getIdcar());
                qs.loadState(cboEstado,Boolean.valueOf(""+modemp.getIdest()));
                }
            catch (Exception e) {
                System.out.println("Gui_Win_area: " + e);
            }     
    }//GEN-LAST:event_tblEmpleadoMouseClicked

    private void mitemdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemdeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mitemdeleteActionPerformed

    private void mitemdeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemdeleteMousePressed
     int id = Integer.valueOf(lblempleado1.getText());

        objempl = new EmpleadoDAO();
        int i = objempl.deleteEmpleado(id);
        if(i==0) {
            JOptionPane.showMessageDialog(null,"No se pudo eliminar el area");
        }
        else {
            objempl.getTableAll(tblEmpleado);
            cleanBox();
            JOptionPane.showMessageDialog(null,"Area eliminada");
        }  
    }//GEN-LAST:event_mitemdeleteMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboArea;
    private javax.swing.JComboBox cboAreaFilter;
    private javax.swing.JComboBox cboCargo;
    private javax.swing.JComboBox cboEmpresa;
    private javax.swing.JComboBox cboEstado;
    private javax.swing.JComboBox cboSucursal;
    private javax.swing.JComboBox cboTipo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblempleado1;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemregister;
    private javax.swing.JMenuItem mitemupdate;
    private javax.swing.JPanel pnlMantenimiento;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
