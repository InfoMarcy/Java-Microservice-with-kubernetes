package com.accounts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.accounts.model.Cuentas;
import com.accounts.repository.AccountRepository;
import com.accounts.service.SaveCuentas;


@RestController
public class AccountController {

	@Autowired
	SaveCuentas saveCuentas;
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	// buscar cuentas
	@RequestMapping(method = RequestMethod.GET)
	public List<Cuentas> findAll() {
		return (List<Cuentas>) accountRepository.findAll();

	}

	// add new cuenta
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String createAccount(@PathVariable("id") String id) {

		if (!id.isEmpty()) {

			// create new user
			
			if(saveCuentas.create(id) != null) {
				return "Cuenta creada";
			} else {
				return "Este usuario ya tiene una cuenta creada con nosotros";
			}
			
		}
		return "Incidencia creando la cuenta";
	

	}
	

	@RequestMapping(value = "/create-accounts/{username}", method = RequestMethod.GET)
	public Cuentas getIdOfUsuario(@PathVariable("username") String username) {
		String response = restTemplate.getForObject("http://hr-core-service:8080/verify/" + username, String.class);

		if (!response.isEmpty()) {
			
			Cuentas cuenta = saveCuentas.create(response);
			return cuenta;

		}
		return null;

	}
	


}
