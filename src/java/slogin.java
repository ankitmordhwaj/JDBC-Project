
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author amany
 */
@WebServlet(urlPatterns = {"/slogin"})
public class slogin extends HttpServlet {

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
        try {
            String ID,Pass;
            ID=request.getParameter("id");
            Pass=request.getParameter("pass");
            
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Sqllite/aman.db");
            String sql;
            sql = "select * from student where ID=? and Pass=?";
		
            
                        PreparedStatement stmt=con.prepareStatement(sql);
                        stmt.setString(1,ID);
			stmt.setString(2,Pass);
	            ResultSet rs=stmt.executeQuery();
    if(rs.next())
    {
   RequestDispatcher rd=request.getRequestDispatcher("sdetails.jsp");
   rd.forward(request, response);
   
     }
            else
            {
            response.sendRedirect("wronglogin.jsp");
            }
			
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(record.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
       
    }

    


