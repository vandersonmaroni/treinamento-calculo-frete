package com.jove.domain.vo;

import java.io.Serializable;

/**
 * Classe auxiliar à consulta das Regiões cadastradas na base de endereços
 */
public class Regiao implements Serializable {
	private static final long serialVersionUID = 2050468344611821567L;
	
	// TODO Implementar métodos hashCode e equals no final da classe
	private int idRegiao;
	private String nomeRegiao;
	private String uf;
	
	/**
	 * @return the idRegiao
	 */
	public int getIdRegiao() {
		return idRegiao;
	}
	
	/**
	 * @param idRegiao the idRegiao to set
	 */
	public void setIdRegiao(int idRegiao) {
		this.idRegiao = idRegiao;
	}

	/**
	 * @return the nomeRegiao
	 */
	public String getNomeRegiao() {
		return nomeRegiao;
	}

	/**
	 * @param nomeRegiao the nomeRegiao to set
	 */
	public void setNomeRegiao(String nomeRegiao) {
		this.nomeRegiao = nomeRegiao;
	}

	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}
}