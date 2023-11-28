package dao;

import Telas.*;
import Usuario.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdmDAO {
    
    private final Connection conexao;

    public AdmDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public boolean existeCPDeSenha(Administrador adm) throws SQLException {
        
        String sql = "select * from adm where cpd = ? and senha = ?";
        
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, adm.getCPD());
        statement.setString(2, adm.getSenha());
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
       
        return resultSet.next();
        
    }
    
}
