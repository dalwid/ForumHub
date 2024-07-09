package com.github.dalwid.forumhub.controllers;

import com.github.dalwid.forumhub.domain.usuario.Usuario;
import com.github.dalwid.forumhub.domain.usuario.UsuarioDTO;
import com.github.dalwid.forumhub.repositories.UsuarioRepository;
import com.github.dalwid.forumhub.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> verUsuarios(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.VerUsuarios());
    }


}
