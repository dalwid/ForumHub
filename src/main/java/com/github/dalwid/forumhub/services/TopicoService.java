package com.github.dalwid.forumhub.services;

import com.github.dalwid.forumhub.domain.topicos.Topico;
import com.github.dalwid.forumhub.domain.topicos.TopicosDTO;
import com.github.dalwid.forumhub.repositories.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public ResponseEntity<Topico> cadastroTopicos( TopicosDTO topicosDTO){
        return  null;
    }

}
