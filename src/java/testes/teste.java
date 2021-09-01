/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import jdbc.ConnectionFactory;
import jdbc.ParceriaDao;
import jdbc.RecursosDao;
import modelo.Canva;

/**
 *
 * @author Vitor
 */
public class teste {

    public static void main(String[] args) throws SQLException {
        try (Connection conn = new ConnectionFactory().recuperarConexao()) {
            Canva recurso = new Canva("vitor");
            RecursosDao recursos = new RecursosDao(conn);
            recursos.salvar(recurso);
        }
    }
}
