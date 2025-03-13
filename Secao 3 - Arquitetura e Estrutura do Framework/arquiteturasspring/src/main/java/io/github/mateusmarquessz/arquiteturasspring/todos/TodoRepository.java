package io.github.mateusmarquessz.arquiteturasspring.todos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Anotacao de Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
}
