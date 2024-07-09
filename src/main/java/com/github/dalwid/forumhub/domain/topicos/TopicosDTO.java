package com.github.dalwid.forumhub.domain.topicos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.github.dalwid.forumhub.domain.cursos.Curso;
import com.github.dalwid.forumhub.domain.cursos.CursoDTO;
import com.github.dalwid.forumhub.domain.usuario.Usuario;
import com.github.dalwid.forumhub.domain.usuario.UsuarioDTO;

public record TopicosDTO(
        Long id,
        String titulo,
        String mensagem,
        Curso curso,
        Usuario usuario
) {}

