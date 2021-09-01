/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vitor
 */
public class ConnectionFactory {

    public Connection recuperarConexao() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/canva?useTimezone=true&serverTimezone=UTC", "root", "");
            
        } catch (SQLException e) {
             
            throw new RuntimeException(e);
            
        } catch (ClassNotFoundException e) {
             
            e.printStackTrace();
            
        }
        return null;
    }
}
