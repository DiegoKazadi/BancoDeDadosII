package br.unifacisa.bd;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProjetoTest {

	@Test
	public void cadastroDeAlunoEmProjeto() {
		
		Professor professor = new Professor();
		
		Projeto projeto = ProjetoFactory.createProjeto(professor);
		
		Aluno aluno = new Aluno();
		
		try {
			projeto.addAluno(aluno);	
		} catch (Exception e) {
			// TODO: handle exception
			fail(e.getMessage());
		}
	}

}
