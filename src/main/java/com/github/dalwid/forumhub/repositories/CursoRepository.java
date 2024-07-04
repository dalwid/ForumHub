package com.github.dalwid.forumhub.repositories;

import com.github.dalwid.forumhub.domain.cursos.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Long> {


}
