
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
@WebServlet(urlPatterns = {"/record"})
public class record extends HttpServlet {

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
            String ID,Pass,Name,FName,Fname,Mname,Dob,Gender,Phone_No,E_mail,Address,City,State,Zip,Country,Course,button;
            ID=request.getParameter("id");
            Pass=request.getParameter("pass");
            Name=request.getParameter("name");
            Fname=request.getParameter("fname");
            Mname=request.getParameter("mname");
            Dob=request.getParameter("dob");
            Gender=request.getParameter("gender");
            E_mail=request.getParameter("email");
            Phone_No=request.getParameter("pno");
            Address=request.getParameter("address");
            City=request.getParameter("city");
            State=request.getParameter("state");
            Zip=request.getParameter("zipcode");
            Country=request.getParameter("country");
            Course=request.getParameter("course");
            
            
             Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:/Sqllite/aman.db");
            String sql;
            sql = "insert into student (ID,Pass,Name,Fname,Mname,Dob,Gender,Phone_No,E_mail,Address,City,State,Zip,Country,Course) values ( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
            
                        PreparedStatement stmt=con.prepareStatement(sql);
                        stmt.setString(1,ID);
			stmt.setString(2,Pass);
			stmt.setString(3,Name);
			stmt.setString(4,Fname);
                        stmt.setString(5,Mname);
			stmt.setString(6,Dob);
			stmt.setString(7,Gender);
			stmt.setString(8,Phone_No);
                        stmt.setString(9,E_mail);
			stmt.setString(10,Address);
			stmt.setString(11,City);
			stmt.setString(12,State);
			stmt.setString(13,Zip);
			stmt.setString(14,Country);
			stmt.setString(15,Course);
                        stmt.execute();
			
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(record.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
       
    }

    


