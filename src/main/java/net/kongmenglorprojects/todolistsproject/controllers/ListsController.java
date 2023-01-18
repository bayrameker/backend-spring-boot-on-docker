package net.kongmenglorprojects.todolistsproject.controllers;

import net.kongmenglorprojects.todolistsproject.dto.addListDTO;
import net.kongmenglorprojects.todolistsproject.entities.ListsEntity;
import net.kongmenglorprojects.todolistsproject.services.ListsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/tasks")
@RestController
@CrossOrigin
public class ListsController {
    ListsService listsService;

    public ListsController(ListsService listsService) {
        this.listsService = listsService;
    }
    @DeleteMapping
    public void deleteTask(@RequestParam Long id) {
        this.listsService.deleteTask(id);
    }
    @PutMapping
    public ListsEntity editTask(@RequestBody addListDTO dto) {
        return this.listsService.editTask(dto);
    }
}
