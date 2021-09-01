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
public class RelacoesDao {

    private Connection conn;

    public RelacoesDao(Connection conn) {
        this.conn = conn;
    }

    public void salvar(Canva relacoes) throws SQLException {
        String sql = "insert into relacoes_clientes(descricao) values (?)";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setString(1, relacoes.getDescricao());
            ps.execute();
        }
    }

    public void remover(Long id) throws SQLException {
        String sql = "delete from relacoes_clientes where id=?";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            ps.executeUpdate();
        }
    }

    public void atualizar(Canva relacoes) throws SQLException {
        String sql = "update relacoes_clientes set descricao=? where id=?";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setString(1, relacoes.getDescricao());
            ps.setLong(2, relacoes.getId());
            ps.executeUpdate();
        }
    }

    public List<Canva> getRelacoes() throws SQLException {
        String sql = "select * from relacoes_clientes";
        List<Canva> lista = new ArrayList<>();
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Canva relacoes = new Canva();
                    relacoes.setId(rs.getLong("id"));
                    relacoes.setDescricao(rs.getString("descricao"));
                    lista.add(relacoes);
                }
            }
            return lista;
        }
    }
}
