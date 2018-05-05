package com.javaee.servlet.v4;

import java.io.IOException;

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
 *         {@link http://localhost:8080/javaee-servlet/form_servlet_4.jsp}
 *         </p>
 *         <p>
 *         - Exemplo de uma página customizada de erros.
 *         </p>
 *         <p>
 *         Adicionar a página error.jsp no web.xml
 * 
 *         Utilizar form_servlet_4.jsp
 *         </p>
 * 
 */
@WebServlet(name = "Servlet_4", urlPatterns = { "/servlet_4" })
public class Servlet_4 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		throw new ServletException();

	}
}
