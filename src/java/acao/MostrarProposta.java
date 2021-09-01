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
import jdbc.PropostaValorDao;
import modelo.Canva;

/**
 *
 * @author Vitor
 */
public class MostrarProposta implements Logica{

     @Override
     public String executa(HttpServletRequest request, HttpServletResponse response) throws SQLException {
          try(Connection conn = new ConnectionFactory().recuperarConexao()){
               PropostaValorDao dao = new PropostaValorDao(conn);
               
               List<Canva> lista = dao.getPropostaValor();
               request.setAttribute("lista", lista);
               
               return "forward:proposta-valor.jsp";
          }
     }
     
}
