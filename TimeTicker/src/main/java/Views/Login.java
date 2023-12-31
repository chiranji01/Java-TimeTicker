/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import java.sql.ResultSet;
import DataBaseConnection.DBconnector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Pamud
 */
public class Login extends javax.swing.JFrame {

    ResultSet rs;
    DBconnector dbc;
    
    public Login() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        dbc = DBconnector.getSingleInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chkShowPass = new javax.swing.JCheckBox();
        tfUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        chkShowPass.setForeground(new java.awt.Color(255, 255, 255));
        chkShowPass.setText("Show Password");
        chkShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPassActionPerformed(evt);
            }
        });
        getContentPane().add(chkShowPass);
        chkShowPass.setBounds(1010, 440, 140, 20);

        tfUserName.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        tfUserName.setForeground(new java.awt.Color(165, 135, 210));
        tfUserName.setText("Enter User Name");
        tfUserName.setToolTipText("");
        tfUserName.setBorder(null);
        tfUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearDef(evt);
            }
        });
        tfUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserNameActionPerformed(evt);
            }
        });
        getContentPane().add(tfUserName);
        tfUserName.setBounds(860, 260, 170, 22);

        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(860, 362, 220, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/Login Reg.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(780, 522, 170, 40);

        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister);
        btnRegister.setBounds(990, 522, 150, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserNameActionPerformed
        
    }//GEN-LAST:event_tfUserNameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        try {
            String UserName = tfUserName.getText();
        String Password = String.valueOf(txtPassword.getPassword());
        rs = dbc.ShowExecuteQuary("select * from employee where EmpName = '"+UserName+"'  ");
        if (rs.next()){
            String pwd = rs.getString("Password");
            if(pwd.equals(Password)){
                JOptionPane.showMessageDialog(rootPane, "Login Successfully", "info", 1);
                new Dashboard().setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Password Not Found", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Username Not Found", "Error", 0);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Employee Dosen't exist", "Error", 0);
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        LoginReg lr = new LoginReg();
        lr.show();
        dispose();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void clearDef(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearDef
        tfUserName.setText(null);
        tfUserName.setFont(new java.awt.Font("Segoe UI", 0, 18));
        tfUserName.setForeground(new java.awt.Color(111, 48, 208));
        
    }//GEN-LAST:event_clearDef

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void chkShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPassActionPerformed
        if(chkShowPass.isSelected()){
            txtPassword.setEchoChar((char)0);
        }
        else{
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_chkShowPassActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox chkShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfUserName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
