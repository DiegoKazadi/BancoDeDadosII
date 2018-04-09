/**
 * 
 */
package br.unifacisa.bd.classes;

import br.unifacisa.bd.exercicio.IPessoa;

/**
 * @author aluno
 *
 */
public class Coordenador implements IPessoa {
	/**
	 * os atributos
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
	 * implementando o method
	 */
	public void ObtemSalario() {
		// TODO Auto-generated method stub
		System.out.println("O Salario de Coordenador eh :" +  "8.000");
	}
	
	public void Descricao() {
		// TODO Auto-generated method stub
		System.out.println("Nome da Pesso e o Cpf: " + nome);
	}
	
	
	
}
