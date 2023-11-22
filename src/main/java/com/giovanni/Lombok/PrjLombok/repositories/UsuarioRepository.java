package com.giovanni.Lombok.PrjLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanni.Lombok.PrjLombok.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
