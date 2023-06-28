<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/register.css">
    <title>Document</title>
</head>
<body>
    <header>
        <div class="top">
            <a href="usuario?accion=index">
                <div class="log">
                    <div class="log"><img src="img/logo.png" alt=""></div>
                </div>
            </a>
            
        
        <div class="log2">
            
            <div class="but">
                <a href="usuario?accion=login">
                    iniciar sesion
                </a>
            </div>
    </div></div>
    </header>
    <main>
        <div class="contain">
            <img src="img/logoW.png" alt="">


        <form action="usuario?enviar=registrar" id="enviar" method="post">
            <input type="text" name="usuario" class="datos" placeholder="INGRESE SU USUARIO">
            <input type="text" name="telefono" class="datos" placeholder="INGRESE SU TELEFONO">           
            <input type="password" name="clave" class="datos" placeholder="INGRESE SU CONTRASEÑA">
        
            <input type="submit" value="registrar">
        </form>

        <a href="">¿olvidaste tu contraseña?</a>
        <br>
        <br>
        <a href="usuario?accion=login">¿Ya tienes una cuenta?</a>
    </div>
    </main>

    
</body>
</html>