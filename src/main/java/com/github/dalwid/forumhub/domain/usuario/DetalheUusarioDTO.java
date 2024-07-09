package com.github.dalwid.forumhub.domain.usuario;

import com.github.dalwid.forumhub.domain.respostas.Resposta;
import com.github.dalwid.forumhub.domain.topicos.Topico;

import java.util.Set;

public record DetalheUusarioDTO(
        Long id,
        String nome,
        String email,
        Set<Perfil>perfil,
        Set<Resposta>resposta,
        Set<Topico> topico
) {}
