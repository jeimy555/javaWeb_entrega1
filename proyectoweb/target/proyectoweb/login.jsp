<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/login.css">
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
            
        
        </div>
    </header>
    <main>
        <div class="contain">
            <img src="img/logoW.png" alt="">
            <a href="usuario?accion=register"><input class="but" type="button" value="registrar Usuario"></a>
            <a href="usuario?accion=dash"><input class="but" type="button" value="consultar Usuario"></a>
            <a href="estado?accion=register"><input class="but" type="button" value="registrar Estado"></a>
            <a href="estado?accion=dash"><input class="but" type="button" value="consultar Estado"></a>
            <a href="mensaje?accion=register"><input class="but" type="button" value="registrar Mensaje"></a>
            <a href="mensaje?accion=dash"><input class="but" type="button" value="consultar Mensaje"></a>
    </div>
    </main>

    
</body>
</html>