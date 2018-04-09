package br.unifacisa.bd;

import java.sql.Date;

public class ProjetoFactory {
	
	public static Projeto createProjeto(Professor professor) {
		return new Projeto(professor);
	}
	
	public static Date gerarData(Date data){
		return data;
	}
}
	 