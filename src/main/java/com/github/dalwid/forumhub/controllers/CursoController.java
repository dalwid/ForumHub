package com.github.dalwid.forumhub.controllers;

import com.github.dalwid.forumhub.domain.cursos.Curso;
import com.github.dalwid.forumhub.domain.cursos.CursoDTO;
import com.github.dalwid.forumhub.domain.cursos.CursoDetalhamentoDTO;
import com.github.dalwid.forumhub.services.CursoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {


    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PostMapping
    public ResponseEntity<Curso> cadastrarCurso(@RequestBody CursoDTO cursoDTO, UriComponentsBuilder uriBuilder){
        var curso = new Curso(cursoDTO);
        var uri = uriBuilder.path("/cursos/{id}").buildAndExpand(curso.getId()).toUri();

        return ResponseEntity.created(uri).body(this.cursoService.cadastrarCurso(cursoDTO));
    }

    @GetMapping
    public ResponseEntity<List<CursoDetalhamentoDTO>> listarCursos(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(cursoService.listarCursos().stream()
                        .map(CursoDetalhamentoDTO::new).toList());
    }

}
