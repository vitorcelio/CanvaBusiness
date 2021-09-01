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
public class CustoDao {

    private Connection conn;

    public CustoDao(Connection conn) {
        this.conn = conn;
    }

    public void salvar(Canva custo) throws SQLException {
        String sql = "insert into custos(descricao) values(?)";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setString(1, custo.getDescricao());
            ps.execute();
        }
    }

    public void remover(Long id) throws SQLException {
        String sql = "delete from custos where id=?";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            ps.executeUpdate();
        }
    }

    public void atualizar(Canva custo) throws SQLException {
        String sql = "update custos set descricao=? where id=?";
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            ps.setString(1, custo.getDescricao());
            ps.setLong(2, custo.getId());
            ps.executeUpdate();
        }
    }

    public List<Canva> getCustos() throws SQLException {
        String sql = "select * from custos";
        List<Canva> lista = new ArrayList<>();
        try (PreparedStatement ps = this.conn.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Canva custo = new Canva();
                    custo.setId(rs.getLong("id"));
                    custo.setDescricao(rs.getString("descricao"));
                    lista.add(custo);
                }
            }
            return lista;
        }
    }
}
