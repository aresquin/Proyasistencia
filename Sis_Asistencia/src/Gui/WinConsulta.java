
package Gui;

import Appi.JExcel;
import Dao.ConsultaDAO;
import java.io.File;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

public class WinConsulta extends javax.swing.JInternalFrame {

    private DateFormat format;
    private Date date,date2;
    private Calendar calendar,calendar2;
    private JExcel xls;
    private String _error = "Gui_WinConsulta_";
    private ConsultaDAO consul;

    public WinConsulta() {
        initComponents();
        format = new SimpleDateFormat("dd-MM-yyyy");
        ChFechaIni.setDateFormat(format);
        ChFechaFin.setDateFormat(format);
        Lblidemp.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CboReport = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ChFechaFin = new datechooser.beans.DateChooserCombo();
        ChFechaIni = new datechooser.beans.DateChooserCombo();
        BtnConsultar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Lblidemp = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtblConsulta = new javax.swing.JTable();
        lblcant = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        medit = new javax.swing.JMenu();
        mitemclear = new javax.swing.JMenuItem();
        ItemExportar = new javax.swing.JMenuItem();
        mclose = new javax.swing.JMenu();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de reportes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Elija un reporte");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 31, -1, -1));

        CboReport.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Asistencia del personal", "Log de asistencia", "Justificaciones", "Totales" }));
        jPanel1.add(CboReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 31, 325, -1));

        jLabel2.setText("Fecha de termino");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel3.setText("Empleado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 75, -1, -1));

        jLabel4.setText("Fecha de inicio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        jPanel1.add(ChFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));
        jPanel1.add(ChFechaIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        BtnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/consulta.png"))); // NOI18N
        BtnConsultar.setText("Consultar");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, 40));

        TxtName.setEditable(false);
        jPanel1.add(TxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 73, 320, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/empleado.png"))); // NOI18N
        jLabel5.setText("Buscar");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));
        jPanel1.add(Lblidemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de resultados"));

        JtblConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JtblConsulta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblcant.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Total: ");

        medit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Editar.png"))); // NOI18N
        medit.setText("Editar");

        mitemclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mitemclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/limpiar.png"))); // NOI18N
        mitemclear.setText("Limpiar");
        medit.add(mitemclear);

        ItemExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/exportar.png"))); // NOI18N
        ItemExportar.setText("Exportar");
        ItemExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemExportarMousePressed(evt);
            }
        });
        medit.add(ItemExportar);

        jMenuBar1.add(medit);

        mclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Cerrar.png"))); // NOI18N
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)
                        .addGap(17, 17, 17)
                        .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        getAccessibleContext().setAccessibleParent(TxtName);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS = 0;
    }//GEN-LAST:event_mcloseMousePressed

    private void mcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcloseActionPerformed

    }//GEN-LAST:event_mcloseActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
         WinBuscarEmpleado objbus = new WinBuscarEmpleado();
        //objbus.setTitle(titulo);
        objbus.setResizable(true);
        objbus.setMaximizable(true);
        objbus.setIconifiable(true);
        objbus.setClosable(true);
        WinMdi.jdpContenedor.add(objbus);
        objbus.LblModulo.setText("1");
        objbus.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void ItemExportarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemExportarMousePressed
  try {
        JFileChooser Obj = new JFileChooser();
        xls = new JExcel();
        FileNameExtensionFilter filter;
        filter = new FileNameExtensionFilter("Excel xls", "xls", "xlsx");
        Obj.setFileFilter(filter);
        Obj.setDialogTitle("Guardar reporte");
        int seleccion = Obj.showSaveDialog(JtblConsulta);
        //Guardar
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = Obj.getSelectedFile();
            String filePath = fichero.getPath();
            if (!filePath.toLowerCase().endsWith(".xls")) {
                fichero = new File(filePath + ".xls");
            }
            boolean confirma;
            if ((fichero).exists()) {
                if(JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(this,"El fichero existe,deseas reemplazarlo?","Reemplazar",JOptionPane.YES_NO_OPTION));{
                    confirma=xls.ExportJtable(JtblConsulta, fichero, "Cargos");
                }
            } else {
                confirma=xls.ExportJtable(JtblConsulta, fichero, "Cargos");
            }
            if(confirma==true){
                JOptionPane.showMessageDialog(null, "El documento se grabo exitosamente","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "No se pudo grabar el documento", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    } catch(Exception e) {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error durante la exportacion del documento","Error",JOptionPane.ERROR_MESSAGE);
        System.out.println(_error + "Exportar :"+e);
    }
    }//GEN-LAST:event_ItemExportarMousePressed

    private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed
    consul =  new ConsultaDAO();     
    int op  =  CboReport.getSelectedIndex();
    String args[] = new String[4];
    switch(op) {
        case 0:
            consul.setTable("registro");
            args[0] = Lblidemp.getText();
            args[1] = ChFechaIni.getText();
            args[2] = ChFechaFin.getText();
            consul.findAsistencia(args);
            consul.gettabel(JtblConsulta, lblcant);
            consul.destroid_report();
            ;break;
        case 1:
            consul.setTable("registro_backlog");
            args[0] = Lblidemp.getText();
            args[1] = ChFechaIni.getText();
            args[2] = ChFechaFin.getText();
            consul.findAsistencia(args);
            ;break;
        case 2:
            ;break;
     }
    }//GEN-LAST:event_BtnConsultarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JComboBox CboReport;
    private datechooser.beans.DateChooserCombo ChFechaFin;
    private datechooser.beans.DateChooserCombo ChFechaIni;
    private javax.swing.JMenuItem ItemExportar;
    private javax.swing.JTable JtblConsulta;
    public static javax.swing.JLabel Lblidemp;
    public static final javax.swing.JTextField TxtName = new javax.swing.JTextField();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcant;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenuItem mitemclear;
    // End of variables declaration//GEN-END:variables
}
