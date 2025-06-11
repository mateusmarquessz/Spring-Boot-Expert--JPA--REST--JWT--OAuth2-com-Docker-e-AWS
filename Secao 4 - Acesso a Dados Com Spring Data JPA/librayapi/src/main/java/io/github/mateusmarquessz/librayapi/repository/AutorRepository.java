package io.github.mateusmarquessz.librayapi.repository;

import io.github.mateusmarquessz.librayapi.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<Autor, UUID> {

}
