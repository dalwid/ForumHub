package com.github.dalwid.forumhub.domain.usuario;

import com.github.dalwid.forumhub.domain.respostas.Resposta;
import com.github.dalwid.forumhub.domain.topicos.Topico;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Table(name = "usuarios")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;

    @ManyToMany
    @JoinTable(
            name = "usuario_perfil",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "perfil_id")
    )
    private Set<Perfil> perfil;

    @OneToMany(mappedBy = "usuario")
    private Set<Resposta> resposta = new HashSet<>();

    @OneToMany(mappedBy = "usuario")
    private Set<Topico> topico = new HashSet<>();

}
