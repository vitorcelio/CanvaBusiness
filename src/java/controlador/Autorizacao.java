/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vitor
 */
@WebFilter("/canva")
public class Autorizacao implements Filter {

     @Override
     public void doFilter(ServletRequest request, ServletResponse response,
             FilterChain chain) throws IOException, ServletException {
          String parametro = request.getParameter("acao");

          HttpServletRequest req = (HttpServletRequest) request;
          HttpServletResponse res = (HttpServletResponse) response;

          HttpSession sessao = req.getSession();
          boolean usuarioNaoLogado = (sessao.getAttribute("user") == null);
          boolean acaoProtegida = !(parametro.equals("Login") || parametro.equals("LoginForm") || parametro.equals("Home"));

          if (usuarioNaoLogado && acaoProtegida) {
               res.sendRedirect("canva?acao=LoginForm");
               return;
          }

          chain.doFilter(request, response);
     }

}
