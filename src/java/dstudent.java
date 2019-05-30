
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author amany
 */
@WebServlet(urlPatterns = {"/dstudent"})
public class dstudent extends HttpServlet {

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
            String ID;
            ID=request.getParameter("id");
            
            
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Sqllite/aman.db");
            String sql;
            sql = "delete from student where ID=?";
		
            
                        PreparedStatement stmt=con.prepareStatement(sql);
                        stmt.setString(1,ID);
			
	            stmt.execute();
    			
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(record.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
       
    }

    


