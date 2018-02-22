package com.javaee.servlet.v4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
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
 *         {@link http://localhost:8080/javaee-servlet/servlet_1}
 *         </p>
 *         <p>
 *         Exemplo de uma Servlet com parâmetros iniciais e recuperando no método
 *         {@link HttpServlet#init(ServletConfig)}.
 * 
 *         Também é possível recuperar os parâmetros em outros pontos da
 *         Servlet, utilizando a classe {@link ServletConfig}, exemplo no método
 *         {@link Servlet_1#service(HttpServletRequest, HttpServletResponse)}
 *         </p>
 */
@WebServlet(name = "Servlet_1", urlPatterns = { "/servlet_1" }, initParams = {
		@WebInitParam(name = "param1", value = "value1"), @WebInitParam(name = "param2", value = "value2") })

public class Servlet_1 extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private String parametro1;
	private String parametro2;

	/*
	 * Método inicial de uma Servlet
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		this.parametro1 = config.getInitParameter("param1");
		this.parametro2 = config.getInitParameter("param2");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Exemplo com InitParam Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>InitParams Servlet - Método init</h1>");
		out.println("<p><h2>Param 1: " + this.parametro1 + "</h2></p>");
		out.println("<p><h2>Param 2: " + this.parametro2 + "</h2></p>");
		//
		out.println("<h1>InitParams Servlet - Utilizando classe ServletConfig</h1>");
		// Recuperando os params
		ServletConfig config = getServletConfig();
		String parametro1 = config.getInitParameter("param1");
		String parametro2 = config.getInitParameter("param2");

		out.println("<p><h2>Param 1: " + parametro1 + "</h2></p>");
		out.println("<p><h2>Param 2: " + parametro2 + "</h2></p>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
