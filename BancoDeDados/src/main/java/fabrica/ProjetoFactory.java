/**
 * 
 */
package fabrica;

import java.util.ArrayList;
import java.util.Date;

import ExceptionClasses.AlunoInvalidoException;
import ExceptionClasses.ProfessorInvalidoException;
import ExceptionClasses.TecnologiaInvalidaException;
import domain.Aluno;
import domain.Professor;
import domain.Projeto;
import domain.Tecnologia;

/**
 * @author diego kazadi
 *
 */
public class ProjetoFactory {
	
	public static Projeto cria(Professor professor) throws TecnologiaInvalidaException, AlunoInvalidoException, ProfessorInvalidoException{		
		//
		if (professor.isOcupado()) {
			throw new ProfessorInvalidoException();
		}
		
		professor.setOcupado(true);
		
		return new Projeto(professor);
	}
}
