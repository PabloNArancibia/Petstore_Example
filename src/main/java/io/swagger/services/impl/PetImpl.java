package io.swagger.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.api.PetApiController;
import io.swagger.bo.User;
import io.swagger.model.Pet;
import io.swagger.repository.IUserRepository;
import io.swagger.services.IPet;

@Service
public class PetImpl implements IPet {
	
	
	private static final Logger log = LoggerFactory.getLogger(PetImpl.class);
	
	@Autowired
	private IUserRepository iUserRepository;

	@Override  
	public int agregarMascota(Pet p) {
		// Aqui se implementa la logica y se llama a la capa de datos
		int result=0;
		 try {
			List<User> listU = iUserRepository.findAll();
			for (User u : listU) {
				log.info(u.getUsername());
			} 
		} catch (Exception e) {
			log.error("Error buscando usarios", e);
		}
		if(p.getId() <= 1 && !p.getName().equalsIgnoreCase("") )// Aqui se valida la entrada
		{
		//Si esta OK se guarda en BD
			 result = 1;
		}
		//Si esta malo retorna error en result
		
		return result;
		
	}

	
}
