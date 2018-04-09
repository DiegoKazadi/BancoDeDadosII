/**
 * 
 */
package fabrica;

import domain.Tecnologia;

/**
 * @author diego kazadi
 *
 */
public class TecnologiaFactory {
	
	public static Tecnologia criar(String nome, String descricao, String tipo,String area, String referencia) {
		//
		Tecnologia tecn = new Tecnologia(nome, descricao, tipo, area, referencia);
		return tecn;
	}

}
