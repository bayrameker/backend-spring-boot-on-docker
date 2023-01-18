package net.kongmenglorprojects.todolistsproject.repositories;

import net.kongmenglorprojects.todolistsproject.entities.AccountEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccountRepository extends CrudRepository<AccountEntity, Long> {
    Optional<AccountEntity> findByEmailAndPassword(String email, String password);
}
