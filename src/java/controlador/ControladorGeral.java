/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vitor
 */
@WebFilter(filterName = "canva", urlPatterns = {"/canva"})
public class ControladorGeral implements Filter {

    @Override
    public void doFilter(ServletRequest servRequest, ServletResponse servResponse,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servRequest;
        HttpServletResponse response = (HttpServletResponse) servResponse;

        String parametro = request.getParameter("acao");
        String nomeDaClasse = "acao." + parametro;
        String pagina = null;
        
        try {
            Class classe = Class.forName(nomeDaClasse);
            Logica logica = (Logica) classe.newInstance();
            
            pagina = logica.executa(request, response);
            
        }  catch (Exception ex) { 
            throw new RuntimeException(ex);
        }
        
        String[] decisaoDeEnvio = pagina.split(":");
        if(decisaoDeEnvio[0].equals("forward")){
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/" + decisaoDeEnvio[1]);
            rd.forward(request, response);
        }else if(decisaoDeEnvio[0].equals("redirect")){
            response.sendRedirect(decisaoDeEnvio[1]);
        }
    }

}
