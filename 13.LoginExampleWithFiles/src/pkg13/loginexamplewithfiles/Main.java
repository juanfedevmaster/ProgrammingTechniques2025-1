/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package pkg13.loginexamplewithfiles;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import loginexample.Entities.EnumInternaFrames;

/**
 *
 * @author jufeq
 */
public class Main extends javax.swing.JFrame {
    
    // Attributes
    private InternalFrameLogin internalFrameLogin;
    private InternalFrameRegisterUser internalFrameRegisterUser;
    private InternalFrameAccessoriosV2 internalFrameAccessoriosV2;

    // Gets and Sets
    
    public InternalFrameAccessoriosV2 getInternalFrameAccesorios() {
        return internalFrameAccessoriosV2;
    }

    public void setInternalFrameAccesorios(InternalFrameAccessoriosV2 internalFrameAccessoriosV2) {
        this.internalFrameAccessoriosV2 = internalFrameAccessoriosV2;
    }
    
    public InternalFrameRegisterUser getInternalFrameRegisterUser() {
        return internalFrameRegisterUser;
    }

    public void setInternalFrameRegisterUser(InternalFrameRegisterUser internalFrameRegisterUser) {
        this.internalFrameRegisterUser = internalFrameRegisterUser;
    }
    
    
    public InternalFrameLogin getInternalFrameLogin() {
        return internalFrameLogin;
    }

    public void setInternalFrameLogin(InternalFrameLogin interlaFrameLogin) {
        this.internalFrameLogin = interlaFrameLogin;
    }

    public JMenu getHelpMenu() {
        return helpMenu;
    }

    public void setHelpMenu(JMenu helpMenu) {
        this.helpMenu = helpMenu;
    }
    
    
    
    /**
     * Creates new form Main
     */
    public Main() throws IOException, Exception {
        initComponents();
        InitianComponentsMain();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        functionsMenu = new javax.swing.JMenu();
        loginMenuItem = new javax.swing.JMenuItem();
        registerUserMenuItem = new javax.swing.JMenuItem();
        accesoriosMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        functionsMenu.setMnemonic('f');
        functionsMenu.setText("Functions");

        loginMenuItem.setMnemonic('o');
        loginMenuItem.setText("Login");
        loginMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginMenuItemActionPerformed(evt);
            }
        });
        functionsMenu.add(loginMenuItem);

        registerUserMenuItem.setMnemonic('o');
        registerUserMenuItem.setText("New user Login");
        registerUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerUserMenuItemActionPerformed(evt);
            }
        });
        functionsMenu.add(registerUserMenuItem);

        accesoriosMenuItem.setMnemonic('o');
        accesoriosMenuItem.setText("Accesorios");
        accesoriosMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accesoriosMenuItemActionPerformed(evt);
            }
        });
        functionsMenu.add(accesoriosMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        functionsMenu.add(exitMenuItem);

        menuBar.add(functionsMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");
        helpMenu.setEnabled(false);

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void loginMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginMenuItemActionPerformed
        if(internalFrameLogin == null){
            try {
                internalFrameLogin = new InternalFrameLogin();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(!internalFrameLogin.isVisible()){
            if(internalFrameLogin.isClosed()){
                desktopPane.add(internalFrameLogin);
            }
            internalFrameLogin.show();
            internalFrameLogin.setMdiParent(this);
        }
        
    }//GEN-LAST:event_loginMenuItemActionPerformed

    private void registerUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerUserMenuItemActionPerformed
        if(internalFrameRegisterUser == null){
            try {
                internalFrameRegisterUser = new InternalFrameRegisterUser();
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(!internalFrameRegisterUser.isVisible()){
            if(internalFrameRegisterUser.isClosed()){
                desktopPane.add(internalFrameRegisterUser);
            }
            internalFrameRegisterUser.show();
        }
    }//GEN-LAST:event_registerUserMenuItemActionPerformed

    private void accesoriosMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accesoriosMenuItemActionPerformed
        if(internalFrameAccessoriosV2 == null){
            try {
                internalFrameAccessoriosV2 = new InternalFrameAccessoriosV2();
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(!internalFrameAccessoriosV2.isVisible()){
            if(internalFrameAccessoriosV2.isClosed()){
                desktopPane.add(internalFrameAccessoriosV2);
            }
            internalFrameAccessoriosV2.show();
        }
    }//GEN-LAST:event_accesoriosMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void  InitianComponentsMain() throws IOException, Exception{
        if(internalFrameLogin == null){
            internalFrameLogin = new InternalFrameLogin();
        }
        
        if(internalFrameRegisterUser == null){
            internalFrameRegisterUser = new InternalFrameRegisterUser();
        }
        if(internalFrameAccessoriosV2 == null){
            internalFrameAccessoriosV2 = new InternalFrameAccessoriosV2();
        }
        
        desktopPane.add(internalFrameLogin);
        desktopPane.add(internalFrameRegisterUser);
        desktopPane.add(internalFrameAccessoriosV2);
    }
    
    private void abrirInternalFrame(JInternalFrame internalFrame, EnumInternaFrames enumFrames){
        if(internalFrame == null){
            try {
                
                switch (enumFrames) {
                    case InternalFrameAccesorios:
                        internalFrame = new InternalFrameAccesorios();
                        break;
                    case InternalFrameLogin:
                        internalFrame = new InternalFrameLogin();
                    case InternalFrameRegisterUser:
                        internalFrame = new InternalFrameRegisterUser();
                    default:
                        throw new AssertionError();
                }
                
                
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(!internalFrame.isVisible()){
            if(internalFrame.isClosed()){
                desktopPane.add(internalFrame);
            }
            internalFrame.show();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem accesoriosMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu functionsMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem loginMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem registerUserMenuItem;
    // End of variables declaration//GEN-END:variables
    
}
