

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
 * Servlet implementation class Bookservlet
 */
@WebServlet("/Bookservlet")
public class Bookservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bookservlet() {
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
		String t = request.getParameter("title");
		String a = request.getParameter("author");
		String y = request.getParameter("year");
		try {
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection(
		 "jdbc:mysql://localhost:3306/library", "root", "password123");
		 PreparedStatement ps = con.prepareStatement("insert into bookdetails values(t,a,y)");
		 ps.setString(1, t);
		 ps.setString(2, a);
		 ps.setString(2, y);
		 int i = ps.executeUpdate();
		PrintWriter writer = response.getWriter();
		writer.println("<h1>" + "You have successfully registered a Book!" + 
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
