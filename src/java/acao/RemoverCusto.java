/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acao;

import controlador.Logica;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.ConnectionFactory;
import jdbc.CustoDao;

/**
 *
 * @author Vitor
 */
public class RemoverCusto implements Logica {

     @Override
     public String executa(HttpServletRequest request, HttpServletResponse response) throws SQLException {
          try (Connection conn = new ConnectionFactory().recuperarConexao()) {
               String idParametro = request.getParameter("id");
               Long id = Long.valueOf(idParametro);
               
               CustoDao custo = new CustoDao(conn);
               custo.remover(id);
               return "redirect:canva?acao=Componentes";
          }
     }

}
