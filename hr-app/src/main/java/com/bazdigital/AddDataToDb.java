package com.bazdigital;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bazdigital.model.Domicilio;
import com.bazdigital.model.User;
import com.bazdigital.repository.UserRepository;

@Component
public class AddDataToDb implements CommandLineRunner{
	
	// connect to the repository
	private UserRepository userRepository;
	
	//constructor to load the repository
	public AddDataToDb(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		
			
		User usuario1 = new User(
				"usuario_strong", "secret", "Hugo", "", "Cortes", "Perez", "alejandro@hotmail.com", "5510213679",  32, "M", "Desarrollador", "Casado", "GALM56000", "Cubano", "CALM87001HNE02RRR2","1990-02-01", "Extranjero", "url",
				 Arrays.asList(
						    new Domicilio("Moctezuma", "91", "102", "Soto y Lerdo", "Guerrero", "Cuauhtemoc", "Ciuidad de Mexico", "Mexico", "06800")
						 )
				);
				
				
				User usuario2 = new User(
				"naughty_vainilla", "secret", "Juana", "", "Cortes", "Rojas", "jauana@hotmail.com", "5510213979", 25, "F", "Asisente de Credito", "Soltera", "JAN67001", "Mexicana", "SOL90001HNE02RRR2","1990-02-01", "Mexico",  "url",
				 Arrays.asList(
						    new Domicilio("Luis Quintero", "102", "", "Luis y Soto", "Gustavo A. Madero", "Atzacualco", "Cuidad de Mexico", "Mexico", "07800")
						 )
				 
				);
				
				User usuario3 = new User(
						"Bailarina01", "bestdancerever", "Karina", "", "De La Rosa", "Rojas", "karina@hotmail.com", "5510213979", 19, "F", "Bartender", "Soltera", "SOL67001", "Mexicana", "DOL90001HNE02RRR2","1990-02-01", "Mexico",  "url",
						 Arrays.asList(
								    new Domicilio("Luis Quintero", "123", "", "Luis y Soto", "Gustavo A. Madero", "Atzacualco", "Cuidad de Mexico", "Mexico", "09300")
								 )
						 
						);
				
				User usuario4 = new User(
						"developer", "1234567", "Daniel", "", "Morales", "Rojas", "daniel@hotmail.com", "5510213979", 19, "F", "Bartender", "Soltera", "SOL67001", "Mexicana", "DOL90001HNE02RRR2","1990-02-01", "Mexico",  "url",
						 Arrays.asList(
								    new Domicilio("Luis Quintero", "123", "", "Luis y Soto", "Gustavo A. Madero", "Atzacualco", "Cuidad de Mexico", "Mexico", "09300")
								 )
						 
						);
				
				User usuario5 = new User(
						"angelito01", "angelcorrea", "Angel", "", "Correa", "Ortiz", "angel@hotmail.com", "5510213979", 19, "F", "Supervisor", "Casado", "SOL67001", "Mexicana", "DOL90001HNE02RRR2","1990-02-01", "Mexico",  "url",
						 Arrays.asList(
								    new Domicilio("Luis Quintero", "123", "", "Luis y Soto", "Gustavo A. Madero", "Atzacualco", "Cuidad de Mexico", "Mexico", "09300")
								 )
						 
						);
				
				
				userRepository.deleteAll();

			
					// ad ours hotel to the database
					//create a list to hold all the values
					List<User> users = Arrays.asList(usuario1, usuario2, usuario3, usuario4, usuario5); 
					// save and pass the list of hotels to the repository
					this.userRepository.saveAll(users);
				}
		
		
		
	}
	
