
package Telas;

import controle.ControleAdm;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;

public class LoginADM extends javax.swing.JFrame {
    
    private final ControleAdm controle;

    public LoginADM() {
        initComponents();
        controle = new ControleAdm(this);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldCPDLogin = new javax.swing.JFormattedTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jPasswordFieldSenhaLogin = new javax.swing.JPasswordField();
        jButtonLoginInicial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login ADM");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonLogin.setText("LOGIN");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        jLabel2.setText("CPD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 136, -1, -1));

        jLabel3.setText("SENHA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 210, -1, -1));

        jFormattedTextFieldCPDLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCPDLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldCPDLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 170, 223, -1));

        jLabelTitulo.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabelTitulo.setText("Administrador");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, 47));
        getContentPane().add(jPasswordFieldSenhaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 244, 223, -1));

        jButtonLoginInicial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonLoginInicial.setText("voltar");
        jButtonLoginInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLoginInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 80, 40));

        setSize(new java.awt.Dimension(816, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        CadastroItens telaCI = new CadastroItens();
        telaCI.setVisible(true);

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jFormattedTextFieldCPDLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPDLoginActionPerformed
        try {
            // TODO add your handling code here:
            controle.autenticarAdm();
        } catch (SQLException ex) {
            Logger.getLogger(LoginADM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jFormattedTextFieldCPDLoginActionPerformed

    private void jButtonLoginInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginInicialActionPerformed
        // TODO add your handling code here:
        Login telaLogin = new Login();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_jButtonLoginInicialActionPerformed

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
            java.util.logging.Logger.getLogger(LoginADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginADM().setVisible(true);
            }
        });
    }

    public JFormattedTextField getjFormattedTextFieldCPDLogin() {
        return jFormattedTextFieldCPDLogin;
    }

    public void setjFormattedTextFieldCPDLogin(JFormattedTextField jFormattedTextFieldCPDLogin) {
        this.jFormattedTextFieldCPDLogin = jFormattedTextFieldCPDLogin;
    }

    public JPasswordField getjPasswordFieldSenhaLogin() {
        return jPasswordFieldSenhaLogin;
    }

    public void setjPasswordFieldSenhaLogin(JPasswordField jPasswordFieldSenhaLogin) {
        this.jPasswordFieldSenhaLogin = jPasswordFieldSenhaLogin;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonLoginInicial;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPDLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPasswordField jPasswordFieldSenhaLogin;
    // End of variables declaration//GEN-END:variables

}
