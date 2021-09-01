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
import jdbc.ConnectionFactory;
import jdbc.RelacoesDao;
import modelo.Canva;

/**
 *
 * @author Vitor
 */
public class MostrarRelacao implements Logica{

     @Override
     public String executa(HttpServletRequest request, HttpServletResponse response) throws SQLException {
          try(Connection conn = new ConnectionFactory().recuperarConexao()){
               RelacoesDao dao = new RelacoesDao(conn);
               
               List<Canva> lista = dao.getRelacoes();
               request.setAttribute("lista", lista);
               
               return "forward:relacao-cliente.jsp";
          }
     }
     
}
