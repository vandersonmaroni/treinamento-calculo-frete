package com.jove.domain.vo;

import java.io.Serializable;

/**
 * Classe auxiliar à consulta de um endereco por CEP
 */
public class Endereco implements Serializable {
	private static final long serialVersionUID = 5066778726360716993L;
	
	private String cep;
	private String idBairro;
	private String idCidade;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String codigoIbgeCidade;
	private String codigoIbgeUf;
	
	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}
	
	/**
	 * @param cep the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	/**
	 * @return the idBairro
	 */
	public String getIdBairro() {
		return idBairro;
	}
	
	/**
	 * @param idBairro the idBairro to set
	 */
	public void setIdBairro(String idBairro) {
		this.idBairro = idBairro;
	}
	
	/**
	 * @return the idCidade
	 */
	public String getIdCidade() {
		return idCidade;
	}
	
	/**
	 * @param idCidade the idCidade to set
	 */
	public void setIdCidade(String idCidade) {
		this.idCidade = idCidade;
	}
	
	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}
	
	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}
	
	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
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

	/**
	 * @return the codigoIbgeCidade
	 */
	public String getCodigoIbgeCidade() {
		return codigoIbgeCidade;
	}

	/**
	 * @param codigoIbgeCidade the codigoIbgeCidade to set
	 */
	public void setCodigoIbgeCidade(String codigoIbgeCidade) {
		this.codigoIbgeCidade = codigoIbgeCidade;
	}

	/**
	 * @return the codigoIbgeUf
	 */
	public String getCodigoIbgeUf() {
		return codigoIbgeUf;
	}

	/**
	 * @param codigoIbgeUf the codigoIbgeUf to set
	 */
	public void setCodigoIbgeUf(String codigoIbgeUf) {
		this.codigoIbgeUf = codigoIbgeUf;
	}
}