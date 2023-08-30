package jedi.projeto.taskapp.controller;


import jedi.projeto.taskapp.model.entity.Task;
import jedi.projeto.taskapp.service.ListService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tasks")
@RestController
@RequiredArgsConstructor


public class ListController {

    private final ListService listService;

    @GetMapping
    public ResponseEntity<List<Task>> getAll(){
        List<Task> taskResponse = listService.getAll();
        return ResponseEntity.ok(taskResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getById(@PathVariable Long id){
        Task taskResponse = listService.getById(id);
        return ResponseEntity.ok(taskResponse);
    }

    @PostMapping
    public ResponseEntity<Task> save(@RequestBody Task task){
        Task taskResponse = listService.save(task);
        return ResponseEntity.ok(taskResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> update(@PathVariable Long id , @RequestBody Task task){
        Task taskResponse = listService.update(id,task);
        return ResponseEntity.ok(taskResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        listService.delete(id);
        return ResponseEntity.ok().build();

    }
}


