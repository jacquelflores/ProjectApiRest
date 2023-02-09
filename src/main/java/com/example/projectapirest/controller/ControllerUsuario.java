package com.example.projectapirest.controller;

import com.example.projectapirest.models.Usuario;
import com.example.projectapirest.service.ServiceUsuario;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class ControllerUsuario {

    private final ServiceUsuario serviceUsuario;

    @PostMapping
    public ResponseEntity guardarUsuario(@RequestBody Usuario usuario) {

        return new ResponseEntity(serviceUsuario.keepUsuario(usuario), HttpStatus.CREATED);

    }

    @GetMapping("/{id}")
    public ResponseEntity obtenerUsuario(@PathVariable("id") int id) {

        return new ResponseEntity(serviceUsuario.obtainUsuario(id), HttpStatus.OK);

    }

    @PutMapping("/{id}")
    public ResponseEntity modificarUsuario(@PathVariable("id") int id, @RequestBody Usuario usuario) {

        return new ResponseEntity(serviceUsuario.updateUsuario(id, usuario), HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarUsuario(@PathVariable("id") int id) {

        boolean respuesta = serviceUsuario.deleteUsuario(id);

        if (respuesta == true) {

            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }


}
