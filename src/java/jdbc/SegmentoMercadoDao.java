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
public class SegmentoMercadoDao {

    private Connection conn;

    public SegmentoMercadoDao(Connection conn) {
        this.conn = conn;
    }

    public void salvar(Canva segmento) throws SQLException {
        String sql = "insert into segmentos_mercado(descricao) values(?)";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setString(1, segmento.getDescricao());
            ps.execute();
        }
    }

    public void remover(Long id) throws SQLException {
        String sql = "delete from segmentos_mercado where id=?";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            ps.executeUpdate();
        }
    }

    public void atualizar(Canva segmento) throws SQLException {
        String sql = "update segmentos_mercado set descricao=? where id=?";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setString(1, segmento.getDescricao());
            ps.setLong(2, segmento.getId());
            ps.executeUpdate();
        }
    }

    public List<Canva> getSegmentos() throws SQLException {
        String sql = "select * from segmentos_mercado";
        List<Canva> lista = new ArrayList<>();
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Canva segmento = new Canva();
                    segmento.setId(rs.getLong("id"));
                    segmento.setDescricao(rs.getString("descricao"));
                    lista.add(segmento);
                }
            }
            return lista;
        }
    }
}