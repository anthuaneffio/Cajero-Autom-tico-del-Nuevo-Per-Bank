/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cajero;

/**
 *
 * @author effio
 */
public class Saldo extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Saldo.class.getName());

    /**
     * Creates new form Saldo
     */
    public Saldo() {
        initComponents();
        lblsaldo.setText(
        "S/. " + String.format("%.2f", Login.clienteActual.getSaldo())
    );
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnvolver = new javax.swing.JButton();
        lblsaldo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Stencil", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setText("CONSULTA DE SALDO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 410, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Saldo Actual");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, -1));

        btnvolver.setBackground(new java.awt.Color(0, 204, 255));
        btnvolver.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        btnvolver.setForeground(new java.awt.Color(255, 0, 51));
        btnvolver.setText("VOLVER");
        btnvolver.addActionListener(this::btnvolverActionPerformed);
        getContentPane().add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 180, 80));

        lblsaldo.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        lblsaldo.setForeground(new java.awt.Color(51, 255, 0));
        getContentPane().add(lblsaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 210, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajero/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 700, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
menu.setVisible(true);
this.dispose();
     
    }//GEN-LAST:event_btnvolverActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Saldo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblsaldo;
    // End of variables declaration//GEN-END:variables
}
