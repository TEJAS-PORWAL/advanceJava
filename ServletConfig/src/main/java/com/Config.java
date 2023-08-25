package com;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class config
 */
public class Config extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Config() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*
		//		this will help you to get the specified config for a file...
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig config = getServletConfig();
		String driver = config.getInitParameter("driver");
		out.println(driver);
	*/
		
//		to get all the config set for a file...
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletConfig config = getServletConfig();
		Enumeration<String> e = config.getInitParameterNames();
		
		ServletContext context =getServletContext();
		Enumeration<String> c =context.getInitParameterNames();
		
		
		String names = "";
		while(e.hasMoreElements()) {
			names = e.nextElement();
			out.println("name:"+names);
			out.print("values: "+ config.getInitParameter(names));
			out.println("<br/>");
			
		}
		while(c.hasMoreElements()) {
			names = c.nextElement();
			out.println("name:"+names);
			out.print("values: "+ context.getInitParameter(names));
			out.println("<br/>");
			
		}
		
	}

}
