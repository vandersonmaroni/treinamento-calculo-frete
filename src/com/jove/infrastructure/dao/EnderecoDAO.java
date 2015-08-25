package com.jove.infrastructure.dao;

import java.sql.SQLException;

import com.jove.domain.enums.DatabaseEnum;
import com.jove.domain.vo.Cidade;
import com.jove.domain.vo.Endereco;
import com.jove.domain.vo.Regiao;
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
		Endereco endereco = new Endereco();
		try {
			abrirConexao(DatabaseEnum.ENDERECO);
			
			preparedStatement = connection.prepareStatement("SELECT * FROM tend_endereco WHERE cep = ?");
			preparedStatement.setString(1, cep);
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				String idBairro = resultSet.getString("id_bairro");
				String idCidade = resultSet.getString("id_cidade");
				
				endereco.setEndereco(resultSet.getString("endereco").toUpperCase());
				endereco.setCep(resultSet.getString("cep"));
				endereco.setBairro(buscarBairro(idBairro));
				endereco.setCidade(buscarCidade(idCidade));
				return endereco;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			fecharConexao();
		}
		return null;
	}

	/**
	 * Retorna o bairro referente ao ID informado
	 * @param idBairro
	 * @return String bairro
	 * @throws SQLException
	 */
	private String buscarBairro(String idBairro) throws SQLException {
		preparedStatement = connection.prepareStatement("SELECT bairro FROM tend_bairro WHERE id_bairro = ?");
		preparedStatement.setString(1, idBairro);
		resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			return resultSet.getString("bairro").toUpperCase();
		}
		return null;
	}
	
	/**
	 * Retorna um objeto Cidade referente ao ID informado
	 * @param idCidade
	 * @return Cidade
	 * @throws SQLException
	 */
	private Cidade buscarCidade(String idCidade) throws SQLException {
		Cidade cidade = new Cidade();
		preparedStatement = connection.prepareStatement("SELECT * FROM tend_cidade WHERE id_cidade = ? AND codigo_ibge <> 0");
		preparedStatement.setString(1, idCidade);
		resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			cidade.setIdCidade(resultSet.getInt("id_cidade"));
			cidade.setNomeCidade(resultSet.getString("cidade").toUpperCase());
			cidade.setUfCidade(resultSet.getString("uf").toUpperCase());
			String idRegiao = resultSet.getString("id_regiao");
			cidade.setRegiao(buscarRegiao(idRegiao));
		}
		return cidade;
	}
	
	/**
	 * Retorna um objeto Regiao referente ao ID informado
	 * @param idRegiao
	 * @return Regiao
	 * @throws SQLException
	 */
	private Regiao buscarRegiao(String idRegiao) throws SQLException {
		Regiao regiao = new Regiao();
		preparedStatement = connection.prepareStatement("SELECT * FROM tend_regiao WHERE id_regiao = ?");
		preparedStatement.setString(1, idRegiao);
		resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			regiao.setIdRegiao(resultSet.getInt("id_regiao"));
			regiao.setNomeRegiao(resultSet.getString("regiao").toUpperCase());
			regiao.setUf(resultSet.getString("uf").toUpperCase());
		}
		return regiao;
	}
}