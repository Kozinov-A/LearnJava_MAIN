package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(
        name = "servlets.WelcomeServlet",
        description = "description",
        urlPatterns = {"/loginPageMain"}
        )
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        try {
            getServletContext().getRequestDispatcher("/loginPageMain.jsp").forward(request, response);
        }
        catch (ServletException | IOException exception){
            System.out.println(exception);
        }

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
       //getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);

    }
}