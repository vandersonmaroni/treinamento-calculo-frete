package com.jove.infrastructure.util.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLSyntaxErrorException;

import com.jove.domain.enums.DatabaseEnum;

/**
 * Classe de Conexão JDBC
 */
public class ConexaoJDBC {

	protected Connection connection;
	protected PreparedStatement preparedStatement;
	protected ResultSet resultSet;
	
	// Informações de usuário hardcoded somente neste exercício
	private static final String USERNAME = "usuario";
	private static final String PASSWORD = "senha";
	
	/**
	 * Cria e abre a conexão com a base de dados
	 */
	public void abrirConexao(DatabaseEnum databaseEnum) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/".concat(databaseEnum.getNomeDatabase());
			String username = ConexaoJDBC.USERNAME;
			String password = ConexaoJDBC.PASSWORD;
			connection = DriverManager.getConnection(url, username, password);
			
		} catch (SQLSyntaxErrorException e) {
			System.out.println("Erro de sintaxe na URL da conexão: ".concat(e.getMessage()));
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Fecha a conexão com a base de dados
	 */
	public void fecharConexao() {
		try {
			if(!connection.isClosed()) {
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}