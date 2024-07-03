package com.github.dalwid.forumhub.controllers;

import com.github.dalwid.forumhub.domain.usuario.AuthenticationDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager;

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid AuthenticationDTO authenticationDTO){
        var token = new UsernamePasswordAuthenticationToken(authenticationDTO.email(), authenticationDTO.senha());
        var Authentication =  manager.authenticate(token);

        return ResponseEntity.ok().build();
    }

}
