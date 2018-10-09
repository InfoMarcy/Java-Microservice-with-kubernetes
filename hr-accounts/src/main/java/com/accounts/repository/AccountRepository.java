package com.accounts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.accounts.model.Cuentas;

@Repository("accountRepository")
public interface AccountRepository extends CrudRepository<Cuentas, String>{
	

	
}
