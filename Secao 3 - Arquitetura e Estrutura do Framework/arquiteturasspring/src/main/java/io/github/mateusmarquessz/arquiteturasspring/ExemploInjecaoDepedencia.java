package io.github.mateusmarquessz.arquiteturasspring;

import io.github.mateusmarquessz.arquiteturasspring.todos.*;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;

public class ExemploInjecaoDepedencia {
//    public static void main(String[] args) {
//        DriverManagerDataSource ds = new DriverManagerDataSource();
//        ds.setUrl("url");
//        ds.setUsername("username");
//        ds.setPassword("password");
//
//
//
//        Connection conn = ds.getConnection();
//
//        EntityManager entityManager = null;
//
//        TodoRepository repository =  new SimpleJpaRepository<TodoEntity, Integer>();
//
//        TodoValidator todoValidator = new TodoValidator(repository);
//
//        MailSender mailSender = new MailSender();
//
//        TodoService todoService = new TodoService(repository, todoValidator, mailSender);
//
//    }
}
