package io.github.mateusmarquessz.librayapi.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.naming.Name;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "livro")
@Getter
@Setter
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "isbn", length = 20, nullable = false)
    private String isbn;

    @Column(name = "titulo", length = 150, nullable = false)
    private String titulo;

    @Column(name = "data_publicacao", nullable = false)
    private LocalDateTime data_publicacao;

    @Column(name = "genero", length = 30, nullable = false)
    private String genero;

    @Column(name = "preco", precision = 18, scale = 2)
    private Double preco;

    @ManyToOne // muitos para um
    @JoinColumn(name = "id_autor") // Ta procurando a Coluna
    private Autor idAutor;
}
