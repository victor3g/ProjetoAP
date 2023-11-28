package controle;

import Telas.*;
import Usuario.*;
import dao.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControleCadastro {
    
    private Cadastro tela;

    public ControleCadastro(Cadastro tela) {
        this.tela = tela;
    }
    
    public void salvarUsuario(){
        
        String nome = tela.getjTextFieldNome().getText();
        String contato = tela.getjTextFieldContato().getText();
        String cpd = tela.getjTextFieldCPD().getText();
        String senha = tela.getjPasswordFieldSenha().getText();
        
        if (nome.isEmpty() || contato.isEmpty() || cpd.isEmpty() || senha.isEmpty()) {
        JOptionPane.showMessageDialog(null, "TODOS OS CAMPOS SÃO OBRIGATORIOS!");
        return;
        }
        
        Pessoa salvarPessoa = new Pessoa(nome, contato, cpd, senha);
        
        try {
        
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        usuarioDao.insert(salvarPessoa);
        
        
        JOptionPane.showMessageDialog(null, "CADASTRO FEITO COM SUCESSO!");
        
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}