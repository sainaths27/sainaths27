

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

import com.mysql.cj.protocol.Resultset;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Adminmain
 */
@WebServlet("/Adminmain")
public class Adminmain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adminmain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","Sai@123");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		
		}
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String mob=request.getParameter("mobile");
		String gender=request.getParameter("gender");
		
		
		Iterator<String> itr = request.getParameterNames().asIterator();
		if(itr.hasNext())
		{
			
			String course_name=request.getParameter("course_name");	
			if (itr.next().equals("display"))
			{
				
			String data="";
			switch(course_name)	
			{
			
			case "java": try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","Sai@123");

				Statement smt=con.createStatement();
					ResultSet rs= smt.executeQuery("select * from student where course_name ="+course_name);
					
					while(rs.next())
					{
						data+= rs.getInt("id") + "\t" + rs.getString("name") + "\t"+rs.getString("email") + "\t" + rs.getString("mobile") +"\t"+rs.getString("gender")+rs.getString("course_name")+"\n";	
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			response.getWriter().append(data);
			break;
			case "python" :
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","Sai@123");

					Statement smt=con.createStatement();
						ResultSet rs= smt.executeQuery("select * from student where course_name ="+course_name);
						
						while(rs.next())
						{
							data+= rs.getInt("id") + "\t" + rs.getString("name") + "\t"+rs.getString("email") + "\t" + rs.getString("mobile") +"\t"+rs.getString("gender")+rs.getString("course_name")+"\n";	
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				response.getWriter().append(data);
				break;
			case "fullstack":
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","Sai@123");

					Statement smt=con.createStatement();
						ResultSet rs= smt.executeQuery("select * from student where course_name ="+course_name);
						
						while(rs.next())
						{
							data+= rs.getInt("id") + "\t" + rs.getString("name") + "\t"+rs.getString("email") + "\t" + rs.getString("mobile") +"\t"+rs.getString("gender")+rs.getString("course_name")+"\n";	
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				response.getWriter().append(data);
				break;
			
			
			case "c":
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","Sai@123");

					Statement smt=con.createStatement();
						ResultSet rs= smt.executeQuery("select * from student where course_name ="+course_name);
						
						while(rs.next())
						{
							data+= rs.getInt("id") + "\t" + rs.getString("name") + "\t"+rs.getString("email") + "\t" + rs.getString("mobile") +"\t"+rs.getString("gender")+rs.getString("course_name")+"\n";	
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				response.getWriter().append(data);
				break;
			}}}}}
			
		
		
		
	

	
