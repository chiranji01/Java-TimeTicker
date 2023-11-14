/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Model.Stock;
import Controller.StockController;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Pamud
 */
public class ManageStock extends javax.swing.JFrame {

    Stock sob;
    StockController scob;
    
    public ManageStock() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tfWatchID.setBackground(new java.awt.Color(0,0,0,1));
        tfPartID.setBackground(new java.awt.Color(0,0,0,1));
        tfQuantity.setBackground(new java.awt.Color(0,0,0,1));
        tfUnitPrice.setBackground(new java.awt.Color(0,0,0,1));
        
        scob = new StockController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfPartID = new javax.swing.JTextField();
        tfWatchID = new javax.swing.JTextField();
        tfQuantity = new javax.swing.JTextField();
        tfUnitPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnCancle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tfPartID.setBackground(new java.awt.Color(67, 16, 16));
        tfPartID.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tfPartID.setForeground(new java.awt.Color(255, 255, 255));
        tfPartID.setText("Part ID");
        tfPartID.setBorder(null);
        tfPartID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfPartIDMouseClicked(evt);
            }
        });
        tfPartID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPartIDActionPerformed(evt);
            }
        });
        getContentPane().add(tfPartID);
        tfPartID.setBounds(350, 160, 530, 30);

        tfWatchID.setBackground(new java.awt.Color(67, 16, 16));
        tfWatchID.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tfWatchID.setForeground(new java.awt.Color(255, 255, 255));
        tfWatchID.setText("Watch ID");
        tfWatchID.setBorder(null);
        tfWatchID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfWatchIDMouseClicked(evt);
            }
        });
        getContentPane().add(tfWatchID);
        tfWatchID.setBounds(350, 250, 530, 30);

        tfQuantity.setBackground(new java.awt.Color(67, 16, 16));
        tfQuantity.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tfQuantity.setForeground(new java.awt.Color(255, 255, 255));
        tfQuantity.setText("Quantity");
        tfQuantity.setBorder(null);
        tfQuantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfQuantityMouseClicked(evt);
            }
        });
        getContentPane().add(tfQuantity);
        tfQuantity.setBounds(350, 340, 530, 30);

        tfUnitPrice.setBackground(new java.awt.Color(67, 16, 16));
        tfUnitPrice.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tfUnitPrice.setForeground(new java.awt.Color(255, 255, 255));
        tfUnitPrice.setText("Unit Price");
        tfUnitPrice.setBorder(null);
        tfUnitPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUnitPriceMouseClicked(evt);
            }
        });
        getContentPane().add(tfUnitPrice);
        tfUnitPrice.setBounds(350, 430, 530, 30);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Stock");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 40, 220, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/ManageStock.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        btnAdd.setText("jButton1");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(445, 572, 150, 30);

        btnUpdate.setText("jButton2");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(685, 572, 160, 40);

        btnRemove.setText("jButton3");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove);
        btnRemove.setBounds(925, 572, 160, 40);

        btnCancle.setText("jButton1");
        btnCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancle);
        btnCancle.setBounds(190, 562, 170, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPartIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPartIDMouseClicked
        tfPartID.setText(null);
    }//GEN-LAST:event_tfPartIDMouseClicked

    private void tfPartIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPartIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPartIDActionPerformed

    private void tfWatchIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfWatchIDMouseClicked
        tfWatchID.setText(null);
    }//GEN-LAST:event_tfWatchIDMouseClicked

    private void tfQuantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfQuantityMouseClicked
        tfQuantity.setText(null);
    }//GEN-LAST:event_tfQuantityMouseClicked

    private void tfUnitPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUnitPriceMouseClicked
        tfUnitPrice.setText(null);
    }//GEN-LAST:event_tfUnitPriceMouseClicked

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed
        new Dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancleActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String PartID = tfPartID.getText();
        String WatchID = tfWatchID.getText();
        String Quantity = tfQuantity.getText();
        String UnitPrice = tfUnitPrice.getText();

        sob = scob.AddStock(PartID, WatchID, UnitPrice, Quantity);
        boolean result = scob.AddtoDB(sob);
        if(result){
            JOptionPane.showMessageDialog(rootPane, "Successfully added to the database","info",1 );
        }else{
            JOptionPane.showMessageDialog(rootPane, "Adding to the databse unsuccessfull","Error",0 );
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String PartID = tfPartID.getText();
        String WatchID = tfWatchID.getText();
        String Quantity = tfQuantity.getText();
        String UnitPrice = tfUnitPrice.getText();
        
        boolean result = scob.UpdateDB(PartID, WatchID, UnitPrice, Quantity);
        if(result){
            JOptionPane.showMessageDialog(rootPane, "Successfully updated the database","info",1 );
        }else{
            JOptionPane.showMessageDialog(rootPane, "updating the databse unsuccessfull","Error",0 );
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        String PartID = tfPartID.getText();
        
        tfQuantity.setText(null);
        tfUnitPrice.setText(null);
        tfWatchID.setText(null);
        
        boolean result = scob.DeleteDB(PartID);
        if(result){
            JOptionPane.showMessageDialog(rootPane, "Successfully deleted from the database","info",1 );
        }else{
            JOptionPane.showMessageDialog(rootPane, "deleting from the databse unsuccessfull","Error",0 );
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(ManageStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfPartID;
    private javax.swing.JTextField tfQuantity;
    private javax.swing.JTextField tfUnitPrice;
    private javax.swing.JTextField tfWatchID;
    // End of variables declaration//GEN-END:variables
}
