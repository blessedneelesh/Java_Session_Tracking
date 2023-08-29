package com.cestar.hidden_form_field;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hidden_form_field
 */
@WebServlet("/Hidden_form_field")
public class Hidden_form_field extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hidden_form_field() {
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
		out.print("<h3>Name:"+name+"</h3>");
		out.print("<h3>Password:"+password+"</h3>");

		out.print("<form action='Success_Hidden_Form_Field'>");
		
		out.print("<input type='hidden' name='emp_name' value="+name+"></input>");
		out.print("<input type='hidden' name='emp_password' value="+password+"></input>");
		
		out.print("<input type='submit'  value='Go to success'></input>");
		out.print("</div>");
		out.print("</form>");
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
