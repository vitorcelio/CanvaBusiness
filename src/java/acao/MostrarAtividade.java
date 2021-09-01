/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acao;

import controlador.Logica;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.AtividadeDao;
import jdbc.ConnectionFactory;
import modelo.Canva;

/**
 *
 * @author Vitor
 */
public class MostrarAtividade implements Logica {

     @Override
     public String executa(HttpServletRequest request, HttpServletResponse response) throws SQLException {
          try (Connection conn = new ConnectionFactory().recuperarConexao()) {
               AtividadeDao dao = new AtividadeDao(conn);
               
               List<Canva> lista = dao.getAtividades();
               request.setAttribute("lista", lista);
               
               return "forward:atividade-chave.jsp";
          }
     }

}
