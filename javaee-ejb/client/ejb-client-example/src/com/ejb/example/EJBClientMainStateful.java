package com.ejb.example;

import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * 
 * @author Diogo Giomo
 * 
 *         Client para consumir o session bean Stateful, os testes são efetuados
 *         com uma conexão e com diferentes conexões. É possível analisar o
 *         estado do session bean, através da referência do objeto (session
 *         bean).
 *
 */
public class EJBClientMainStateful {

	public static void main(String[] args) {
		EJBClientMainStateful ejbClient = new EJBClientMainStateful();
		ejbClient.testStatelessEjb();
	}

	private ISessionBeanStatefulRemote getSessionBean(InitialContext ctx) throws NamingException {
		return (ISessionBeanStatefulRemote) ctx
				.lookup("ejb:/ejb-example/SessionBeanStateful!com.ejb.example.ISessionBeanStatefulRemote?stateful");
	}

	private void testStatelessEjb() {
		ISessionBeanStatefulRemote statefulBean1;
		ISessionBeanStatefulRemote statefulBean2;
		ISessionBeanStatefulRemote statefulBean3;
		try {
			/*
			 * Mantém o estado por conexão aberta.
			 */
			InitialContext ctx = new InitialContext(JNDIConfig.getConfigs());

			// abre conexão
			statefulBean1 = getSessionBean(ctx);

			System.out.println("***********************");
			System.out.println("******** Teste com a mesma conexão ******");
			System.out.println("***********************");

			System.out.println("Stateful");
			System.out.println(statefulBean1.getReferencia());
			for (int i = 0; i < 10; i++) {
				statefulBean1.addAluno("Aluno " + i);
				System.out.println(statefulBean1.getAlunos().size());
			}

			System.out.println("\n");

			System.out.println("Stateful");
			System.out.println(statefulBean1.getReferencia());
			for (int i = 0; i < 10; i++) {
				statefulBean1.addAluno("Aluno 2");
				System.out.println(statefulBean1.getAlunos().size());
			}

			/*
			 * Mantém o estado por conexão aberta.
			 */
			System.out.println("***********************");
			System.out.println("******** Teste com a duas conexão diferentes ******");
			System.out.println("***********************");

			// abre conexão
			ctx = new InitialContext(JNDIConfig.getConfigs());
			statefulBean2 = getSessionBean(ctx);

			System.out.println("Stateful");
			System.out.println(statefulBean2.getReferencia());
			for (int i = 0; i < 10; i++) {
				statefulBean2.addAluno("Aluno " + i);
				System.out.println(statefulBean2.getAlunos().size());
			}

			System.out.println("\n");

			// abre conexão
			ctx = new InitialContext(JNDIConfig.getConfigs());
			statefulBean3 = getSessionBean(ctx);
			System.out.println("Stateful");
			System.out.println(statefulBean3.getReferencia());
			for (int i = 0; i < 10; i++) {
				statefulBean3.addAluno("Aluno 2");
				System.out.println(statefulBean3.getAlunos().size());
			}

			System.out.println("***********************");
			System.out.println("******** Teste com a primeira conexão ******");
			System.out.println("***********************");

			System.out.println("Stateful");
			System.out.println(statefulBean1.getReferencia());
			for (int i = 0; i < 10; i++) {
				statefulBean1.addAluno("Aluno " + i);
				System.out.println(statefulBean1.getAlunos().size());
			}
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
