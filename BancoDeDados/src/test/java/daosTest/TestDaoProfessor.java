/**
 * 
 */
package daosTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import daos.ProfessorDAO;
import domain.Aluno;
import domain.Professor;
import fabrica.AlunoFactory;
import fabrica.ProfessorFactory;

/**
 * @author diego kazadi
 *
 */
public class TestDaoProfessor {
	
	public static ProfessorDAO dao;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		dao = new ProfessorDAO();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		dao = null;
	}

	@Test
	public void testAddicionar() {
		try {
			Professor professor = ProfessorFactory.cria("Adriano","123654-51");
			dao.create(professor);
		} catch (Exception e) {
			fail("Teste cria professor deu uma exceção: " + e.getMessage() );
		}
	}
	@Test
	public void testRemover() {
		try {
			Professor professor = ProfessorFactory.cria("Gemão","023454-59");
			dao.create(professor);
			dao.read();
			dao.delete(professor);
			
		} catch (Exception e) {
			fail("Teste cria professor deu uma exceção: " + e.getMessage() );
		}
	}	
	@Test
	public void testAtualizar() {
			try {
				Professor professor = ProfessorFactory.cria("Hamurabi","6548454-96");
				professor = dao.create(professor);
				professor.setMatricula("3652133-69");
				dao.update(professor);
				
				assertTrue(professor.getMatricula() == "3652133-69");
				
			} catch (Exception e) {
				fail("Professor não atualizado: " + e.getMessage() );
			}
		}	
		
	}
