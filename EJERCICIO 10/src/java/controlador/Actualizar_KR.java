
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona_MA;

public class Actualizar_KR extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    
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
        
        //recibir parametros
        String a =request.getParameter("txtDui");
        String b =request.getParameter("txtApellido");
        String c = request.getParameter("txtNombre");
        //System.out.println(a + b + c);
        Persona_MA p = new Persona_MA();
        Persona_MA per = new Persona_MA(a, b, c);
        if(p.actualizarDatos(per) == true){
            request.getRequestDispatcher("exito.jsp").forward(request, response);
            
        }
        else{
            request.getRequestDispatcher("noexito.jsp").forward(request, response);
        }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
