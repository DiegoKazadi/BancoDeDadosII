package br.unifacisa.bd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProjetoTest {
	
	private  Projeto projeto = null;
	
	@Before
	public void setUp() throws Exception{
		projeto = new Projeto(); // the default constructs
	}
	
	@Test 
	public void testCreateProjeto(){
		assertTrue(projeto.getDescription() != null);
		assertTrue(projeto.getDataDoInicio() != null);
		assertTrue(projeto.getDataDoFim() != null);
		assertTrue(projeto.getTitulo() != null);
		assertTrue(projeto.getProfessorResponsavel() != null);
		
	}
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
