

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("emailRegistration");
		String password=request.getParameter("passwordRegistration");
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		 // loads driver
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bildit", "root", ""); // gets a new connection
 
		PreparedStatement ps = c.prepareStatement("insert into users(email, password)" + "values (?,?)");
		ps.setString(1, email);
		ps.setString(2, password);
 
		 int i = ps.executeUpdate();
	     if(i!=0) {
	    	 
	    	 response.sendRedirect("home.jsp");
				return;
	     }
	     else {
	    	 
		    	 response.sendRedirect("error.html");
					return;
		     
	     }

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
