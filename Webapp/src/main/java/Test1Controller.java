

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test1Controller
 */
@WebServlet("/Test1Controller")
public class Test1Controller extends GenericServlet {
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method calling");
		
	}
	
	


	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	  System.out.println("service");
		
	   PrintWriter res	=arg1.getWriter();
	
	   res.println("welcome");
		
	}
	
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("init method calling");
		
	}

	

}
