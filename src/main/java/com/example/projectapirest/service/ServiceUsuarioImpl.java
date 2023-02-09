package com.example.projectapirest.service;

import com.example.projectapirest.models.Usuario;
import com.example.projectapirest.repository.RepositoryUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class ServiceUsuarioImpl implements ServiceUsuario {

    // IMPLEMENTACION Y LA LOGICA
    // Dando el estereotipo


    private final RepositoryUsuario repositoryUsuario;

    @Override
    public Usuario keepUsuario(Usuario usuario) {
        return repositoryUsuario.save(usuario);
    }

    @Override
    public Optional<Usuario> obtainUsuario(int id) {
        return Optional.ofNullable(repositoryUsuario.findById(id).orElseThrow(() -> {
            throw new RuntimeException();
        }));
    }

    @Override
    public Usuario updateUsuario(int id, Usuario updateUsuario) {
        // .get me trae el objeto
        // se actualiza

        Usuario buscarUsuario = repositoryUsuario.findById(id).get();
        buscarUsuario.setNombre(updateUsuario.getNombre());
        buscarUsuario.setApellido(updateUsuario.getApellido());
        buscarUsuario.setDireccion(updateUsuario.getDireccion());
        buscarUsuario.setTelefono(updateUsuario.getTelefono());
        repositoryUsuario.save(buscarUsuario);

        return repositoryUsuario.save(buscarUsuario);
    }

    @Override
    public boolean deleteUsuario(int id) {
        try {

            repositoryUsuario.deleteById(id);
            return true;

        } catch (Exception e) {

            return false;
        }
    }
}
