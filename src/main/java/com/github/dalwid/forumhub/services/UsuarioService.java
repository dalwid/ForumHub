package com.github.dalwid.forumhub.services;

import com.github.dalwid.forumhub.domain.usuario.Usuario;
import com.github.dalwid.forumhub.domain.usuario.UsuarioDTO;
import com.github.dalwid.forumhub.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> VerUsuarios() {
        return usuarioRepository.findAll();
    }

}
