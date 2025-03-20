package io.github.mateusmarquessz.arquiteturasspring.todos;

import org.springframework.stereotype.Component;

@Component // Isso indica que essa classe vai parte do Container Spring
//ele e o pai de todos os Components
public class TodoValidator {

    private TodoRepository repository;

    public TodoValidator(TodoRepository repository){
        this.repository = repository;
    }

    public void validar(TodoEntity todo){
        if(existeTodoComDescricao((todo.getDescricao()))){
            throw new IllegalArgumentException("Ja existe um TODO com esta descricao");
        }
    }


    private boolean existeTodoComDescricao(String descricao){
       return repository.ExistByDescricao(descricao);
    }
}
