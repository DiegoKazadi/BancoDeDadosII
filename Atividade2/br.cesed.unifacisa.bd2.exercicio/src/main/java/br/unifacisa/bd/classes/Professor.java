/**
 * 
 */
package br.unifacisa.bd.classes;

import br.unifacisa.bd.exercicio.IPessoa;

/**
 * @author aluno
 *
 */
public class Professor implements IPessoa {
	
	/**
	 * os gatributos private
	 */
	private String nome;
	private String cpf;
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
	/**
	 * Implementando o method
	 */
	public void ObtemSalario() {
		// TODO Auto-generated method stub
		System.out.println("O Salario de Professor eh de 4.000 " );
	}
	
	public void Descricao() {
		// TODO Auto-generated method stub
		System.out.println("Nome da Pesso e o Cpf: " + nome);
	}
	
	

}
