package com.accounts.model;

import java.math.BigDecimal;

public class CuentaAhorros {

	private int numeroDeCuenta;
	private BigDecimal balance;


	public CuentaAhorros() {
		super();
	}






	public int getNumeroDeCuenta() {
		return numeroDeCuenta;
	}






	public void setNumeroDeCuenta(int numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}






	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}



}
