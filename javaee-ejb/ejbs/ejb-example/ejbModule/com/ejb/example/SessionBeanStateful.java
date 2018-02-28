package com.ejb.example;

import java.util.LinkedList;
import java.util.List;

import javax.ejb.Stateful;

/**
 * 
 * @author Diogo Giomo
 * 
 *         Session bean Stateful mantém o estado por cliente. A cada nova
 *         conexão, cria um novo bean, dessa forma mantendo a atomicidade.
 *
 */
@Stateful
public class SessionBeanStateful implements ISessionBeanStatefulRemote {
	List<String> alunos = new LinkedList<>();

	@Override
	public void addAluno(String nomeAluno) {
		alunos.add(nomeAluno);
	}

	@Override
	public List<String> getAlunos() {
		return alunos;
	}

	@Override
	public String getReferencia() {
		return toString();
	}
}
