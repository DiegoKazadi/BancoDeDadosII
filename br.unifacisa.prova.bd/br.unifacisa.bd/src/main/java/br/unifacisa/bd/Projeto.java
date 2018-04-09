package br.unifacisa.bd;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto {
	List<Aluno> alunos = new ArrayList<Aluno>();
	Professor professor;
	Date dataInicio;
	Date dataDoFim;
	
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

	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDataDoInicio() {
		// TODO Auto-generated method stub
		return ("O rojeto foi inicializado em : " + dataInicio);
	}

	public String getDataDoFim() {
		// TODO Auto-generated method stub
		return ("O rojeto foi inicializado em : " + dataDoFim);
	}

	public String getTitulo() {
		// TODO Auto-generated method stub
		return ("O nome do projeto é : " + projeto);
	}

	public String getProfessorResponsavel() {
		// TODO Auto-generated method stub
		return ("O responsavel do projeto é : " + professor);
	}

}
