package com.jove.domain.enums;

public enum DatabaseEnum {

	ENDERECO("omaha_endereco");

	private String nomeDatabase;

	DatabaseEnum(String nomeDatabase) {
		this.nomeDatabase = nomeDatabase;
	}

	/**
	 * @return nome da database
	 */
	public String getNomeDatabase() {
		return nomeDatabase;
	}
}