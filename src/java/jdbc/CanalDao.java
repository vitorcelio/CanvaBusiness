/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Canva;

/**
 *
 * @author Vitor
 */
public class CanalDao {
    private Connection conn;
    
    public CanalDao(Connection conn){
        this.conn = conn;
    }
    
    public void salvar(Canva canal) throws SQLException{
        String sql = "insert into canais(descricao) values(?)";
        try(PreparedStatement ps = this.conn.prepareStatement(sql)){
            ps.setString(1, canal.getDescricao());
            ps.execute();
        }
    }
    
    public void remover(Long id) throws SQLException{
        String sql = "delete from canais where id=?";
        try(PreparedStatement ps = this.conn.prepareStatement(sql)){
            ps.setLong(1, id);
            ps.executeUpdate();
        }
    }
    
    public void atualizar(Canva canal) throws SQLException{
        String sql = "update canais set descricao=? where id=?";
        try(PreparedStatement ps = this.conn.prepareStatement(sql)){
            ps.setString(1, canal.getDescricao());
            ps.setLong(2, canal.getId());
            ps.executeUpdate();
        }
    }
    
    public List<Canva> getCanais() throws SQLException{
        String sql = "select * from canais";
        List<Canva> lista = new ArrayList<>();
        try(PreparedStatement ps = this.conn.prepareStatement(sql)){
            try(ResultSet rs = ps.executeQuery()){
                while(rs.next()){
                    Canva canal = new Canva();
                    canal.setId(rs.getLong("id"));
                    canal.setDescricao(rs.getString("descricao"));
                    lista.add(canal);
                }
            }
            return lista;
        }
    }
}
