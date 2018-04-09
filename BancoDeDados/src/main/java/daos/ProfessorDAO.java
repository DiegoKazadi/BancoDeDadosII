/**
 * 
 */
package daos;

import java.util.ArrayList;

import domain.Professor;
import interfaces.IDao;

/**
 * @author diego kazadi
 *
 */
public class ProfessorDAO implements IDao<Professor>{
	
	private ArrayList <Professor> listaProfessor = new ArrayList<Professor>();
	private int id = 1;

	public ArrayList<Professor> read() {
		// TODO Auto-generated method stub
		return listaProfessor;
	}

	public Professor create(Professor obj) {
		// TODO Auto-generated method stub
		obj.setId(id++);
		listaProfessor.add(obj);
		return obj;
	}

	public void delete(Professor obj) {
		// TODO Auto-generated method stub
		listaProfessor.remove(obj);
		id--;
		
	}

	public Professor update(Professor obj) {
		// TODO Auto-generated method stub
		for (int i = 0; i < listaProfessor.size(); i++) {
			if (listaProfessor.get(i).equals(obj)) {
				return listaProfessor.set(i, obj);
				
			}
		}
		return null;
	}

	

}
