/**
 * 
 */
package br.cesed.bd;

/**
 * @author aluno kazadi
 *
 */
public class Pessoa {
	public String nome;
	public String cpf;
	
	/**
	 * 
	 * @param nome
	 * @param cpf
	 */
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
