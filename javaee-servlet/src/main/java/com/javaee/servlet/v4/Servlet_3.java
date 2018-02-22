package com.javaee.servlet.v4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author Diogo Giomo
 *         <p>
 *         Servlet 4.0 (Annotations)
 *         </p>
 *         <p>
 *         {@link http://localhost:8080/javaee-servlet/form_servlet_3.jsp}
 *         </p>
 *         <p>
 *         Exemplo de uma Servlet recuperando parâmetros através de requisições via método
 *         {@link Servlet_3#doGet(HttpServletRequest, HttpServletResponse)},
 *         {@link Servlet_3#doPost(HttpServletRequest, HttpServletResponse)}
 * 
 *         Utilizar form_servlet_3.jsp
 *         </p>
 * 
 */
@WebServlet(name = "Servlet_3", urlPatterns = { "/login_servlet_3" })
public class Servlet_3 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String login = request.getParameter("login");
		String password = request.getParameter("password");

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Exemplo com Requisições Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>req doPost</h1>");
		out.println("<p><h2>Login: " + login + "</h2></p>");
		out.println("<p><h2>Senha: " + password + "</h2></p>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String login = request.getParameter("login");
		String password = request.getParameter("password");

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Exemplo com Requisições Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>req doGet</h1>");
		out.println("<p><h2>Login: " + login + "</h2></p>");
		out.println("<p><h2>Senha: " + password + "</h2></p>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
