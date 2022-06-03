package controlador;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona_MA;

public class Mostrar_MA extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
            
            Persona_MA p = new Persona_MA(); // Conectar a la BD
        ArrayList<Persona_MA> personas = new ArrayList<>();
        personas = p.consultarRegistros(); // Consulta los registros y los almacena en nuevo array llamado personas
        request.getSession().setAttribute("personas", personas); //Asignar valores a la sesion
        request.getRequestDispatcher("mostrartodo.jsp").forward(request, response);

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
