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
 * Servlet implementation class Home_Cookies
 */
@WebServlet("/Home_Cookies")
public class Home_Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home_Cookies() {
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
		
		String name=request.getParameter("e_name");
		String password=request.getParameter("e_password");
		out.print("<body style='background-color:lavender'>");
		out.print("<div style='background-color:purple;color:orange;padding:30px;border-radius:30px'>");

		out.print("<h3>Name in first request: "+name+"</h3>");
		out.print("<h3>Password in first request: "+password+"</h3> <br><br>");
		
		out.print("<a href='Success_Cookies' style='color:orange'>GO TO SUCCESS page</a>");
		out.print("</div>");
		out.print("</body>");
		Cookie ck1=new Cookie("name", name);
		Cookie ck2= new Cookie("pwd", password);
		
		response.addCookie(ck1);
		response.addCookie(ck2);
		
		//out.print("<a href='Success_Cookies'>Go to success page</a>");	
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
