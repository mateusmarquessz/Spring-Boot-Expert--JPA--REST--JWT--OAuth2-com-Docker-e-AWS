package io.github.mateusmarquessz.librayapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "autor", schema = "public")
@Getter
@Setter
public class Autor {

    //Column nao eh obrigatorio, e Spring entende que o nome do atributo eh igual ao da coluna
    //Essas marcacoes eh obrigatorio quando voce quer uma boa definicao de entidades

    @Id //Falando que eh uma propriedade ID
    @Column(name = "id") //Colocando nome da Coluna
    @GeneratedValue(strategy = GenerationType.UUID) //Colocando o tipo de gerador no ID
    private UUID id;

    @Column(name = "nome", length = 100, nullable = false) // definindo tamanho, e definindo que nao pode ser null
    private String nome;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDateTime dataNascimento;

    @Column(name = "nacionalidade", length = 50, nullable = false)
    private String nacionalidade;

    @OneToMany(mappedBy = "autor")//mappedBy falando que nao eh uma coluna // Ta referenciando livros sendo 1 autor para muitos livros
    private List<Livro> livros;
}
