package com.github.dalwid.forumhub.repositories;

import com.github.dalwid.forumhub.domain.cursos.Curso;
import com.github.dalwid.forumhub.domain.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByEmail(String email);
}
