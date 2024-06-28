package com.github.dalwid.forumhub.domain.topicos;

import com.github.dalwid.forumhub.domain.cursos.Curso;
import com.github.dalwid.forumhub.domain.usuario.Usuario;


public class Topico {

    private Long id;
    private String titulo;
    private String mensagem;
    private String dataCriacao;
    private boolean status;
    private Usuario autor;
    private Curso curso;
    private String respostas;

}
