package jedi.projeto.taskapp.service;

import jedi.projeto.taskapp.enumeration.DiaSemanaEnum;
import jedi.projeto.taskapp.exception.RecursoNaoEncontradoException;
import jedi.projeto.taskapp.model.entity.Task;
import jedi.projeto.taskapp.repository.ListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class ListService {

    private final ListRepository listRepository;

    public List<Task> getAll(){
        List<Task> result = listRepository.findAll();
        return result;
    }

    public Task getById(Long id){
        Optional <Task> result = listRepository.findById(id);
        if(result.isPresent()){
            return result.get();
        }
        else {
            throw new RecursoNaoEncontradoException("Recurso não encontrado");
        }
    }

    public Task save(Task task){

        Optional<Task> taskFromDataBase = listRepository.getTaskByTitulo(task.getTask());

        DiaSemanaEnum diaSemana = DiaSemanaEnum.getByNome(task.getDiaSemana());
        if (diaSemana == null){
            throw new RecursoNaoEncontradoException("Dia não Encontrado");
        }


        if(taskFromDataBase.isPresent()){
            throw new RecursoNaoEncontradoException();
        }else {
            Task result = listRepository.save(task);
            return result;
        }
    }

    public  Task update(Long id , Task task){
    this.getById(id);

    Optional<Task> taskFromDataBase = listRepository.getTaskByTitulo(task.getTask());

    if(taskFromDataBase.isPresent() && taskFromDataBase.get().getId() != task.getId()){
        throw new RecursoNaoEncontradoException();
    }Task result= listRepository.save(task);
    return result;
    }

    public void delete(Long id){
    getById(id);
        listRepository.deleteById(id);
    }
}
