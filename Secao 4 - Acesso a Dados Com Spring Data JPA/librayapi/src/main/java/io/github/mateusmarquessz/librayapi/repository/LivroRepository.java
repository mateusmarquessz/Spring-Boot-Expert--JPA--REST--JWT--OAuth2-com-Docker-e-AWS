package io.github.mateusmarquessz.librayapi.repository;

import io.github.mateusmarquessz.librayapi.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {
}
