package model.Usuario;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.Conexion;

public class UsuarioDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;
    String a;
    int r;
    
    public int Registrar(UsuarioVO v) throws SQLException {
        //consulta preparada
        sql="INSERT INTO usuario (nombreUsu,claveUsu,telefonoUsu) VALUES (?,?,?)";
        try {
            con=Conexion.connection();//abrir conexion
            //preparar sentencia
            ps=con.prepareStatement(sql);
            ps.setString(1, v.getNombreUsu());
            ps.setInt(2, v.getTelefonoUsu());
            ps.setString(3, v.getClaveUsu());
            
            ps.executeUpdate();

            ps.close(); //cerrar sentencia
            System.out.println("Se registro el usuario en la base de datos");
        } catch (Exception e) {//definicion de objeto
            System.out.println("Error en el registro "+e.getMessage().toString());
        }
        finally{
            con.close();//cerrando conexion
        }
        return r;
    }
    
}




