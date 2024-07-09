package com.github.dalwid.forumhub.repositories;

import com.github.dalwid.forumhub.domain.cursos.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {


    Curso findById(Curso curso);
}
