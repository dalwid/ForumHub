package com.github.dalwid.forumhub.repositories;

import com.github.dalwid.forumhub.domain.respostas.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespostaRepository extends JpaRepository<Resposta, Long> {
}
