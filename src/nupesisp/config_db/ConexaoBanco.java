/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nupesisp.config_db;


import java.sql.*;

/**
 *
 * @author douglas
 */
public class ConexaoBanco {
    
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://127.0.0.1/" + "presidio_db";
    private static String usuario = "root";
    private static String senha = "";
    
    public static Connection abreConexao() throws SQLException, ClassNotFoundException {
        Class.forName(driver);
        return DriverManager.getConnection(url, usuario, senha);   
    }
}
