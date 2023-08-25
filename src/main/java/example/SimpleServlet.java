package example;

import java.io.IOException;

import java.io.PrintWriter;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/*

  Servlet implementation class SimpleServlet

*/
 
@WebServlet("/SimpleServlet")

public class SimpleServlet implements Servlet {

    /**
     * Default constructor.
     */
    public SimpleServlet() {
        // TODO Auto-generated constructor stub
    }
	
/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
		System.out.println("Servlet initialized");
	}
/**
 * @see Servlet#destroy()
	*/

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet destroyed");
	}

	/**
	 * @see Servlet#getServletConfig()

	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

 	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	/**

	 * @see Servlet#service(ServletRequest request, ServletResponse response)

	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter();
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("<b>hello simple servlet</b>");
		out.print("</body></html>");
	}
	
} // end of clas