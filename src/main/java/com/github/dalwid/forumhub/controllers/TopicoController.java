package com.github.dalwid.forumhub.controllers;

import com.github.dalwid.forumhub.domain.cursos.CursoDTO;
import com.github.dalwid.forumhub.domain.topicos.Topico;
import com.github.dalwid.forumhub.domain.topicos.TopicosDTO;
import com.github.dalwid.forumhub.domain.usuario.UsuarioDTO;
import com.github.dalwid.forumhub.repositories.TopicoRepository;
import com.github.dalwid.forumhub.services.TopicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public ResponseEntity<Topico> cadastroTopicos(@RequestBody TopicosDTO topicosDTO, UriComponentsBuilder uriBuilder){
        var topico = new Topico(topicosDTO);
        var uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();

        return ResponseEntity.created(uri).body(this.topicoService.cadastroTopicos(topicosDTO));



    }

}
