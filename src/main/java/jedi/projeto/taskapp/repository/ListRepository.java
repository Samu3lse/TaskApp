package jedi.projeto.taskapp.repository;

import jedi.projeto.taskapp.model.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ListRepository extends JpaRepository<Task,Long> {

    Optional<Task> getTaskByTitulo (String Titulo);

}
