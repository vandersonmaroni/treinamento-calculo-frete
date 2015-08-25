package com.jove.domain.vo;

import java.io.Serializable;

/**
 * Classe auxiliar à consulta de um Endereço por CEP
 */
public class Endereco implements Serializable {
	private static final long serialVersionUID = 5066778726360716993L;
	
	// TODO Implementar métodos hashCode e equals no final da classe
	private String cep;
	private String endereco;
	private String bairro;
	private Cidade cidade;
	
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
	public Cidade getCidade() {
		return cidade;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}