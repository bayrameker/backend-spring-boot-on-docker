package net.kongmenglorprojects.todolistsproject.repositories;

import net.kongmenglorprojects.todolistsproject.entities.ListsEntity;
import org.springframework.data.repository.CrudRepository;

public interface ListsRepository extends CrudRepository<ListsEntity, Long> {
}
