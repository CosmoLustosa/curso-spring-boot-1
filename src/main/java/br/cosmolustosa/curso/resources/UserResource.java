package br.cosmolustosa.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cosmolustosa.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User usuario = new User(1L, "Cosmo Lustosa", "cosmolustosa2@gmail.com", "99 9967-0239", "1234");
		return ResponseEntity.ok().body(usuario);
	}

}
