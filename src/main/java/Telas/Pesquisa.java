
package Telas;

import Itens.ItemAchado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Pesquisa extends javax.swing.JFrame {
    
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

    public Pesquisa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableItens = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel4.setText("Achados e Perdidos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, 47));

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableItens);
        if (jTableItens.getColumnModel().getColumnCount() > 0) {
            jTableItens.getColumnModel().getColumn(0).setResizable(false);
            jTableItens.getColumnModel().getColumn(1).setResizable(false);
            jTableItens.getColumnModel().getColumn(2).setResizable(false);
            jTableItens.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 780, 310));

        setSize(new java.awt.Dimension(816, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Listar();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableItens;
    // End of variables declaration//GEN-END:variables
}
