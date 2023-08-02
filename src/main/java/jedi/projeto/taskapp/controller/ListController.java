package jedi.projeto.taskapp.controller;


import jedi.projeto.taskapp.model.entity.Task;
import jedi.projeto.taskapp.service.ListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tasks")
@RestController
@RequiredArgsConstructor


public class ListController {

    private final ListService listService;

    @GetMapping
    public List<Task> getAll(){
        return listService.getAll();
    }

    @GetMapping("/{id}")
    public Task getById(@PathVariable Long id){
        return listService.getById(id);
    }

    @PostMapping
    public Task save(@RequestBody Task task){
        return listService.save(task);
    }

    @PutMapping("/{id}")
    public Task update(@PathVariable Long id , @RequestBody Task task){
        return listService.update(id , task);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
    listService.delete(id);

    }
}


