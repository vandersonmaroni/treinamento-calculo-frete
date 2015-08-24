package com.jove.infrastructure.util.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jove.domain.enums.DatabaseEnum;

/**
 * Classe de Conexão JDBC
 * @author Nicolas Ibanheiz
 */
public class ConexaoJDBC {

	protected Connection connection;
	protected PreparedStatement preparedStatement;
	protected ResultSet resultSet;
	
	private static String username = "";
	private static String password = "";
	
	/**
	 * Cria e abre a conexão
	 * @author Nicolas Ibanheiz 
	 */
	public void abrirConexao(DatabaseEnum databaseEnum) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/".concat(databaseEnum.getNomeDatabase());
			String username = ConexaoJDBC.username;
			String password = ConexaoJDBC.password;
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Fecha a conexão
	 * @author Nicolas Ibanheiz 
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