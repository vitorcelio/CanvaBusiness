/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acao;

import controlador.Logica;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.BancoDeDados;
import modelo.Usuario;

/**
 *
 * @author Vitor
 */
public class Login implements Logica {

     @Override
     public String executa(HttpServletRequest request, HttpServletResponse response) throws SQLException {
          String login = request.getParameter("usuario");
          String senha = request.getParameter("senha");

          BancoDeDados dao = new BancoDeDados();
          Usuario usuario = dao.existeUsuario(login, senha);

          if (usuario != null) {
               HttpSession sessao = request.getSession();
               sessao.setAttribute("user", usuario);
               return "redirect:canva?acao=Inicio";
          } else {
               return "redirect:canva?acao=LoginForm";
          }
     }

}
