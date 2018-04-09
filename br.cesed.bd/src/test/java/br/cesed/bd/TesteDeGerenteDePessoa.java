/**
 * 
 */
package br.cesed.bd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author aluno kazadi
 *
 */
public class TesteDeGerenteDePessoa {
	
	private Calculadora calculadora;
	
	@Before
	public void instanceCalculadora() {
		calculadora = new Calculadora();
	}
	
	@Test 
	public void CalculaMedia() {
		double media = calculadora.calculaMedia(10,7);
	}
	
	@After
	public void finalizaCalculadora() {
		calculadora = null;
	}

}
