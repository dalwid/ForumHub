package com.github.dalwid.forumhub.exception;

public class UsuarioSemPerimssaoException extends RuntimeException{

    public UsuarioSemPerimssaoException(String mensagem){
        super(mensagem);
    }
}
