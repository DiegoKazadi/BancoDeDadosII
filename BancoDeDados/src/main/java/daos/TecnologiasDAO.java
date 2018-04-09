/**
 * 
 */
package daos;

import java.util.ArrayList;

import domain.Tecnologia;
import interfaces.IDao;

/**
 * @author diego kazadi
 *
 */
public class TecnologiasDAO implements IDao<Tecnologia>{
	
	private ArrayList<Tecnologia> banco = new ArrayList<Tecnologia>();
	private int id = 1;
	
	public ArrayList<Tecnologia> read() {
		// TODO Auto-generated method stub
		return banco;
	}
	public Tecnologia create(Tecnologia obj) {
		// TODO Auto-generated method stub
		obj.setId(id++);
		banco.add(obj);
		return obj;
	}
	public void delete(Tecnologia obj) {
		// TODO Auto-generated method stub
		banco.remove(obj);
		id --;
		
	}
	public Tecnologia update(Tecnologia obj) {
		// TODO Auto-generated method stub
		for (int i = 0; i < banco.size(); i++) {
			if (banco.get(i).equals(obj)) {
				return banco.set(i, obj);
			}
		}
		return null;
	}

	
	

}
