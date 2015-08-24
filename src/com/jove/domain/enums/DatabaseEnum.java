package com.jove.domain.enums;

public enum DatabaseEnum {

	ENDERECO("omaha_endereco"),
	GETLOG("omaha_getlog");

	private String nomeDatabase;

	DatabaseEnum(String nomeDatabase) {
		this.nomeDatabase = nomeDatabase;
	}

	/**
	 * @return sufixo do nome do sufixoDatabase
	 */
	public String getNomeDatabase() {
		return nomeDatabase;
	}
}