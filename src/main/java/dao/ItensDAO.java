
package dao;

import Itens.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItensDAO {
    private final Connection conexao;

    public ItensDAO(Connection conexao) {
        this.conexao = conexao;
    }
    
    
    public void insert(ItemAchado item) throws SQLException{
        
        String sql = "insert into itemachado (descricao, local, data_achado) values (?, ?, ?)";
        
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, item.getDescricao());
        statement.setString(2, item.getLocal());
        statement.setString(3, item.getDataAchado());
        statement.execute();
    }
    
    
    public void delete(ItemAchado item) throws SQLException{
        
        String sql = "delete from itemachado where iditem = ?";
        
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setInt(1, item.getIdItem());
        statement.execute();
        
    }
    
}
