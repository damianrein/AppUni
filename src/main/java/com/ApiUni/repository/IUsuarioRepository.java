package com.ApiUni.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiUni.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findByEmail(String email);
}
