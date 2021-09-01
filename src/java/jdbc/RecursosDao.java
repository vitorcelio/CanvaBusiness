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
public class RecursosDao {

    private Connection conn;

    public RecursosDao(Connection conn) {
        this.conn = conn;
    }

    public void salvar(Canva recursos) throws SQLException {
        String sql = "insert into recursos_chave(descricao) values (?)";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setString(1, recursos.getDescricao());
            ps.execute();
        }
    }

    public void remover(Long id) throws SQLException {
        String sql = "delete from recursos_chave where id=?";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            ps.executeUpdate();
        }
    }
    
    public void atualizar(Canva recursos) throws SQLException{
        String sql = "update recursos_chave set descricao=? where id=?";
        try(PreparedStatement ps = this.conn.prepareStatement(sql)){
            ps.setString(1, recursos.getDescricao());
            ps.setLong(2, recursos.getId());
            ps.executeUpdate();
        }
    }
    
    public List<Canva> getRecursosChave() throws SQLException{
        String sql = "select * from recursos_chave";
        List<Canva> lista = new ArrayList<>();
        try(PreparedStatement ps = this.conn.prepareStatement(sql)){
            try(ResultSet rs = ps.executeQuery()){
                while(rs.next()){
                    Canva recursos = new Canva();
                    recursos.setId(rs.getLong("id"));
                    recursos.setDescricao(rs.getString("descricao"));
                    lista.add(recursos);
                }
            }
            return lista;
        }
    }
}