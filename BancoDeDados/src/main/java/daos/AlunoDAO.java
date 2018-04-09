/**
 * 
 */
package daos;

import java.util.ArrayList;

import domain.Aluno;
import domain.Professor;
import interfaces.IDao;

/**
 * @author diego kazadi 
 *
 */
public class AlunoDAO implements IDao<Aluno>{
	private ArrayList <Aluno> listaAluno = new ArrayList<Aluno>();
	private int id = 1;

	public ArrayList<Aluno> read() {
		// TODO Auto-generated method stub
		return listaAluno;
	}
	public Aluno create(Aluno obj) {
		// TODO Auto-generated method stub
		obj.setId(id++);
		listaAluno.add(obj);
		return obj;
	}
	public void delete(Aluno obj) {
		// TODO Auto-generated method stub
		listaAluno.remove(obj);
		id--;
		
	}
	public Aluno update(Aluno obj) {
		// TODO Auto-generated method stub
		for (int i = 0; i < listaAluno.size(); i++) {
			if (listaAluno.get(i).equals(obj)) {
				return listaAluno.set(i, obj);
			}
		}
		return null;
	}
}
