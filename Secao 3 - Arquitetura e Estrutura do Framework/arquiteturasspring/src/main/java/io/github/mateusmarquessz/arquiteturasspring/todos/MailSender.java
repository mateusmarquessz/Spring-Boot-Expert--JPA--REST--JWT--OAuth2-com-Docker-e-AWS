package io.github.mateusmarquessz.arquiteturasspring.todos;


import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void enviar(String mensagem) {
        System.out.println("Mensagem: " + mensagem);
    }
}
