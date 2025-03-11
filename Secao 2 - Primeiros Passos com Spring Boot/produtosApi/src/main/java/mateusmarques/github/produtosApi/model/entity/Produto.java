package mateusmarques.github.produtosApi.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//POJO
@Entity // Ele serve para definir uma classe Java como uma entidade JPA
@Table(name = "produto") //Serve caso o nome da tabela fosse outro
public class Produto {

    @Id
    @Column // Fala que eh uma coluna
    private String id;

    @Column //Nao eh obrigatorio no neste caso, pois e o mesmo nome na tabela
    private String nome;

    @Column(name = "descricao") // Caso fosse precisar da anotacao @Column
    private String descricao;

    @Column
    private Double preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
