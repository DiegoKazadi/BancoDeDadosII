/**
 * 
 */
package br.unifacisa.bd.classes;

import br.unifacisa.bd.exercicio.IPessoa;

/**
 * @author aluno
 *
 */
public class Funcionario implements IPessoa{
	
	/**
	 * Os atributos da classe
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
		System.out.println("O Salario de Funcionario eh : 2.500");
	}
	
	public void Descricao() {
		// TODO Auto-generated method stub
		System.out.println("Nome da Pesso e o Cpf: " + nome);
	}
	
	
}
