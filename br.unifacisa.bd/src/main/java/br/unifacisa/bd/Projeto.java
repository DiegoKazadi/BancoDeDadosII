package br.unifacisa.bd;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
	List<Aluno> alunos = new ArrayList<Aluno>();
	Professor professor;
	
	public Projeto(Professor professor) {
		this.professor = professor;
		professor.setProjeto(this);
	}
	
	public Projeto() throws Exception {
		if (this.professor == null) {
			throw new Exception("Alerta: O projeto não pode ser criado sem informar o professor responsável.");
		}
	}


	public void addAluno(Aluno aluno) throws Exception {
		// TODO Auto-generated method stub
		if(aluno.getPeriodo() >= 4) {
			alunos.add(aluno);
		}else {
			throw new Exception("Alerta: Aluno não está no período desejado.");
		}
		
	}

}
