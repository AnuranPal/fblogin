import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Customer extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		/*
		int i = 100;
		out.print("<h1>Welcome");
		out.print("<br>Value:--"+i);
		out.print("</h1>");
		*/
		String cid = request.getParameter("cid");
		String cname = request.getParameter("cname");
		String cadd = request.getParameter("cadd");
		String cpass = request.getParameter("cpass");
		out.print("<h1>Customer id is:--"+cid);
		out.print("<h2>Customer name is:--"+cname);
		out.print("<h3>Customer Address is:--"+cadd);
		out.print("<h4>Customer Password is:--"+cpass);
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","APAL","password");
			Statement st = con.createStatement();
			int c_id = Integer.parseInt(cid);
			int i = st.executeUpdate("insert into customer values("+c_id+",'"+cname+"','"+cadd+"','"+cpass+"')");
			if(i>0)
				out.print("<br>Inserted Properly in Customer table");
			else
				out.print("Error :000xffffx4 Not Inserted");
		}
		catch(Exception e)
		{
			out.print("Exception : "+e);
		}
	}
}