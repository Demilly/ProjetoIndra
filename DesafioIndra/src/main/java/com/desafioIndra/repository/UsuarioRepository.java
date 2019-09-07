package com.desafioIndra.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafioIndra.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
   
	Optional<Usuario> findById(long id);
}
