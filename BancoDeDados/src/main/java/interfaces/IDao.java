/**
 * 
 */
package interfaces;

import java.util.ArrayList;

/**
 * @author diego kazadi
 * 			
 *
 */
public interface IDao<T> {
	
	public ArrayList<T> read();
	
	public T create(T obj);
	
	public void delete (T obj);
	
	public T update(T obj);
	

}
