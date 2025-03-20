package io.github.mateusmarquessz.arquiteturasspring.todos;

import org.springframework.stereotype.Service;

@Service // Annotation de Service.
public class TodoService {

    private TodoRepository repository;
    private TodoValidator validator;
    private MailSender mailSender;

    public TodoService(TodoRepository repository,
                       TodoValidator validator,
                       MailSender mailSender) {
        this.repository = repository;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        validator.validar(novoTodo);
        return repository.save(novoTodo);
    }

    public void atualizarStatusTodo(TodoEntity todo){
        repository.save(todo);
        String status = todo.getConcluido() == Boolean.TRUE ? "Concluido" : "Nao Concluido";
        mailSender.enviar("Esse Todo " + todo.getDescricao() + "Foi atualizado para " + status);
    }

    public TodoEntity BuscarOId(Integer id){
        return repository.findById(id).orElse(null);
    }
}
