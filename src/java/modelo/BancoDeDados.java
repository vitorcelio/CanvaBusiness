/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
 
/**
 *
 * @author Vitor
 */
public class BancoDeDados {
    private static List<Usuario> listaDeUsuarios = new ArrayList<>();
    private static Integer id = 1;
    
    public BancoDeDados(){
        Usuario u1 = new Usuario();
        u1.setLogin("admin");
        u1.setSenha("admin");
        listaDeUsuarios.add(u1);
    }

    public Usuario existeUsuario(String login, String senha) {
        for (Usuario user: listaDeUsuarios) {
            if(user.ehIgual(login, senha)){
                return user;
            }
        }
        return null;
    }
}
