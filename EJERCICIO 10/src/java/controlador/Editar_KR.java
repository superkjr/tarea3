package controlador;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona_MA;



public class Editar_KR extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
             System.out.println("Hola");
            String accion = request.getParameter("accion");
        
            System.out.println("La accion es: " +accion);
        
             String Dui = request.getParameter("dui");
             System.out.println("El dui es: " +Dui);
            
            Persona_MA p = new Persona_MA(); // Conectar a la BD
            ArrayList<Persona_MA> persona = new ArrayList<>();
        
        if(accion.equals("editar"))
        {
            System.out.println("Pasa por el if: ");
          
             persona = p.consultarRegistros(Integer.parseInt(Dui)); // Consulta los registros y los almacena en nuevo array llamado personas
            request.getSession().setAttribute("persona", persona); //Asignar valores a la sesion
        
            request.getRequestDispatcher("actualizarDatos.jsp").forward(request, response);
        } else if (accion.equals("eliminar"))
        {
            persona = p.consultarRegistros(Integer.parseInt(Dui)); // Consulta los registros y los almacena en nuevo array llamado personas
            request.getSession().setAttribute("persona", persona); //Asignar valores a la sesion
            request.getRequestDispatcher("eliminarDatos.jsp").forward(request, response);
        }
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
