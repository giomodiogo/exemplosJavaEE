package com.javaee.servlet.v4;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * 
 * @author Diogo Giomo
 *         <p>
 *         Servlet 4.0 (Annotations)
 *         </p>
 *         <p>
 *         {@link http://localhost:8080/javaee-servlet/ciclo_vida_servlet}
 *         
 *         Verificar no console os logs.
 *         </p>
 * 
 */
@WebServlet(name = "Servlet_5", urlPatterns = { "/ciclo_vida_servlet" })
public class Servlet_5 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Método init()");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Método service()");
	}

	@Override
	public void destroy() {
		// Método é chamado quando existe a liberação de memória, limpa os reursos.
		System.out.println("Método destroy()");
	}
}
