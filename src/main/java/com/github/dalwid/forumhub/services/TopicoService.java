package com.github.dalwid.forumhub.services;

import com.github.dalwid.forumhub.domain.cursos.Curso;
import com.github.dalwid.forumhub.domain.cursos.CursoDTO;
import com.github.dalwid.forumhub.domain.topicos.Topico;
import com.github.dalwid.forumhub.domain.topicos.TopicosDTO;
import com.github.dalwid.forumhub.domain.usuario.Usuario;
import com.github.dalwid.forumhub.domain.usuario.UsuarioDTO;
import com.github.dalwid.forumhub.repositories.CursoRepository;
import com.github.dalwid.forumhub.repositories.TopicoRepository;
import com.github.dalwid.forumhub.repositories.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.stream.Collectors;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CursoRepository cursoRepository;


     Topico  topico = new Topico();


    @Transactional
    public Topico cadastroTopicos(TopicosDTO topicosDTO){
        Topico  topico = new Topico();

        topico.setTitulo(topicosDTO.titulo());
        topico.setMensagem(topicosDTO.mensagem());
        topico.setCurso(cursoRepository.findById(topicosDTO.curso().getId()).get());
        topico.setUsuario(usuarioRepository.findById(topicosDTO.usuario().getId()).get());

        return topicoRepository.save(topico);
    }

}
