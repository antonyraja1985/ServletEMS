

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test2Controller
 */
@WebServlet("/test")
public class Test2Controller extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		int a=10;
		int b=20;
		int c=a+b;
		
		out.println("welcome to servlet browser"+c);
		
		System.out.println("welcome to servlet console");
	}

	
}
