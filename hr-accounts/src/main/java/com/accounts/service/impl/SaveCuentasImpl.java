package com.accounts.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounts.model.Cuentas;
import com.accounts.repository.AccountRepository;
import com.accounts.service.AccountService;
import com.accounts.service.SaveCuentas;

@Service
public class SaveCuentasImpl implements SaveCuentas {
	
	
	// connect to the user repository
	@Autowired
	AccountRepository accountRepository;
	
	
	@Autowired
	AccountService accountService;
	
	
	public Cuentas create(String id) {
		// check if the user exist

		   Cuentas nuevaCuenta  = new Cuentas();
        	System.out.println("Creando nueva cuenta");
			// set the accounts for the new user
			nuevaCuenta.setCuentaPrimaria(accountService.createPrimaryAccount());
			nuevaCuenta.setCuentaAhorros(accountService.createSavingsAccount());
			nuevaCuenta.setId(id);
			// save the new user
			return accountRepository.save(nuevaCuenta);
		}

	}



