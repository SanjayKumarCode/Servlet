package org.btm.lifecycleApp;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = "/fs",loadOnStartup = 5)//annnotation
public class FirstServlet extends GenericServlet
{
	public FirstServlet()
	{
		System.out.println("Servlet Object is Created");
	}

	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("Servlet Object is initialized");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) 
	throws ServletException, IOException 
	{
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
	// DISPLAY RESPONSE ON NEW HTML FILE //
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='yellow'>"
		+"<h1>Student details are "+name+" from "+place
		+"</h1>"+"</body></html>");//PRESENTATION LOGIC
		out.close();
		System.out.println("service() is executed!!");
	}
	@Override
	public void destroy() 
	{
		System.out.println("Close all Costly Resources");
	}
}
