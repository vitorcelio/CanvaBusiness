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
public class FontesRendaDao {

    private Connection conn;

    public FontesRendaDao(Connection conn) {
        this.conn = conn;
    }

    public void salvar(Canva fonteRenda) throws SQLException {
        String sql = "insert into fontes_renda(descricao) values (?)";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setString(1, fonteRenda.getDescricao());
            ps.execute();
        }
    }

    public void remover(Long id) throws SQLException {
        String sql = "delete from fontes_renda where id=?";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            ps.executeUpdate();
        }
    }

    public void atualizar(Canva fonteRenda) throws SQLException {
        String sql = "update fontes_renda set descricao=? where id=?";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setString(1, fonteRenda.getDescricao());
            ps.setLong(2, fonteRenda.getId());
            ps.executeUpdate();
        }
    }

    public List<Canva> getFontesRenda() throws SQLException {
        String sql = "select * from fontes_renda";
        List<Canva> lista = new ArrayList<>();
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Canva fonteRenda = new Canva();
                    fonteRenda.setId(rs.getLong("id"));
                    fonteRenda.setDescricao(rs.getString("descricao"));
                    lista.add(fonteRenda);
                }
            }
            return lista;
        }
    }
}
