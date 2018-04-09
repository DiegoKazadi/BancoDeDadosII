/**
 * 
 */
package daosTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import daos.ProjetoDAO;
import domain.Aluno;
import domain.Professor;
import domain.Projeto;
import fabrica.AlunoFactory;
import fabrica.ProfessorFactory;
import fabrica.ProjetoFactory;

/**
 * @author Diego Kazadi
 *
 */
public class TestDaoProjeto {
	
	private static ProjetoDAO dao;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		dao = new ProjetoDAO();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		dao = null;
	}

	@Test
	public void testCriaProjeto() {
		try{
				Professor professor = ProfessorFactory.cria("Adriano", "3652146-96");
				Projeto projeto = ProjetoFactory.cria(professor);
				dao.create(projeto);
				dao.read();
				dao.delete(projeto);
				
			} catch (Exception e) {
		}
		fail("Not yet implemented");
	}

}
