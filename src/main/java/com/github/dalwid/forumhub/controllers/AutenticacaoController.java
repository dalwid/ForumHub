package com.github.dalwid.forumhub.controllers;

import com.github.dalwid.forumhub.domain.usuario.AuthenticationDTO;
import com.github.dalwid.forumhub.domain.usuario.Usuario;
import com.github.dalwid.forumhub.infra.security.tokens.DadosTokenJWTDTO;
import com.github.dalwid.forumhub.infra.security.tokens.TokenService;
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

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid AuthenticationDTO authenticationDTO){
        var authenticationToken = new UsernamePasswordAuthenticationToken(authenticationDTO.email(), authenticationDTO.senha());
        var authentication =  manager.authenticate(authenticationToken);

        var tokenJWT = tokenService.gerarToken((Usuario) authentication.getPrincipal());

        return ResponseEntity.ok(new DadosTokenJWTDTO(tokenJWT));
    }

}
