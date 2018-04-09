/**
 * 
 */
package br.unifacisa.fabrica;

import br.unifacisa.bd.classes.*;
import br.unifacisa.bd.enume.TipoPessoa;
import br.unifacisa.bd.exercicio.IPessoa;

/**
 * @author alunon kazadi
 *
 */
public class Fabrica {
	public static IPessoa CriaInstancia(TipoPessoa tipo) {
		if (tipo == TipoPessoa.Aluno) {
			return new Aluno();
		}
		if (tipo == TipoPessoa.Coordenador) {
			return new Coordenador();
		}
		if (tipo == TipoPessoa.Funcionario) {
			return new Funcionario();
		}
		return new Professor();
	}
	

}
