/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acao;

import controlador.Logica;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.ConnectionFactory;
import jdbc.ParceriaDao;
import modelo.Canva;

/**
 *
 * @author Vitor
 */
public class AdicionarParceria implements Logica{

     @Override
     public String executa(HttpServletRequest request, HttpServletResponse response) throws SQLException {
          try(Connection conn = new ConnectionFactory().recuperarConexao()){
               String descricao = request.getParameter("descricao");
               
               Canva parceria = new Canva();
               parceria.setDescricao(descricao);
               
               ParceriaDao dao = new ParceriaDao(conn);
               if(descricao != null && !descricao.isEmpty()){
                    dao.salvar(parceria);
                    return "redirect:canva?acao=Componentes";
               }
               return "forward:parceria-chave.jsp";
          }
     }
     
}
