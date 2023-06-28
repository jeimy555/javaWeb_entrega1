package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Usuario.UsuarioDAO;
import model.Usuario.UsuarioVO;

public class Usuario extends HttpServlet {
    UsuarioDAO usuarioDAO=new UsuarioDAO();
     UsuarioVO usuarioVO=new UsuarioVO();
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion=req.getParameter("accion");
        switch(accion){
            case "dash":
                req.getRequestDispatcher("listarUsuario.jsp").forward(req, resp);
            break;
            case "index":
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;
            case "login":
                req.getRequestDispatcher("login.jsp").forward(req, resp);
            break;
            case "login2":
                req.getRequestDispatcher("login2.jsp").forward(req, resp);
            break;
            case "redes":
                req.getRequestDispatcher("redes.jsp").forward(req, resp);
            break;
            case "register":
                req.getRequestDispatcher("registerUsuario.jsp").forward(req, resp);
            break;
            case "register2":
                req.getRequestDispatcher("registerUsuarioIns.jsp").forward(req, resp);
            break;

            
        }

     
     
    }
    

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String enviar=req.getParameter("enviar");
        switch(enviar){
            case "registrar":
            System.out.println("uwu");
                Registrar(req, resp);
            break;
            
        }
    }

    
    
    protected void Registrar(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
        
        
            usuarioVO.setNombreUsu((req.getParameter("usuario"))); 
            usuarioVO.setTelefonoUsu(Integer.parseInt(req.getParameter("telefono"))); 
            usuarioVO.setClaveUsu((req.getParameter("clave"))); 
            
        
        
        try {
            System.out.println(usuarioVO.getClaveUsu());
            usuarioDAO.Registrar(usuarioVO);
            resp.sendRedirect("usuario?accion=dash");
            System.out.println("etsito");
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect("usuario?accion=register");
            System.out.println("a");
        }
    }
    public static void main(String[] args) throws ServletException, IOException {
        
        Usuario objeto=new Usuario();
        objeto.Registrar(null, null);
    }

    
    
}
