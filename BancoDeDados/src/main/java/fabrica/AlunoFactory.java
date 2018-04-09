/**
 * 
 */
package fabrica;

import ExceptionClasses.MatriculaInvalidaException;
import ExceptionClasses.PeriodoInvalidoException;
import domain.Aluno;

/**
 * @author diego kazadi
 *
 */
public class AlunoFactory {
	
	
	public static Aluno cria(String nome, String matricula, int periodo) throws PeriodoInvalidoException, MatriculaInvalidaException {
		if (periodo > 4) {
			throw new PeriodoInvalidoException();		
		}
		if (matricula == null) {
			throw new MatriculaInvalidaException();
		}
		return new Aluno(nome, matricula, periodo);
	}

}
