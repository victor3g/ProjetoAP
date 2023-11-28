
package controle;

import Telas.*;
import Usuario.*;
import dao.*;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleLogin {
    
    private Login tela;

    public ControleLogin(Login tela) {
        this.tela = tela;
    }

    public void autenticar() throws SQLException{
        
        //buscar usuario
        String cpd = tela.getjFormattedTextFieldCPDLogin().getText();
        String senha = tela.getjPasswordFieldSenhaLogin().getText();
        
        Pessoa autenticarPessoa = new Pessoa(cpd, senha);
        
        //verificar existencia
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        
        boolean existe = usuarioDao.existeCPDeSenha(autenticarPessoa);
        
        //caso sim
        
        if(existe){
        Pesquisa telaPesquisa = new Pesquisa();
        telaPesquisa.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(tela, "USUARIO OU SENHA INVALIDOS!");
        }
    }
    
    
    
}
