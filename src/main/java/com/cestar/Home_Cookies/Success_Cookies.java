package com.cestar.Home_Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Success_Cookies
 */
@WebServlet("/Success_Cookies")
public class Success_Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Success_Cookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String name="";
		String pwd="";
		
		Cookie[] cookies=request.getCookies();
		
		for(int i=0;i<cookies.length;i++) {
			//out.print(cookies[i].getName() + ": " + cookies[i].getValue()+"<br>");
			if(cookies[i].getName().equals("name")) {
				name=cookies[i].getValue();
			}
			if(cookies[i].getName().equals("pwd")) {
				pwd=cookies[i].getValue();
			}
		}
		
		out.print("<body style='background-color:lavender'>");
		out.print("<div style='background-color:purple;color:orange;padding:30px;border-radius:30px'>");

		out.print("<h3> Name: "+name+"</h3>");
		out.print("<h3> Password: "+pwd+"</h3> <br><br>");
		out.print("</div>");
		out.print("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
