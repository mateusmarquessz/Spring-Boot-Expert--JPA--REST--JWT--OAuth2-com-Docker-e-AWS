package io.github.mateusmarquessz.arquiteturasspring;

import io.github.mateusmarquessz.arquiteturasspring.todos.TodoEntity;
import io.github.mateusmarquessz.arquiteturasspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanGerenciado {
    //Pode se utilizar qualquer uma delas

    @Autowired //Menos recomendado, nao denota obrigatoriedade e nao pode mudar a implementacao
    private TodoValidator validator;


    @Autowired //O spring recomenda que seja pelo Construtor.
    //Por causa da obrigatoriedade
    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }


    public void utilizar(){
        var todo = new TodoEntity();
        validator.validar(todo);
    }

    @Autowired // Este e opcional e voce pode mudar a implementacao
    public void setValidator(TodoValidator validator){
        this.validator = validator;
    }
}
