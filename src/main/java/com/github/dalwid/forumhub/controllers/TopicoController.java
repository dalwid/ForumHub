package com.github.dalwid.forumhub.controllers;

import com.github.dalwid.forumhub.domain.topicos.Topico;
import com.github.dalwid.forumhub.domain.topicos.TopicosDTO;
import jakarta.validation.Valid;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    public ResponseEntity<Topico> cadastroTopicos(@RequestBody @Valid TopicosDTO topicosDTO){
        return null;
    }

}
