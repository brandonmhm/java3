
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T-107
 */
public class servletAutenticar extends HttpServlet {

    
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String login= request.getParameter("login");
        String password= request.getParameter("password");
        
        //crear un atributo de MVC para sre mas compartido con las visitas
                              //valor de atributo
        request.setAttribute("usuario", login);
        //response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = response.getWriter();
        //out.println("Este es mi primer servlet!!!");
        RequestDispatcher despachador= request.getRequestDispatcher("/bienvenida.jsp");
      despachador.forward(request, response);//por request recivo informacion y por response te responde 
    }
}