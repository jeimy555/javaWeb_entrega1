package model.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Conexion;
public class EstadoDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;
    String a;
    int r;
    
    public int Registrar(EstadoVO v) throws SQLException {
        //consulta preparada
        sql="INSERT INTO estado (mensajeEst) VALUES (?)";
        try {
            con=Conexion.connection();//abrir conexion
            //preparar sentencia
            ps=con.prepareStatement(sql);
            ps.setString(1, v.getMensajeEst());
            
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

public List<EstadoVO> Listar() throws SQLException {
    // arraylist-almacena datos en memoria-guardar de manera diferente,forma dinamica
    List<EstadoVO> listarestado= new ArrayList<>();
    sql="SELECT * FROM estado";
    try {
        con=Conexion.connection();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery(sql);
        while (rs.next()) {
           EstadoVO row = new EstadoVO();
           //Escribir en el setter de cada valor encontrado
           
           row.setMensajeEst(rs.getString("mensajeEst")); 
           
           
           listarestado.add(row);
        }
        ps.close();
        System.out.println("Consulta Exitosa");
    } catch (Exception e) {
        System.out.println("La consulta no pudo ser ejecutada"+e.getMessage().toString());
    } finally{
        con.close();
    }
    return listarestado;
}


    public void actualizar(int id,String estado) throws SQLException {
        sql="UPDATE `estado` SET `MensajeEst`='"+estado+" WHERE idestado="+id;
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

