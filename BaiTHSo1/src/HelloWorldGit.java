

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldGit
 */
@WebServlet("/HelloWorldGit")
public class HelloWorldGit extends HttpServlet {
	
	 public void init() throws ServletException {} 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Dinh Nghia response content type      
		response.setContentType("text/html"); 
		 
	      java.io.PrintWriter out = response.getWriter();       
	      out.println("<h1>" + "Hello Thông" + "</h1>"); 
	 
	      out.close();   
	}
	 
	   public void destroy() {       // do nothing.
	}


}
