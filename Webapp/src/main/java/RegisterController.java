

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class RegisterController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 PrintWriter out = response.getWriter();
	 out.println("register Controller");
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String age = request.getParameter("age");
		
		int userAge=Integer.parseInt(age);
	 
		out.println(userName);
		out.println(password);
		out.println(userAge);
	}

	

}
