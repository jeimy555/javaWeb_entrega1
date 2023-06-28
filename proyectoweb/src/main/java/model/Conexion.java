package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    //atributos
    private static Connection con;
    private static final String driver="com.mysql.cj.jdbc.Driver" ;
    private static final String user="root" ;
    private static final String password="" ;
    private static final String urlBd="jdbc:mysql://localhost:3306/red" ;

    public static Connection connection(){
        try {
            Class.forName(driver);
            con=DriverManager.getConnection(urlBd, user, password);
            System.out.println("Conexion ok!");
        } catch (Exception e) {
            System.out.println("error al conectarse " + e.getMessage().toString());
        }
        return con;
    }
    public static void main(String[] args) {
        Conexion.connection();
    }
    
}
