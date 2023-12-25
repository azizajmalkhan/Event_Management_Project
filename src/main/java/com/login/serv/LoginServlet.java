package com.login.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    	{
    		RequestDispatcher dispatcher=null;
    		try
    		{
    			
    			PrintWriter out=response.getWriter();
    			Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish the database connection
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event", "root", "Khan@123");
                String username=request.getParameter("usern");
                String password=request.getParameter("passw");
                PreparedStatement ps =con.prepareStatement("select * from signup where username = ? and password = ? ");
                ps.setString(1, username);
                ps.setString(2, password);
                ResultSet rs =ps.executeQuery();
                //dispatcher = request.getRequestDispatcher("index.jsp");

                // Set status attribute for JSP page
                if (rs.next()) {
                	dispatcher = request.getRequestDispatcher("index.jsp");
                    //out.println("Success");
                } else {
                	response.setContentType("text/html");
                	out.print("<h3 style='color:green' >please register and login </h3>");
                    //out.println("Failed..");
                }
                dispatcher.forward(request, response);
    		}
    		//dispatcher.forward(request, response);
    		catch(ClassNotFoundException e)
    		{
    			e.printStackTrace();
    		}
    		catch(SQLException e)
    		{
    			e.printStackTrace();
    		}
    	}

}
