<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar</title>
             <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    
    </head>
    <body>
                <center>
        <h1>Actualizar regitro</h1>
        <form action="actualizar.do" method="post">
        <table class="table" Style="width: 40%">
                <thead>
                    <tr>
                        <th scope="col">DUI</th>
                        <th scope="col">Apellidos</th>
                        <th scope="col">Nombres</th>
                    </tr>
                </thead>
                <tbody>
                   <c:forEach var="listaTotal" items="${sessionScope.persona}">
                    <tr>
                        <td><input type="text" name="txtDui" value="${listaTotal.dui}" readonly="true"></td>
                        <td><input type="text" name="txtApellido" value="${listaTotal.apellidos}"></td>
                        <td><input type="text" name="txtNombre" value="${listaTotal.nombres}"> </td>
                    </tr>
                   
    </c:forEach>
>                        <tr>
                        <td colspan="3" align="center"><a class="btn btn-primary" href="index.jsp" role="button">Regresar</a>
                <input class="btn btn-primary" type="submit" value="Actualizar">
                </td>
                    </tr>
                </tbody>
        </table>
      </form>
                </center>
    </body>
</html>
