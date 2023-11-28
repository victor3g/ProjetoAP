
package controle;

import Itens.ItemAchado;
import Telas.*;
import dao.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControleItens {
    
    private CadastroItens tela;
    private ItensCadastrados tela2;

    public ControleItens(CadastroItens tela, ItensCadastrados tela2) {
        this.tela = tela;
        this.tela2 = tela2;
    }
    
    public void registarItem() throws SQLException{
        
        String diaString = tela.getjTextFieldDia().getText();
        String mesString = tela.getjTextFieldMes().getText();
        String anoString = tela.getjTextFieldAno().getText();
        
        String dataString = ""+diaString+"-"+mesString+"-"+anoString+"";
        
        String descricao = tela.getjTextAreaDescricao().getText();
        String local = tela.getjTextFieldLocal().getText();
        String data_achado = dataString;
        
        if (descricao.isEmpty() || local.isEmpty() || diaString.isEmpty() || mesString.isEmpty() || anoString.isEmpty()) {
        JOptionPane.showMessageDialog(null, "TODOS OS CAMPOS SÃO OBRIGATORIOS!");
        return;
        }
                
        ItemAchado salvarItem = new ItemAchado(descricao, local, data_achado);
        
        try{
        Connection conexao = new Conexao().getConnection();
        ItensDAO itensDao = new ItensDAO(conexao);
        itensDao.insert(salvarItem);
        
        JOptionPane.showMessageDialog(null, "CADASTRO FEITO COM SUCESSO!");        
        }catch (SQLException ex){
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void retirarItem()throws SQLException{
        
        String idString = tela2.getjTextFieldID().getText();
        //converter para int
        int iditem = Integer.parseInt(idString);
        
        ItemAchado removerItem = new ItemAchado(iditem);
        
        try{
        Connection conexao = new Conexao().getConnection();
        ItensDAO itensDao = new ItensDAO(conexao);
        itensDao.delete(removerItem);
        
        JOptionPane.showMessageDialog(null, "RETIRADO COM SUCESSO!");        
        }catch (SQLException ex){
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
