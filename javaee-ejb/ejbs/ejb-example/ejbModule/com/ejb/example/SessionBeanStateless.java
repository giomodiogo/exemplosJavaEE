package com.ejb.example;

import javax.ejb.Stateless;

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
@Stateless
public class SessionBeanStateless implements ISessionBeanStatelessRemote {

	@Override
	public double somar(double num1, double num2) {
		return num1 + num2;
	}

	@Override
	public double subtrair(double num1, double num2) {
		return num1 - num2;
	}

	@Override
	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	@Override
	public double dividir(double num1, double num2) {
		return num1 / num2;
	}

	@Override
	public String getReferencia() {
		return toString();
	}

}
