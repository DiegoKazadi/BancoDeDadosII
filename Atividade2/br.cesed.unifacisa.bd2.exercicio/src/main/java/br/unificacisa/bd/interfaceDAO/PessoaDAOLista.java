package br.unificacisa.bd.interfaceDAO;

import java.util.ArrayList;
import java.util.List;

import br.unifacisa.bd.enume.TipoPessoa;
import br.unifacisa.bd.exercicio.IPessoa;

public class PessoaDAOLista implements IPessoaDAO {

	private ArrayList<IPessoa> lista = new ArrayList();

	public void Cadastra(IPessoa pessoa) {
		// TODO Auto-generated method stub
		lista.add(pessoa);
	}

	public void Exclui(IPessoa pessoa) {
		// TODO Auto-generated method stub

	}

	public IPessoa ObtemPessoaPor(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<IPessoa> TodasAsPessoas() {
		// TODO Auto-generated method stub
		for (IPessoa pessoa : lista) {
			pessoa.Descricao();
		}
		return null;
	}

}
