package com.example.projectapirest.service;

import com.example.projectapirest.models.Usuario;

import java.util.Optional;

public interface ServiceUsuario {

    // La interfaz va tener metodos

    // Guardar usuario

    Usuario keepUsuario(Usuario usuario);

    // Prevenir un error -> obtener

    Optional<Usuario> obtainUsuario(int id);

    // Actualizar o modificar el usuario

    Usuario updateUsuario(int id, Usuario updateUsuario);

    // Eliminar un usuario

    boolean deleteUsuario(int id);

}
