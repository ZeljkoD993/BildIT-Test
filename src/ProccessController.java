

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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProccessController
 */
@WebServlet("/ProccessController")
public class ProccessController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProccessController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email"); 
		String name=request.getParameter("name");
		String lastName=request.getParameter("lastName");
		String streetAddress=request.getParameter("streetAddress");
		String city=request.getParameter("city");
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		 // loads driver
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bildit", "root", ""); // gets a new connection
 
		PreparedStatement ps = c.prepareStatement("Update users set name=? ,lastName=? ,streetAddress=? ,city=? where email='" + email + "' " );
		ps.setString(1, name);
		ps.setString(2, lastName);
		ps.setString(3, streetAddress);
		ps.setString(4, city);
		 
		 int i = ps.executeUpdate();
	     if(i!=0) {
	    	 
	    	 
	    	 
	    	 response.sendRedirect("profile.jsp");
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
