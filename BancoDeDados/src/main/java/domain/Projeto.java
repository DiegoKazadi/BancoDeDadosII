/**
 * 
 */
package domain;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author diego kazadi
 *
 */
public class Projeto {
	 
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataFim == null) ? 0 : dataFim.hashCode());
		result = prime * result + ((dataInicio == null) ? 0 : dataInicio.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + id;
		result = prime * result + ((listaAlunos == null) ? 0 : listaAlunos.hashCode());
		result = prime * result + ((listaTecnologias == null) ? 0 : listaTecnologias.hashCode());
		result = prime * result + ((professor == null) ? 0 : professor.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		if (dataFim == null) {
			if (other.dataFim != null)
				return false;
		} else if (!dataFim.equals(other.dataFim))
			return false;
		if (dataInicio == null) {
			if (other.dataInicio != null)
				return false;
		} else if (!dataInicio.equals(other.dataInicio))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id != other.id)
			return false;
		if (listaAlunos == null) {
			if (other.listaAlunos != null)
				return false;
		} else if (!listaAlunos.equals(other.listaAlunos))
			return false;
		if (listaTecnologias == null) {
			if (other.listaTecnologias != null)
				return false;
		} else if (!listaTecnologias.equals(other.listaTecnologias))
			return false;
		if (professor == null) {
			if (other.professor != null)
				return false;
		} else if (!professor.equals(other.professor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	private String titulo;
	private String descricao;
	private Date dataInicio;
	private Date dataFim;
	private ArrayList <Aluno> listaAlunos;
	private ArrayList <Tecnologia> listaTecnologias;
	private int id;
	private Professor professor;
	
	
	/**
	 * @return the professor
	 */
	public Professor getProfessor() {
		return professor;
	}
	/**
	 * @param professor the professor to set
	 */
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	/**
	 * @param titulo
	 * @param descricao
	 * @param dataInicio
	 * @param dataFim
	 * @param listaAlunos
	 * @param listaTecnologias
	 */
	public Projeto(Professor professor) {
		super();
		this.professor = professor;
	}
	/**
	 * @return the listaAlunos
	 */
	public ArrayList<Aluno> getListaAlunos() {
		return listaAlunos;
	}
	/**
	 * @param listaAlunos the listaAlunos to set
	 */
	public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}
	/**
	 * @return the listaTecnologias
	 */
	public ArrayList<Tecnologia> getListaTecnologias() {
		return listaTecnologias;
	}
	/**
	 * @param listaTecnologias the listaTecnologias to set
	 */
	public void setListaTecnologias(ArrayList<Tecnologia> listaTecnologias) {
		this.listaTecnologias = listaTecnologias;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the dataInicio
	 */
	public Date getDataInicio() {
		return dataInicio;
	}
	/**
	 * @param dataInicio the dataInicio to set
	 */
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	/**
	 * @return the dataFim
	 */
	public Date getDataFim() {
		return dataFim;
	}
	/**
	 * @param dataFim the dataFim to set
	 */
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
}
