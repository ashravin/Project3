

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registerservlet
 */
@WebServlet("/Registerservlet")
public class Registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registerservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n = request.getParameter("username");
		String p = request.getParameter("password");
		try {
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection(
		 "jdbc:mysql://localhost:3306/library", "root", "password123");
		 PreparedStatement ps = con.prepareStatement("insert into admindetails values(n,p)");
		 ps.setString(1, n);
		 ps.setString(2, p);
		 int i = ps.executeUpdate();
		 PrintWriter writer = response.getWriter();
		writer.println("<h1>" + "You have successfully registered an account!" + 
		"</h1>");
		writer.close(); 
		 
		}
		catch (Exception exception) {
		 System.out.println(exception);
		 out.close();
		}
		doGet(request, response);
	}

}
