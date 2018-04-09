package br.unifacisa.bd;

public class ProjetoFactory {
	
	public static Projeto createProjeto(Professor professor) {
		return new Projeto(professor);
	}

}
