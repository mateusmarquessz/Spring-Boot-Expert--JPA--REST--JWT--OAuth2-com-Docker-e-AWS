package io.github.mateusmarquessz.arquiteturasspring.todos;

import org.springframework.stereotype.Service;

@Service // Annotation de Service.
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        return repository.save(novoTodo);
    }

    public void atualizarStatusTodo(TodoEntity todo){
        repository.save(todo);
    }

    public TodoEntity BuscarOId(Integer id){
        return repository.findById(id).orElse(null);
    }
}
