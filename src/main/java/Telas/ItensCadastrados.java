
package Telas;

import Itens.ItemAchado;
import controle.ControleItens;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ItensCadastrados extends javax.swing.JFrame {
    
    private final ControleItens controle;
    
  
//listar itens
    public List<ItemAchado> ListarItens(){
        try{
            List<ItemAchado> listar = new ArrayList<ItemAchado>();
            
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projetoap", "postgres", "123");
            String sql = "select * from itemachado order by iditem asc";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                    ItemAchado item = new ItemAchado();
                    item.setIdItem(resultSet.getInt("iditem"));
                    item.setDescricao(resultSet.getString("descricao"));
                    item.setLocal(resultSet.getString("local"));
                    item.setDataAchado(resultSet.getString("data_achado"));
                    
                    listar.add(item);
            }
            return listar;
        }catch (SQLException ex) {
            throw new RuntimeException("erro");
        }
    }
    
    //metodo listar
    public void Listar(){
        List<ItemAchado> listadeitens = ListarItens();
        DefaultTableModel model = (DefaultTableModel)jTableItens.getModel();
        model.setNumRows(0);
        for(ItemAchado i: listadeitens){
            model.addRow(new Object[]{
                i.getIdItem(),
                i.getDescricao(),
                i.getLocal(),
                i.getDataAchado()
            });
        }
    }
    

    public ItensCadastrados() {
        initComponents();
        controle = new ControleItens(null,this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableItens = new javax.swing.JTable();
        jButtonRetirarItem = new javax.swing.JButton();
        jButtonBackLoginADM = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DESCRIÇÃO", "LOCAL", "DATA"
            }
        ));
        jTableItens.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTableItensComponentAdded(evt);
            }
        });
        jTableItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableItensMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableItens);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 310));

        jButtonRetirarItem.setText("RETIRAR");
        jButtonRetirarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetirarItemActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRetirarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 110, 30));

        jButtonBackLoginADM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonBackLoginADM.setText("voltar");
        jButtonBackLoginADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackLoginADMActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBackLoginADM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, 30));

        jLabel1.setText("ID ITEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        jTextFieldID.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 40, 40));

        setSize(new java.awt.Dimension(816, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableItensComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTableItensComponentAdded

    }//GEN-LAST:event_jTableItensComponentAdded

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            // listar dados na tabela
            Listar();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonBackLoginADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackLoginADMActionPerformed

        CadastroItens telaADM = new CadastroItens();
        telaADM.setVisible(true);
    }//GEN-LAST:event_jButtonBackLoginADMActionPerformed

    private void jTableItensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableItensMouseClicked
        //pegar id do item
        jTextFieldID.setText(jTableItens.getValueAt(jTableItens.getSelectedRow(),0).toString());
    }//GEN-LAST:event_jTableItensMouseClicked

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jButtonRetirarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetirarItemActionPerformed
        try {
            controle.retirarItem();
        } catch (SQLException ex) {
            Logger.getLogger(ItensCadastrados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonRetirarItemActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItensCadastrados().setVisible(true);
            }
        });
    }

    public JButton getjButtonRetirarItem() {
        return jButtonRetirarItem;
    }

    public void setjButtonRetirarItem(JButton jButtonRetirarItem) {
        this.jButtonRetirarItem = jButtonRetirarItem;
    }

    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    public void setjTextFieldID(JTextField jTextFieldID) {
        this.jTextFieldID = jTextFieldID;
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBackLoginADM;
    private javax.swing.JButton jButtonRetirarItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableItens;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
