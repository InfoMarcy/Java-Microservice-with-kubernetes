package com.bazdigital.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bazdigital.model.User;
import com.bazdigital.repository.UserRepository;

@CrossOrigin(origins = "http://hr-account-service:9090")
@RestController
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	UserRepository userService;

	// Get a list of all the employesss
	@GetMapping()
	public List<User> findAll() {
		return userService.findAll();
	}

	// get an employee by id
	@GetMapping("/{id}")
	public Optional<User> getUser(@PathVariable("id") String id) {
		return userService.findById(id);
	}

	// get an employee by username
	@GetMapping("/username/{username}")
	public User getUserByUsername(@PathVariable("username") String username) {
		return userService.findByUsername(username);
	}
	
	// get an employee by email
	@GetMapping("/email/{email}")
	public User getUserByEmail(@PathVariable("email") String email) {
		return userService.findByEmail(email);
	}

	
	// add a new employee
	@RequestMapping(method = RequestMethod.POST)
	public User AddEmployee(@RequestBody User user) {
		 userService.save(user);
		 return userService.findByUsername(user.getUsername());
	}
	
	
	// update an employee
	@RequestMapping(value= "/update", method = RequestMethod.PUT)
	public String updateEmployee(@RequestBody User user) {
		
		if(user != null) {
			userService.save(user);
			return "El siguiente usuario ha sido actualizado => " + user.getNombre() + " " + user.getApellidoPaterno() + " " + user.getApellidoPaterno();
		}
		
		return "incidencia actualizando el usuario";
		 
	}
	
	// delete an employee
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable String id) {

		try {
			Optional<User> user = userService.findById(id);
			if (user != null) {
				 userService.deleteById(user.get().getId());
				 return "El Usuario con Username => " + user.get().getUsername()  + " y id => "+ user.get().getId() + " ha sido eliminado.";
			}

		} catch (Exception e) {
			return "Hubo una incidencia el eliminar el usuario";
		}

		return "El usuario que esta tratando de eliminar no existe en la base de datos";

	}
	
	
	
	@GetMapping("/verify/{username}")
	public String verifyUserByUsername(@PathVariable("username") String username) {
		
		User verifyUser = userService.findByUsername(username);
		
		if(verifyUser != null) {
			return verifyUser.getId().toString();
		}
		return "No hay usuario con el siguiente username: " + username;
		
	}
		
	

}
