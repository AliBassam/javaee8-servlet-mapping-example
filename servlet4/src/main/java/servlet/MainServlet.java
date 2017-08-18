package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.MappingMatch;


@WebServlet(urlPatterns={"/", "/main", "*.html", "/main/*"})
public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Discover the manner in which this HttpServlet was invoked
		HttpServletMapping httpServletMapping = req.getHttpServletMapping();
		
		//Retrieve MappingMatch Enum
		MappingMatch mappingMatch = httpServletMapping.getMappingMatch();
		
		//Print additional results
		System.out.println("Mapping Match: " + mappingMatch);
		System.out.println("Match Value: " + httpServletMapping.getMatchValue());
		System.out.println("Pattern: " + httpServletMapping.getPattern());
		System.out.println("Servlet Name: " + httpServletMapping.getServletName());
	}
}
