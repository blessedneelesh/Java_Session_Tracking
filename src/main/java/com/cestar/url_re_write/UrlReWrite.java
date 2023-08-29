package com.cestar.url_re_write;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UrlReWrite
 */
@WebServlet("/UrlReWrite")
public class UrlReWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UrlReWrite() {
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
		
		String name= request.getParameter("e_name");
		String password=request.getParameter("e_password");
		out.print("<body style='background-color:lavender'>");
		out.print("<div style='background-color:purple;color:orange;padding:30px;border-radius:30px'>");
		out.print("<h3>Name: "+name+"</h3>");
		out.print("<h3>Password: "+password+"</h3>");
		
		out.print("<a type='button' href=/S3Assignment4/UrlReWriteSuccess?e_name="+name +"&e_password="+password+" style='color:orange'>Go to success Page</a>");
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
