package com.github.dalwid.forumhub.domain.usuario;

public record UsuarioDTO(
        Long id,
        String nome,
        String email,
        String senha
) {
}
