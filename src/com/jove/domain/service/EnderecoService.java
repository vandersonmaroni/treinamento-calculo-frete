package com.jove.domain.service;

import java.io.Serializable;

import com.jove.domain.vo.Endereco;
import com.jove.infrastructure.dao.EnderecoDAO;

public class EnderecoService implements Serializable {
	private static final long serialVersionUID = 7546138812403961168L;

	/**
	 * Retorna um objeto Endereco com as informações encontradas a partir do CEP fornecido
	 * @param cep String
	 * @return Endereco
	 */
	public Endereco buscarEndereco(String cep) {
		cep = cep.replace("-", "");
		
		// TODO Após aprender CDI, criar atributo EnderecoDAO
		// na classe e injetá-lo ao invés de usar new EnderecoDAO()
		return new EnderecoDAO().buscarEndereco(cep);
	}
}