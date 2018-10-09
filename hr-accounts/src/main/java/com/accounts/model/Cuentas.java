package com.accounts.model;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Accounts")
public class Cuentas {
	

	private String id;
	
	private CuentaPrimaria cuentaPrimaria;
	private CuentaAhorros cuentaAhorros;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public CuentaPrimaria getCuentaPrimaria() {
		return cuentaPrimaria;
	}
	public void setCuentaPrimaria(CuentaPrimaria cuentaPrimaria) {
		this.cuentaPrimaria = cuentaPrimaria;
	}
	public CuentaAhorros getCuentaAhorros() {
		return cuentaAhorros;
	}
	public void setCuentaAhorros(CuentaAhorros cuentaAhorros) {
		this.cuentaAhorros = cuentaAhorros;
	}


}
