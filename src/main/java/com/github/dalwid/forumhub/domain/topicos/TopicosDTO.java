package com.github.dalwid.forumhub.domain.topicos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dalwid.forumhub.domain.cursos.Curso;
import com.github.dalwid.forumhub.domain.usuario.Usuario;

import java.io.Serializable;

public record TopicosDTO (
        Long id,
        String titulo,
        String mensagem,
        @JsonProperty("curso_id") Long curso,
        @JsonProperty("usuario_id") Long autor
)
{}


