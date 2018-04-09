/**
 * 
 */
package br.unifacisa.principal;

import br.unifacisa.bd.enume.TipoPessoa;
import br.unifacisa.bd.exercicio.IPessoa;
import br.unifacisa.fabrica.Fabrica;

/**
 * @author aluno kazadi
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPessoa pessoa = Fabrica.CriaInstancia(TipoPessoa.Professor);
		pessoa.ObtemSalario();
		IPessoaDAO pessoaDAO = Fabrica
	}

}
