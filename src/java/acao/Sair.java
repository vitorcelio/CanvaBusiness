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

/**
 *
 * @author Vitor
 */
public class Sair implements Logica {

     @Override
     public String executa(HttpServletRequest request, HttpServletResponse response) throws SQLException {
          HttpSession sessao = request.getSession();
          sessao.invalidate();
          return "redirect:canva?acao=LoginForm";
     }

}
