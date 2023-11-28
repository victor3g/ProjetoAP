
package controle;

import Telas.*;
import Usuario.*;
import dao.*;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControleAdm {
    
    private LoginADM tela;

    public ControleAdm(LoginADM tela) {
        this.tela = tela;
    }

    public void autenticarAdm() throws SQLException{
        
        //buscar usuario
        String cpd = tela.getjFormattedTextFieldCPDLogin().getText();
        String senha = tela.getjPasswordFieldSenhaLogin().getText();
        
        Administrador autenticarAdm = new Administrador(cpd, senha);
        
        //verificar existencia
        Connection conexao = new Conexao().getConnection();
        AdmDAO admDao = new AdmDAO(conexao);
        
        boolean existe = admDao.existeCPDeSenha(autenticarAdm);
        
        //caso sim
        
        if(existe){
        Pesquisa telaPesquisa = new Pesquisa();
        telaPesquisa.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(tela, "USUARIO OU SENHA INVALIDOS!");
        }
    }  
    
}
