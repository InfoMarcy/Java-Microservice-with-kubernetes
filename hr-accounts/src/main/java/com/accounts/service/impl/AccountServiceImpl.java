package com.accounts.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.accounts.model.CuentaAhorros;
import com.accounts.model.CuentaPrimaria;
import com.accounts.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService{
	
	// base number for the accountNumber
		private static int nextAccountNumber = 11223145;
		
		
		// create a primary account for the new user
		@Override
		public CuentaPrimaria createPrimaryAccount() {
			// initialize a new primaryAccount
			CuentaPrimaria cuentaPrimaria = new CuentaPrimaria();
			// set the balance of the newly create account to 0
			cuentaPrimaria.setBalance(new BigDecimal(0.0));
	        //assign an account number to the new account
			cuentaPrimaria.setNumeroDeCuenta(accountGen());

	        // return the model object
	        return cuentaPrimaria;
		}

		// create a savings account for the new user
		@Override
		public CuentaAhorros createSavingsAccount() {
			// initialize a new savingsAccount
			CuentaAhorros cuentaAhorros = new CuentaAhorros();
			// set the balance of the newly create account to 0
			cuentaAhorros.setBalance(new BigDecimal(0.0));
	      //assign an account number to the new account
			cuentaAhorros.setNumeroDeCuenta(accountGen());
	        // return the model object
	        return cuentaAhorros;
		}

		   // increase the accountNumber
		    private int accountGen() {
		        return ++nextAccountNumber;
		    }

}
