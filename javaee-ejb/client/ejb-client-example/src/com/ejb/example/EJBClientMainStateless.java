package com.ejb.example;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * 
 * @author Diogo Giomo
 * 
 *         Session bean Stateless não mantém o estado por cliente. No entanto, o
 *         bean Stateless pode ficar no pool, criando um cache, dessa forma,
 *         vários clientes acessam a mesma informação. Esse estado mantido, não
 *         é atômico. O bean Stateless pode ser recriado/descardado a qualquer
 *         momento. Sendo assim, é indicado para lógicas que não necessitam a
 *         continuidade do estado do bean.
 * 
 *         É possível analisar o estado do session bean, através da referência
 *         do objeto (session bean).
 * 
 *
 */
public class EJBClientMainStateless {

	public static void main(String[] args) {
		EJBClientMainStateless ejbClient = new EJBClientMainStateless();
		ejbClient.testStatelessEjb();
	}

	private void testStatelessEjb() {
		ISessionBeanStatelessRemote statelessBean1;
		try {
			InitialContext ctx = new InitialContext(JNDIConfig.getConfigs());

			statelessBean1 = (ISessionBeanStatelessRemote) ctx
					.lookup("ejb:/ejb-example/SessionBeanStateless!com.ejb.example.ISessionBeanStatelessRemote");

			System.out.println("Stateless");
			System.out.println(statelessBean1.getReferencia());
			System.out.println("Somar: " + statelessBean1.somar(1, 3));
			System.out.println("Subtrair: " + statelessBean1.subtrair(3, 2));
			System.out.println("Multiplicar: " + statelessBean1.somar(3, 3));
			System.out.println("Dividir: " + statelessBean1.somar(3, 3));

			System.out.println("\n");

			System.out.println("Stateless");
			System.out.println(statelessBean1.getReferencia());
			System.out.println("Somar: " + statelessBean1.somar(1, 3));
			System.out.println("Subtrair: " + statelessBean1.subtrair(3, 2));
			System.out.println("Multiplicar: " + statelessBean1.somar(3, 3));
			System.out.println("Dividir: " + statelessBean1.somar(3, 3));

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
