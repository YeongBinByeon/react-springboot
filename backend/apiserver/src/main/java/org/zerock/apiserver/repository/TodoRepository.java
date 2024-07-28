package org.zerock.apiserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.apiserver.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
