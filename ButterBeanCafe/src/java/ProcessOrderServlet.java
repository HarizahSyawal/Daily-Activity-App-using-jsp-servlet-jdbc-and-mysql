import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/ProcessOrder"})
public class ProcessOrderServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //fetch the order info, and store it in cookie
        String set1 = request.getParameter("Set1Checkbox");
        String drink1 = request.getParameter("set1DrinkOption");
        String qty1 = request.getParameter("set1OrderQuantity");
        
        String set2 = request.getParameter("Set2Checkbox");
        String drink2 = request.getParameter("set2DrinkOption");
        String qty2 = request.getParameter("set2OrderQuantity");

        String set3 = request.getParameter("Set3Checkbox");
        String drink3 = request.getParameter("set3DrinkOption");
        String qty3 = request.getParameter("set3OrderQuantity");

        Cookie c = new Cookie("set1",set1);
        response.addCookie(c);
        c = new Cookie("drink1",drink1);
        response.addCookie(c);
        c=new Cookie("qty1",qty1);
        response.addCookie(c);
        
        c = new Cookie("set2",set2);
        response.addCookie(c);
        c = new Cookie("drink2",drink2);
        response.addCookie(c);
        c=new Cookie("qty2",qty2);
        response.addCookie(c);

        c = new Cookie("set3",set3);
        response.addCookie(c);
        c = new Cookie("drink3",drink3);
        response.addCookie(c);
        c=new Cookie("qty3",qty3);
        response.addCookie(c);

        response.sendRedirect("ProcessPayment");        
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
    }
}
