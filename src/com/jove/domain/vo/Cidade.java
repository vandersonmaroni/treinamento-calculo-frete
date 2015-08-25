package com.jove.domain.vo;

import java.io.Serializable;

/**
 * Classe auxiliar à consulta das Cidades cadastradas na base de endereços
 */
public class Cidade implements Serializable {
	private static final long serialVersionUID = 1872043811485084422L;
	
	// TODO Implementar métodos hashCode e equals no final da classe
	private int idCidade;
	private String nomeCidade;
	private String ufCidade;
	private int codigoIbge;
	private Regiao regiao;
	
	/**
	 * @return the idCidade
	 */
	public int getIdCidade() {
		return idCidade;
	}
	
	/**
	 * @param idCidade the idCidade to set
	 */
	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}
	
	/**
	 * @return the nomeCidade
	 */
	public String getNomeCidade() {
		return nomeCidade != null ? nomeCidade.toUpperCase() : null;
	}
	
	/**
	 * @param nomeCidade the nomeCidade to set
	 */
	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}
	
	/**
	 * @return the ufCidade
	 */
	public String getUfCidade() {
		return ufCidade;
	}
	
	/**
	 * @param ufCidade the ufCidade to set
	 */
	public void setUfCidade(String ufCidade) {
		this.ufCidade = ufCidade;
	}
	/**
	 * @return the codigoIbge
	 */
	public int getCodigoIbge() {
		return codigoIbge;
	}
	
	/**
	 * @param codigoIbge the codigoIbge to set
	 */
	public void setCodigoIbge(int codigoIbge) {
		this.codigoIbge = codigoIbge;
	}

	/**
	 * @return the regiao
	 */
	public Regiao getRegiao() {
		return regiao;
	}

	/**
	 * @param regiao the regiao to set
	 */
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}
}