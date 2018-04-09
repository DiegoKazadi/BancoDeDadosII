/**
 * 
 */
package fabrica;

import domain.Professor;

/**
 * @author diego kazadi
 *
 */
public class ProfessorFactory {
	
	public static Professor cria(String nome, String matricula) {
		 Professor professor = new Professor(nome, matricula);
		return professor;
	}

}
