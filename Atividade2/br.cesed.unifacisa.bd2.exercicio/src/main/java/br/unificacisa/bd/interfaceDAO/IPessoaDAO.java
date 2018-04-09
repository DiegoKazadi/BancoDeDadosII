/**
 * 
 */
package br.unificacisa.bd.interfaceDAO;

import java.util.List;

import br.unifacisa.bd.exercicio.IPessoa;

/**
 * @author aluno
 *
 */
public interface IPessoaDAO {
		
		public void Cadastra(IPessoa pessoa);
		public void Exclui(IPessoa pessoa);
		public IPessoa ObtemPessoaPor(String nome);
		public List<IPessoa> TodasAsPessoas();

}


