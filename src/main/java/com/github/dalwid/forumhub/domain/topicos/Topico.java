package com.github.dalwid.forumhub.domain.topicos;

import com.github.dalwid.forumhub.domain.cursos.Curso;
import com.github.dalwid.forumhub.domain.respostas.Resposta;
import com.github.dalwid.forumhub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "topicos")
@Entity(name = "Topico")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensagem;
    private String dataCriacao;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @OneToMany(mappedBy = "topico")
    private Set<Resposta> resposta = new HashSet<>();

}
