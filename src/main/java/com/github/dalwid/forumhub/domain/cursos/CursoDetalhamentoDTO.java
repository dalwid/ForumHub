package com.github.dalwid.forumhub.domain.cursos;

public record CursoDetalhamentoDTO(Long id, String nome, String Categoria)
{
    public CursoDetalhamentoDTO(Curso curso){
        this(curso.getId(), curso.getNome(), curso.getCategoria());
    }
}
