package com.github.dalwid.forumhub.domain.topicos;

import com.github.dalwid.forumhub.domain.cursos.Curso;
import com.github.dalwid.forumhub.domain.usuario.Usuario;

import java.time.LocalDateTime;

public record TopicoDetalhesDTO(
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        boolean status,
        Curso curso,
        Usuario autor
) {
}
