
import com.login.dao.alogindao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/alogin"})
public class alogin extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uid,pass;
        
            uid=request.getParameter("id");
            pass=request.getParameter("pass");
            alogindao dao=new alogindao();
                        
            if(dao.check(uid, pass))
            {
            response.sendRedirect("adminad.jsp");
            }
            else
            {
            response.sendRedirect("wronglogin.jsp");
            }
            }  
       
    }

    


