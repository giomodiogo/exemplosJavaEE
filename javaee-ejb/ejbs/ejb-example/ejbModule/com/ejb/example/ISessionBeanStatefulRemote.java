package com.ejb.example;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface ISessionBeanStatefulRemote {

	void addAluno(String nomeAluno);

	List<String> getAlunos();
	
	String getReferencia();
}
