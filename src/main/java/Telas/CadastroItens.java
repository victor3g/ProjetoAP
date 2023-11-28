
package Telas;

import controle.ControleItens;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CadastroItens extends javax.swing.JFrame {
   
    private final ControleItens controle;

    public CadastroItens() {
        initComponents();
        controle = new ControleItens(this,null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldLocal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDia = new javax.swing.JTextField();
        jTextFieldMes = new javax.swing.JTextField();
        jTextFieldAno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonItensCadastrados = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(746, 369));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 30));

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 740, 60));

        jLabel1.setText("DESCRIÇÃO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        getContentPane().add(jTextFieldLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 740, -1));

        jLabel2.setText("LOCAL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel3.setText("DATA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jTextFieldDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 30, -1));
        getContentPane().add(jTextFieldMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 30, -1));
        getContentPane().add(jTextFieldAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 100, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText(" /");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 20, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText(" /");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 20, 20));

        jButtonItensCadastrados.setText("ITENS CADASTRADOS");
        jButtonItensCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonItensCadastradosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonItensCadastrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 180, 30));

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel4.setText("Achados e Perdidos - Cadastrar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 390, 47));

        setSize(new java.awt.Dimension(816, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            controle.registarItem();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroItens.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiaActionPerformed
        
    }//GEN-LAST:event_jTextFieldDiaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
    }//GEN-LAST:event_formWindowOpened

    private void jButtonItensCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonItensCadastradosActionPerformed
        
        ItensCadastrados telaControleADM = new ItensCadastrados();
        telaControleADM.setVisible(true);
    }//GEN-LAST:event_jButtonItensCadastradosActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroItens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroItens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroItens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroItens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new CadastroItens().setVisible(true);
            }
        });
    }

    public JTextArea getjTextAreaDescricao() {
        return jTextAreaDescricao;
    }

    public void setjTextAreaDescricao(JTextArea jTextAreaDescricao) {
        this.jTextAreaDescricao = jTextAreaDescricao;
    }

    public JTextField getjTextFieldAno() {
        return jTextFieldAno;
    }

    public void setjTextFieldAno(JTextField jTextFieldAno) {
        this.jTextFieldAno = jTextFieldAno;
    }

    public JTextField getjTextFieldDia() {
        return jTextFieldDia;
    }

    public void setjTextFieldDia(JTextField jTextFieldDia) {
        this.jTextFieldDia = jTextFieldDia;
    }

    public JTextField getjTextFieldLocal() {
        return jTextFieldLocal;
    }

    public void setjTextFieldLocal(JTextField jTextFieldLocal) {
        this.jTextFieldLocal = jTextFieldLocal;
    }

    public JTextField getjTextFieldMes() {
        return jTextFieldMes;
    }

    public void setjTextFieldMes(JTextField jTextFieldMes) {
        this.jTextFieldMes = jTextFieldMes;
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonItensCadastrados;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldDia;
    private javax.swing.JTextField jTextFieldLocal;
    private javax.swing.JTextField jTextFieldMes;
    // End of variables declaration//GEN-END:variables
}
