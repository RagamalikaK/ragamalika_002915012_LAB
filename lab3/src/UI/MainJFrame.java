/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.Application;


/**
 *
 * @author nayankarumuri
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    Application application;
    
    public MainJFrame() {
        initComponents();
        
        this.application=new Application();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        CreateObsBtn = new javax.swing.JButton();
        ViewVitalBtn = new javax.swing.JButton();
        MedCatalogBtn = new javax.swing.JButton();
        AssignMedBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CreateObsBtn.setText("create observation");
        CreateObsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateObsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CreateObsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, -1));

        ViewVitalBtn.setText("View Vital Sign History");
        ViewVitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewVitalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ViewVitalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        MedCatalogBtn.setText("Medicine Catalog");
        MedCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedCatalogBtnActionPerformed(evt);
            }
        });
        jPanel1.add(MedCatalogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 180, -1));

        AssignMedBtn.setText("Assign Medicine");
        AssignMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignMedBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AssignMedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 180, -1));

        jSplitPane1.setLeftComponent(jPanel1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateObsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateObsBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new CreateJPanel(this.application));    
    }//GEN-LAST:event_CreateObsBtnActionPerformed

    private void ViewVitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewVitalBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ViewJPanel(this.application));
    }//GEN-LAST:event_ViewVitalBtnActionPerformed

    private void MedCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedCatalogBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new CatalogJpanel(this.application));
    }//GEN-LAST:event_MedCatalogBtnActionPerformed

    private void AssignMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignMedBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new MedicineAssignJPanel(this.application));
    }//GEN-LAST:event_AssignMedBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignMedBtn;
    private javax.swing.JButton CreateObsBtn;
    private javax.swing.JButton MedCatalogBtn;
    private javax.swing.JButton ViewVitalBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
