package com.accounts.service;

import com.accounts.model.CuentaAhorros;
import com.accounts.model.CuentaPrimaria;

public interface AccountService {

	CuentaPrimaria createPrimaryAccount();

	CuentaAhorros createSavingsAccount();

}
