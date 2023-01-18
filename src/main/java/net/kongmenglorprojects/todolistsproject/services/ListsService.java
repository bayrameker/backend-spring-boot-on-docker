package net.kongmenglorprojects.todolistsproject.services;
import net.kongmenglorprojects.todolistsproject.dto.addListDTO;
import net.kongmenglorprojects.todolistsproject.entities.ListsEntity;
import net.kongmenglorprojects.todolistsproject.repositories.ListsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class ListsService {
    ListsRepository listsRepository;

    public ListsService(ListsRepository listsRepository) {
        this.listsRepository = listsRepository;
    }
    public ListsEntity editTask(addListDTO dto) {
        Optional<ListsEntity> task = this.listsRepository.findById(dto.id);
        if (task.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        if (dto.date != task.get().getDate()) {
            task.get().setDate(dto.date);
        }
        if (dto.title != "") {
            task.get().setTitle(dto.title);
        }
        if (dto.description != "") {
            task.get().setDescription(dto.description);
        }
        this.listsRepository.save(task.get());
        return task.get();
    }

    public void deleteTask(Long id) {
        Optional<ListsEntity> task = this.listsRepository.findById(id);
        if (task.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.listsRepository.delete(task.get());
    }
}
