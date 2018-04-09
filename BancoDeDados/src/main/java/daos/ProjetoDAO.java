/**
 * 
 */
package daos;

import java.util.ArrayList;

import domain.Projeto;
import domain.Tecnologia;
import interfaces.IDao;

/**
 * @author diego kazadi
 *
 */
public class ProjetoDAO implements IDao<Projeto> {
	
	private ArrayList<Projeto> banco = new ArrayList<Projeto>();
	private int id = 1;

	public ArrayList<Projeto> read() {
		// TODO Auto-generated method stub
		return banco;
	}

	public Projeto create(Projeto obj) {
		// TODO Auto-generated method stub
		obj.setId(id++);
		banco.add(obj);
		return null;
	}

	public void delete(Projeto obj) {
		// TODO Auto-generated method stub
		banco.remove(obj);
		id--;
		
	}

	public Projeto update(Projeto obj) {
		// TODO Auto-generated method stub
		for (int i = 0; i < banco.size(); i++) {
			if (banco.get(i).equals(obj)) {
				return banco.set(i, obj);
			}
		}
		return null;

	}
}
