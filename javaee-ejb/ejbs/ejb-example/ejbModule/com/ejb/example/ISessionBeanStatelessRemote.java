package com.ejb.example;

import javax.ejb.Remote;

@Remote
public interface ISessionBeanStatelessRemote {

	double somar(double num1, double num2);
	
	double subtrair(double num1, double num2);
	
	double multiplicar(double num1, double num2);
	
	double dividir(double num1, double num2);
	
	String getReferencia();

}
