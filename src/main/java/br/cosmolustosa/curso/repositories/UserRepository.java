package br.cosmolustosa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.cosmolustosa.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
