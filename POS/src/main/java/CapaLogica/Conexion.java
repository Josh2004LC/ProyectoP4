/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Josh
 */
public class Conexion {
    static Connection conn = null;
    public static Connection conectar(){
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            } catch (ClassNotFoundException e) {
                System.out.println("Error de sql "+ e.getMessage());
        }
        
        try {
            conn =DriverManager.getConnection(url,"P4Proyec","Dev2024");
        } catch (SQLException e) {
             System.out.println("Error de conexion del driver "+ e.getMessage());
        }
        return conn;
    }
}
