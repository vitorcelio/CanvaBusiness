/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acao;

import controlador.Logica;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.AtividadeDao;
import jdbc.ConnectionFactory;
import jdbc.ParceriaDao;

/**
 *
 * @author Vitor
 */
public class RemoverAtividade implements Logica {

    @Override
    public String executa(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        try (Connection conn = new ConnectionFactory().recuperarConexao()) {
            String idParametro = request.getParameter("id");
            Long id = Long.valueOf(idParametro);

            AtividadeDao atividade = new AtividadeDao(conn);
            atividade.remover(id);
            return "redirect:canva?acao=Componentes";
        }
    }

}
