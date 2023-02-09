package com.example.projectapirest.repository;

import com.example.projectapirest.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RepositoryUsuario extends JpaRepository<Usuario, Integer> {

    //
}
