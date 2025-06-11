package io.github.mateusmarquessz.librayapi.model;


import jakarta.persistence.*;
import lombok.*;

import javax.naming.Name;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "livro")
@Data // Data vai ser composto por tudo isso da linha 15 a 18

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor


//Argumentos que sao utilizaves no lombok
//@NoArgsConstructor
//@AllArgsConstructor
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

    @Enumerated(EnumType.STRING) //Fala que o atributo eh uma enum do tipo String
    @Column(name = "genero", length = 30, nullable = false)
    private GeneroLivro genero;

    @Column(name = "preco", precision = 18, scale = 2)
    private BigDecimal preco;

    @ManyToOne // muitos para um
    @JoinColumn(name = "id_autor") // Ta procurando a Coluna
    private Autor idAutor;
}
