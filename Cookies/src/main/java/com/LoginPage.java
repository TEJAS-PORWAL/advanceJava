package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginPage
 */
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		request.getRequestDispatcher("Link.html").include(request, response); 
		request.getRequestDispatcher("index.html").include(request, response); 
		
		String uname =request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		//login validation logic
		if(pass.equals("TEJAS123")) {
			out.println("Sucessfully Logged IN");
			
			Cookie ck=new Cookie("uname",uname);
			response.addCookie(ck);
			
		}
		else {
			out.println("sorry Incorrect ID or PASS");
			request.getRequestDispatcher("index.html").include(request, response); 
			
		}
	}

}
