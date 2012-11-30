
package Gui;

import javax.swing.*;
import Utilitarios.Validators;

public class WinMdi extends javax.swing.JFrame {
    Validators val;
    /*
     * Creacion del WinMdi
     */
    public WinMdi() {
        initComponents();
        this.setSize(877, 474);
        jdpContenedor.setSize(877, 474);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpContenedor = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuasi = new javax.swing.JMenu();
        menujus = new javax.swing.JMenu();
        menuemp = new javax.swing.JMenu();
        menuhor = new javax.swing.JMenu();
        menuvis = new javax.swing.JMenu();
        menudis = new javax.swing.JMenu();
        SubmenuCrit = new javax.swing.JMenu();
        JmitemArea = new javax.swing.JMenuItem();
        Jmitememp = new javax.swing.JMenuItem();
        JmitemTipo = new javax.swing.JMenuItem();
        JmitemRoles = new javax.swing.JMenuItem();
        JmitemUsu = new javax.swing.JMenuItem();
        JmitemDis = new javax.swing.JMenuItem();
        JmiBackup = new javax.swing.JMenuItem();
        Jmitemhelp = new javax.swing.JMenuItem();
        menurep = new javax.swing.JMenu();
        menusal = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuasi.setText("Asistencia");
        menuasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuasiMousePressed(evt);
            }
        });
        jMenuBar1.add(menuasi);

        menujus.setText("Justificaciones");
        menujus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menujusMousePressed(evt);
            }
        });
        jMenuBar1.add(menujus);

        menuemp.setText("Empleados");
        menuemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuempMousePressed(evt);
            }
        });
        jMenuBar1.add(menuemp);

        menuhor.setText("Horarios");
        menuhor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuhorMousePressed(evt);
            }
        });
        jMenuBar1.add(menuhor);

        menuvis.setText("Consulta");
        menuvis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuvisMousePressed(evt);
            }
        });
        jMenuBar1.add(menuvis);

        menudis.setText("Configuraciones");

        SubmenuCrit.setText("Criterios");

        JmitemArea.setText("Area");
        JmitemArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemAreaMousePressed(evt);
            }
        });
        SubmenuCrit.add(JmitemArea);

        Jmitememp.setText("Empresa");
        Jmitememp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemempMousePressed(evt);
            }
        });
        SubmenuCrit.add(Jmitememp);

        JmitemTipo.setText("Tipo empleado");
        JmitemTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemTipoMousePressed(evt);
            }
        });
        SubmenuCrit.add(JmitemTipo);

        JmitemRoles.setText("Roles");
        JmitemRoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemRolesMousePressed(evt);
            }
        });
        SubmenuCrit.add(JmitemRoles);

        menudis.add(SubmenuCrit);

        JmitemUsu.setText("Usuarios");
        JmitemUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemUsuMousePressed(evt);
            }
        });
        menudis.add(JmitemUsu);

        JmitemDis.setText("Diseño");
        JmitemDis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemDisMousePressed(evt);
            }
        });
        menudis.add(JmitemDis);

        JmiBackup.setText("Backup");
        menudis.add(JmiBackup);

        Jmitemhelp.setText("Help");
        menudis.add(Jmitemhelp);

        jMenuBar1.add(menudis);

        menurep.setText("Reportes");
        menurep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menurepMousePressed(evt);
            }
        });
        jMenuBar1.add(menurep);

        menusal.setText("Salir");
        menusal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menusalMousePressed(evt);
            }
        });
        jMenuBar1.add(menusal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menusalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menusalMousePressed
    WinLogin objusuario;
    int i;
    i= JOptionPane.showConfirmDialog(null,"¿Desea salir del sistema?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
     if(i==0){
        objusuario=new WinLogin();
        objusuario.show();
        objusuario.setLocationRelativeTo(this);
        this.dispose();
        }
    }//GEN-LAST:event_menusalMousePressed

    private void JmitemAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemAreaMousePressed

       WinArea objArea= new WinArea();
       val = new Validators();
    
       objArea.setResizable(true);
       objArea.setMaximizable(true);
       objArea.setIconifiable(true);
       //obj_Asis.setClosable(true);
       jdpContenedor.add(objArea);
       if(val.EntryForms()){
            objArea.setVisible(true);
       } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
       }
       
    }//GEN-LAST:event_JmitemAreaMousePressed

    private void menuasiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuasiMousePressed
        WinAsistencia objAsis = new WinAsistencia();
        val = new Validators();
        objAsis.setResizable(true);
        objAsis.setMaximizable(true);
        objAsis.setIconifiable(true);
        jdpContenedor.add(objAsis);
        
       if(val.EntryForms()){
            objAsis.setVisible(true);
       } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
       }
    }//GEN-LAST:event_menuasiMousePressed

    private void menujusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menujusMousePressed
        WinJustificacion objJus = new WinJustificacion();
        val = new Validators();
        objJus.setResizable(true);
        objJus.setMaximizable(true);
        objJus.setIconifiable(true);
        
        jdpContenedor.add(objJus);
       if(val.EntryForms()){
            objJus.setVisible(true);
       } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
       }
        
    }//GEN-LAST:event_menujusMousePressed

    private void menuhorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuhorMousePressed
        WinHorarios objHor = new WinHorarios();
        val = new Validators();
        objHor.setResizable(true);
        objHor.setMaximizable(true);
        objHor.setIconifiable(true);
        jdpContenedor.add(objHor);
       if(val.EntryForms()){
            objHor.setVisible(true);
       } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
       }

    }//GEN-LAST:event_menuhorMousePressed

    private void menuvisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuvisMousePressed
        WinConsulta objCon = new WinConsulta();
        val = new Validators();
        objCon.setResizable(true);
        objCon.setMaximizable(true);
        objCon.setIconifiable(true);
        jdpContenedor.add(objCon);
        if(val.EntryForms()){
            objCon.setVisible(true);
        } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
       }
        
    }//GEN-LAST:event_menuvisMousePressed

    private void menurepMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menurepMousePressed
        WinReportes objRep = new WinReportes();
        val = new Validators();
        objRep.setResizable(true);
        objRep.setMaximizable(true);
        objRep.setIconifiable(true);
        jdpContenedor.add(objRep);
        if(val.EntryForms()){
            objRep.setVisible(true);
       } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
       }
          
    }//GEN-LAST:event_menurepMousePressed

    private void JmitemempMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemempMousePressed
       WinEmpresa objEmpresa= new WinEmpresa();
       val = new Validators();
       objEmpresa.setResizable(true);
       objEmpresa.setMaximizable(true);
       objEmpresa.setIconifiable(true);
       //obj_Asis.setClosable(true);
       jdpContenedor.add(objEmpresa);
       if(val.EntryForms()){
            objEmpresa.setVisible(true);
       } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
       }
       
    }//GEN-LAST:event_JmitemempMousePressed

    private void JmitemRolesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemRolesMousePressed
        WinRoles objsucursal= new WinRoles();
        val = new Validators();
        objsucursal.setResizable(true);
        objsucursal.setMaximizable(true);
        objsucursal.setIconifiable(true);
        WinMdi.jdpContenedor.add(objsucursal);
        if(val.EntryForms()){
            objsucursal.setVisible(true);
        } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
        }
        
    }//GEN-LAST:event_JmitemRolesMousePressed

    private void JmitemTipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemTipoMousePressed
        WinTipo_Empleado objtipo= new WinTipo_Empleado();
        val = new Validators();
        objtipo.setResizable(true);
        objtipo.setMaximizable(true);
        objtipo.setIconifiable(true);
        WinMdi.jdpContenedor.add(objtipo);

        objtipo.setVisible(true);
    }//GEN-LAST:event_JmitemTipoMousePressed

    private void JmitemDisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemDisMousePressed
        WinArea objUsu= new WinArea();
        val = new Validators();
        objUsu.setResizable(true);
        objUsu.setMaximizable(true);
        objUsu.setIconifiable(true);
        //obj_Asis.setClosable(true);
        jdpContenedor.add(objUsu);
        if(val.EntryForms()){
            objUsu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
        }

    }//GEN-LAST:event_JmitemDisMousePressed

    private void JmitemUsuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemUsuMousePressed
        WinUsuario objUsu= new WinUsuario();
        val = new Validators();
        objUsu.setResizable(true);
        objUsu.setMaximizable(true);
        objUsu.setIconifiable(true);
        //obj_Asis.setClosable(true);
        jdpContenedor.add(objUsu);
        if(val.EntryForms()){
            objUsu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
        }
    }//GEN-LAST:event_JmitemUsuMousePressed

    private void menuempMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuempMousePressed
        WinEmpleado objEmp= new WinEmpleado();
        val = new Validators();
        objEmp.setResizable(true);
        objEmp.setMaximizable(true);
        objEmp.setIconifiable(true);
        //obj_Asis.setClosable(true);
        jdpContenedor.add(objEmp);
        if(val.EntryForms()){
            objEmp.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
        }
    }//GEN-LAST:event_menuempMousePressed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WinMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WinMdi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JmiBackup;
    private javax.swing.JMenuItem JmitemArea;
    private javax.swing.JMenuItem JmitemDis;
    private javax.swing.JMenuItem JmitemRoles;
    private javax.swing.JMenuItem JmitemTipo;
    private javax.swing.JMenuItem JmitemUsu;
    private javax.swing.JMenuItem Jmitememp;
    private javax.swing.JMenuItem Jmitemhelp;
    private javax.swing.JMenu SubmenuCrit;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JDesktopPane jdpContenedor;
    private javax.swing.JMenu menuasi;
    private javax.swing.JMenu menudis;
    private javax.swing.JMenu menuemp;
    private javax.swing.JMenu menuhor;
    private javax.swing.JMenu menujus;
    private javax.swing.JMenu menurep;
    private javax.swing.JMenu menusal;
    private javax.swing.JMenu menuvis;
    // End of variables declaration//GEN-END:variables
}
