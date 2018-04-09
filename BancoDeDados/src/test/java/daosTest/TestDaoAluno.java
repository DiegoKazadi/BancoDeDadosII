/**
 * 
 */
package daosTest;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import daos.AlunoDAO;
import domain.Aluno;
import fabrica.AlunoFactory;

/**
 * @author diego kazadi
 *
 */
public class TestDaoAluno {
	
	private static AlunoDAO dao;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new AlunoDAO();
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dao = null;
	}

	@Test
	public void testCriaAluno() {
		try {
			Aluno aluno = AlunoFactory.cria("Diego","1232131",4);
			dao.create(aluno);
			Aluno aluno1 = AlunoFactory.cria("Kamabi","8542131",6);
			dao.create(aluno1);
			Aluno aluno2 = AlunoFactory.cria("Nadine","9874563",5);
			dao.create(aluno2);
			Aluno aluno3 = AlunoFactory.cria("Caleb","9874563",5);
			dao.create(aluno3);
			Aluno aluno4 = AlunoFactory.cria("Carlos","8523697",7);
			dao.create(aluno4);
			
			dao.read();
			
		} catch (Exception e) {
			fail("Teste cria aluno deu uma exceção: " + e.getMessage() );
		}
	}

}
