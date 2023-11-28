
package Telas;

import controle.ControleLogin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;


public class Login extends javax.swing.JFrame {
    
    private final ControleLogin controle;
    
    public Login() {
        initComponents();
        controle = new ControleLogin(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldCPDLogin = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordFieldSenhaLogin = new javax.swing.JPasswordField();
        jButtonCadastro = new javax.swing.JButton();
        jButtonADM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonLogin.setText("LOGIN");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 320, -1, -1));

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

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel4.setText("Achados e Perdidos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 51, -1, 47));
        getContentPane().add(jPasswordFieldSenhaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 244, 223, -1));

        jButtonCadastro.setText("CADASTRO");
        jButtonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        jButtonADM.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jButtonADM.setText("?");
        jButtonADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADMActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonADM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 40, 40));

        setSize(new java.awt.Dimension(816, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldCPDLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPDLoginActionPerformed
        
    }//GEN-LAST:event_jFormattedTextFieldCPDLoginActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        try {
            controle.autenticar();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroActionPerformed
        Cadastro telaCadastro = new Cadastro();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_jButtonCadastroActionPerformed

    private void jButtonADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADMActionPerformed
        
        LoginADM telaLoginADM = new LoginADM();
        telaLoginADM.setVisible(true);
    }//GEN-LAST:event_jButtonADMActionPerformed

    public static void main(String args[]) {
     
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
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
    private javax.swing.JButton jButtonADM;
    private javax.swing.JButton jButtonCadastro;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPDLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordFieldSenhaLogin;
    // End of variables declaration//GEN-END:variables
}
