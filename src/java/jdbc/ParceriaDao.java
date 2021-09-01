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
public class ParceriaDao {

    private Connection conn;

    public ParceriaDao(Connection conn) {
        this.conn = conn;
    }

    public void salvar(Canva parceria) throws SQLException {
        String sql = "insert into parcerias_chave(descricao) values (?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, parceria.getDescricao());
            ps.execute();
        }
    }

    public void remover(Long id) throws SQLException {
        String sql = "delete from parcerias_chave where id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            ps.executeUpdate();
        }
    }

    public void atualizar(Canva parceria) throws SQLException {
        String sql = "update parcerias_chave set descricao=? where id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, parceria.getDescricao());
            ps.setLong(2, parceria.getId());
            ps.executeUpdate();
        }
    }

    public List<Canva> getParcerias() throws SQLException {
        String sql = "SELECT * FROM parcerias_chave";
        List<Canva> lista = new ArrayList<>();
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Canva parceria = new Canva();
                    parceria.setId(rs.getLong("id"));
                    parceria.setDescricao(rs.getString("descricao"));
                    lista.add(parceria);
                }
            }
            return lista;
        }
    }

}
