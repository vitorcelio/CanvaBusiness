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
import jdbc.CanalDao;
import jdbc.ConnectionFactory;
import modelo.Canva;

/**
 *
 * @author Vitor
 */
public class AdicionarCanal implements Logica{

     @Override
     public String executa(HttpServletRequest request, HttpServletResponse response) throws SQLException {
          try(Connection conn = new ConnectionFactory().recuperarConexao()){
               String descricao = request.getParameter("descricao");
               
               Canva canal = new Canva();
               canal.setDescricao(descricao);
               
               CanalDao dao = new CanalDao(conn);
               if(descricao != null && !descricao.isEmpty()){
                    dao.salvar(canal);
                    return "redirect:canva?acao=Componentes";
               }
               return "forward:canal.jsp";
          }
     }
     
}
