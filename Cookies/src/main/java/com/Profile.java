package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Profile
 */
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("Link.html").include(request, response); 
		
		Cookie[] ck = request.getCookies();
		
		
		if(ck!=null) {
			String name=ck[0].getValue();
			if(!name.equals("")||name!=null){
				out.print("<b>Welcome to Profile</b>");
				out.print("<br>Welcome, "+name);
			}
		}
		else {
			out.println("please log-in first");
			out.println("<br/>");
			request.getRequestDispatcher("index.html").include(request, response); 
		}
	}
}
