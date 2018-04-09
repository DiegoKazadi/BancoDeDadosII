/**
 * 
 */
package br.cesed.bd;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.*;
import org.junit.Test;

/**
 * @author aluno kazadi
 * 
 *
 */

public class testeSeAPessoaEMilton {
	
	/**
	 * 
	 */
	@Test
	public void testSeAPessoaEMilton() {
		
		try {
			Pessoa pessoa =  new Pessoa ("Milton", "111111111");
			
			if (pessoa.getNome() != "Milton") {
				fail("Brow, get out over here!!!");
			}
		} catch (Exception e) {
			assertTrue("Milton, you are The Boss", true);
		}
	}

}
