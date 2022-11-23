package com.inxinet.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inxinet.workshopmongo.domain.User;
import com.inxinet.workshopmongo.repository.UserRepository;
import com.inxinet.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	// atenção precisei fazer update método findOne para findById
	//https://stackoverflow.com/questions/49224010/i-cant-use-findone-method-in-my-code
	/*public User findById(String id) {
		Optional<User> user = repo.findById(id);
		if (user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return user.get();
	}*/
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
