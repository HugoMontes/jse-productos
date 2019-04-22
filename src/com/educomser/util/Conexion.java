package com.educomser.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private Connection connection;
    private static final String DBDRIVER = "org.postgresql.Driver";
    private static final String DBURL = "jdbc:postgresql://localhost:5432/jseproyecto";
    private static final String DBUSER = "postgres";
    private static final String DBPASS = "123456";

    public Conexion() {
        try {
            Class.forName(DBDRIVER);
            connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        } catch (ClassNotFoundException ex) {
            String msg="Error en el driver";
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, msg, ex);
        } catch (SQLException ex) {
            String msg="Error en la conexion";
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, msg, ex);
        }
    }

    public Connection getConnection() {
        return connection;
    }
    
    public void close(){
        try {
            connection.close();
        } catch (SQLException ex) {
            String msg="Error al cerrar conexion";
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, msg, ex);
        }
    }

}
