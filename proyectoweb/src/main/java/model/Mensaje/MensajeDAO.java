package model.Mensaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import model.Conexion;

public class MensajeDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;
    String a;
    int r;
    
    public int Registrar(MensajeVO v) throws SQLException {
        //consulta preparada
        sql="INSERT INTO mensaje (cuerpoMens) VALUES (?)";
        try {
            con=Conexion.connection();//abrir conexion
            //preparar sentencia
            ps=con.prepareStatement(sql);
            ps.setString(1, v.getCuerpoMens());
            
            System.out.println(sql);
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

public List<MensajeVO> Listar() throws SQLException {
    // arraylist-almacena datos en memoria-guardar de manera diferente,forma dinamica
    List<MensajeVO> listarMensaje= new ArrayList<>();
    sql="SELECT * FROM mensaje";
    try {
        con=Conexion.connection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery(sql);
        while (rs.next()) {
           MensajeVO row = new MensajeVO();
           //Escribir en el setter de cada valor encontrado
           
           row.setCuerpoMens(rs.getString("cuerpoMens")); 
           
           
           listarMensaje.add(row);
        }
        ps.close();
        System.out.println("Consulta Exitosa");
    } catch (Exception e) {
        System.out.println("La consulta no pudo ser ejecutada"+e.getMessage().toString());
    } finally{
        con.close();
    }
    return listarMensaje;
}


    public void actualizar(int id,String mensaje) throws SQLException {
        sql="UPDATE `usuario` SET `cuerpoMens`='"+mensaje+" WHERE idMensaje="+id;
        try {
            con=Conexion.connection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            System.out.print("Se actualizo el genero exitosamente");

        } catch (Exception e) {
            System.out.println("Error al inactivar registro "+e.getMessage().toString());
        }finally{
            con.close();
        }
    }
}

