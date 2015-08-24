package com.jove.infrastructure.dao;

import java.sql.SQLException;

import com.jove.domain.enums.DatabaseEnum;
import com.jove.domain.vo.Endereco;
import com.jove.infrastructure.util.connection.ConexaoJDBC;

public class EnderecoDAO extends ConexaoJDBC {

	/**
	 * Retorna um objeto Endereco com as informações encontradas
	 * a partir do CEP fornecido
	 * @param cep String
	 * @return Endereco
	 * @throws SQLException
	 */
	public Endereco buscarEndereco(String cep) {
		try {
			abrirConexao(DatabaseEnum.ENDERECO);
			
			preparedStatement = connection.prepareStatement("SELECT * FROM tend_endereco WHERE cep = '?'");
			preparedStatement.setString(0, cep);
			resultSet = preparedStatement.getResultSet();
			
			if (resultSet.next()) {
				return preencherEndereco();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			fecharConexao();
		}
		return null;
	}

	/**
	 * Preenche o objeto Endereco com as informações encontradas
	 * @return Endereco
	 * @throws SQLException
	 */
	private Endereco preencherEndereco() throws SQLException {
		Endereco endereco = new Endereco();
		
		endereco.setEndereco(resultSet.getString("endereco").toUpperCase());
		endereco.setIdBairro(resultSet.getString("id_bairro"));
		endereco.setIdCidade(resultSet.getString("id_cidade"));
		
		// Pesquisando a cidade
		preparedStatement = connection.prepareStatement("SELECT cidade, uf, codigo_ibge FROM tend_cidade WHERE id_cidade = '?' AND codigo_ibge <> 0");
		preparedStatement.setString(0, endereco.getIdCidade());
		resultSet = preparedStatement.getResultSet();
		
		if (resultSet.next()) {
			endereco.setCidade(resultSet.getString("cidade").toUpperCase());
			endereco.setUf(resultSet.getString("uf").toUpperCase());
			endereco.setCodigoIbgeCidade(resultSet.getString("codigo_ibge"));
		} else {
			return null;
		}
		
		// Pesquisando o bairro
		preparedStatement = connection.prepareStatement("SELECT bairro FROM tend_bairro WHERE id_bairro = '?'");
		preparedStatement.setString(0, endereco.getIdBairro());
		resultSet = preparedStatement.getResultSet();
		
		if (resultSet.next()) {
			endereco.setBairro(resultSet.getString("bairro").toUpperCase());
		}
		return endereco;
	}
}