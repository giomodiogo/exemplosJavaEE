package com.javaee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Diogo Giomo
 * 
 *         <p>
 *         Exemplo de uma Servlet simples, com as definições no web.xml
 * 
 *         {@link http://localhost:8080/javaee-servlet/hello}
 *         </p>
 */
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/*
	 * Esse método será o responsável por atender requisições e gerar as respostas
	 * adequadas.
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Primeira Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Oi mundo Servlet!</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
