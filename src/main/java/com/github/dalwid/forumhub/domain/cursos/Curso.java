package com.github.dalwid.forumhub.domain.cursos;

import com.github.dalwid.forumhub.domain.topicos.Topico;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "Curso")
@Table(name = "cursos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String categoria;

    @OneToMany(mappedBy = "curso")
    private Set<Topico> topico = new HashSet<>();


}
