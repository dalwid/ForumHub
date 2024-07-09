package com.github.dalwid.forumhub.domain.topicos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.dalwid.forumhub.domain.cursos.Curso;
import com.github.dalwid.forumhub.domain.respostas.Resposta;
import com.github.dalwid.forumhub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
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
    private LocalDateTime dataCriacao;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long usuario;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long curso;

    @OneToMany(mappedBy = "topico")
    private Set<Resposta> resposta = new HashSet<>();

    public Topico(TopicosDTO topicosDTO){
        this.titulo      = topicosDTO.titulo();
        this.mensagem    = topicosDTO.mensagem();
        this.dataCriacao = LocalDateTime.now();
        this.curso       = topicosDTO.curso();
        this.usuario     = topicosDTO.autor();

    }

}
