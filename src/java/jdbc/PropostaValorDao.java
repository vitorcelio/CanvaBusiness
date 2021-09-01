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
public class PropostaValorDao {

    private Connection conn;

    public PropostaValorDao(Connection conn) {
        this.conn =  conn;
    }

    public void salvar(Canva propostaValor) throws SQLException {
        String sql = "insert into proposta_de_valor(descricao) values(?)";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setString(1, propostaValor.getDescricao());
            ps.execute();
        }
    }

    public void remover(Long id) throws SQLException {
        String sql = "delete from proposta_de_valor where id=?";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            ps.executeUpdate();
        }
    }

    public void atualizar(Canva propostaValor) throws SQLException {
        String sql = "update proposta_de_valor set descricao=? where id=?";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setString(1, propostaValor.getDescricao());
            ps.setLong(2, propostaValor.getId());
            ps.executeUpdate();
        }
    }

    public List<Canva> getPropostaValor() throws SQLException {
        String sql = "select * from proposta_de_valor";
        List<Canva> lista = new ArrayList<>();
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Canva propostaValor = new Canva();
                    propostaValor.setId(rs.getLong("id"));
                    propostaValor.setDescricao(rs.getString("descricao"));
                    lista.add(propostaValor);
                }
            }
            return lista;
        }
    }
}
