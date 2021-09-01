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
public class AtividadeDao {

    private Connection conn;

    public AtividadeDao(Connection conn) {
        this.conn = conn;
    }

    public void salvar(Canva atividade) throws SQLException {
        String sql = "insert into atividades_chave(descricao) values(?)";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setString(1, atividade.getDescricao());
            ps.execute();
        }
    }

    public void remover(Long id) throws SQLException {
        String sql = "delete from atividades_chave where id=?";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            ps.executeUpdate();
        }
    }

    public void atualizar(Canva atividade) throws SQLException {
        String sql = "update atividades_chave set descricao=? where id=?";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setString(1, atividade.getDescricao());
            ps.setLong(2, atividade.getId());
            ps.executeUpdate();
        }
    }

    public List<Canva> getAtividades() throws SQLException {
        String sql = "select * from atividades_chave";
        List<Canva> lista = new ArrayList<>();
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Canva atividade = new Canva();
                    atividade.setId(rs.getLong("id"));
                    atividade.setDescricao(rs.getString("descricao"));
                    lista.add(atividade);
                }
            }
            return lista;
        }
    }
}
