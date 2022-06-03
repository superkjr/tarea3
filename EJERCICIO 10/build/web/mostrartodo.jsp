<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos</title>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body>
        <center>
        <h1>Todos los registros</h1>
        <table class="table" Style="width: 40%">
                <thead>
                    <tr>
                        <th scope="col">DUI</th>
                        <th scope="col">Apellidos</th>
                        <th scope="col">Nombres</th>
                    </tr>
                </thead>
                <tbody>
    <c:forEach var="listaTotal" items="${sessionScope.personas}">
                    <tr>
                        <td>${listaTotal.dui}</td>
                        <td>${listaTotal.apellidos}</td>
                        <td> ${listaTotal.nombres}</td>
                        <td><a class="btn btn-primary" href="editar1.do?accion=editar&&dui=${listaTotal.dui}" role="button">Editar</a></td>
                        <td><a class="btn btn-primary" href="editar1.do?accion=eliminar&&dui=${listaTotal.dui}" role="button">Eliminar</a></td>
                    </tr>
                   
    </c:forEach>
                    <tr>
                        <td colspan="3" align="center">
                            <a class="btn btn-primary" href="index.jsp" role="button">Regresar</a>
                            
                        </td>
                    </tr>
                     </tbody>
            </table>
        </center>
    </body>
</html>
