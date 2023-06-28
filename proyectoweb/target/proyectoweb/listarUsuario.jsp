<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/dashboard.css">
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
                    <a href="">
                        configuracion
                    </a>
                </div>
                <a href=""><img src="img/slide2.jpg" alt=""></a>
            </div>
        </div>
    </header>
    <main>
        <div class="buscar">
            <input type="text" placeholder="Buscar">
        </div>
        <table class="table1">
            <thead>
                <tr>
                    <th>id_usuario</th>
                    <th>nombre usuario</th>
                    <th>contraseña</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <c:forEach var="usuario" items="${usuario}">
            <tbody>
                <tr>
                    <td>${usuario.getIdUsu}</td>
                    <td>${usuario.getNombreUsu}</td>
                    <td>${usuario.getTelefonoUsu}</td>
                    <td>${usuario.getEstado}</td>
                    <td>${usuario.getClaveUsu}</td>
                    <td>
                        <a href="modificar.html"><button>modificar</button></a>
                    </td>
                    <td>
                        <a href=""><button>eliminar</button></a>
                    </td>
                </tr>
            </tbody>
        </c:forEach>
        </table>
    </main>

</body>

</html>