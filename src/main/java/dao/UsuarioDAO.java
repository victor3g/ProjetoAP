
package dao;

import Usuario.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
    private final Connection conexao;

    public UsuarioDAO(Connection conexao) {
        this.conexao = conexao;
    }
    
    public void insert(Pessoa pessoa) throws SQLException{
        
        String sql = "insert into pessoa (nome, contato, cpd, senha) values (?, ?, ?, ?)";
        
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, pessoa.getNome());
        statement.setString(2, pessoa.getContato());
        statement.setString(3, pessoa.getCPD());
        statement.setString(4, pessoa.getSenha());
        statement.execute();
        
    }
 

    public boolean existeCPDeSenha(Pessoa pessoa) throws SQLException {
        
        String sql = "select * from pessoa where cpd = ? and senha = ?";
        
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, pessoa.getCPD());
        statement.setString(2, pessoa.getSenha());
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
       
        return resultSet.next();
        
    }
    
}
