package com.github.dalwid.forumhub.domain.topicos;

public record TopicosDTO(
        String titulo,
        String mensagem,
        String autor,
        String curso
) {}
