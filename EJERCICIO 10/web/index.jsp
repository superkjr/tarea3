<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
    <body background="img/fondo.jpg">
    
        <div class="container">
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
        <!<!-- En el acction colocar el nombre del controlador, para este caso 
            es recibir.do (la extension.do no importa solo indica que es servlet)-->
  
            <style>
    
    html{
        min-height: 100%;
        max-width: 100%;
    }
    div{
        border-radius: 5%;
    }
    
    h1{
      color: white;
    }
    label{
      color: white;
    }
    </style>
  
  <form action="recibir.do" method="POST">
        <div class="row justify-content-center ">
            <div class="col-md-6 bg-dark">
              
        <h1 class="text-center fw-bolder">Registro de personas</h1>
        <hr class="bg-white" size="10">
                
        <div class="row-md-4">
                    <label for="colFormLabel" class="row-sm-2 row-form-label"><h6>DUI</h6></label>
                    <div class="input-group mb-3">
                        <input type="text" value="" class="form-control" name="txtDui" placeholder="Ingrese el DUI de la persona" aria-label="dui" aria-describedby="basic-addon1" required>
                      </div>
        
        <div class="row-md-4">
                    <label for="colFormLabel" class="row-sm-2 row-form-label"><h6>Nombre</h6></label>
                    <div class="input-group mb-3">
                        <input type="text" value="" class="form-control" name="txtNombres" placeholder="Ingrese los nombres de la persona" aria-label="nombre" aria-describedby="basic-addon1" required>
                      </div>

        <div class="row-md-4">
                    <label for="colFormLabel" class="row-sm-2 row-form-label"><h6>Apellidos</h6></label>
                    <div class="input-group mb-3">
                        <input type="text" value="" class="form-control" name="txtApellidos" placeholder="Ingrese los apellidos de la persona" aria-label="apellidos" aria-describedby="basic-addon1" required>
                      </div>
                    <hr class="bg-white" size="10">
                    <br>
                    <center>
                            <input class="btn btn-primary" type="submit" value="Registrar" />
                            <a class="btn btn-primary" href="mostrar.do" role="button">Consultar</a>
                            </center>
                            <br>
                            <br>
        </form>   
</div>
    </body>
</html>
