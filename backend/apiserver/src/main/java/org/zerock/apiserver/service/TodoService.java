package org.zerock.apiserver.service;

import jakarta.transaction.Transactional;
import org.zerock.apiserver.domain.Todo;
import org.zerock.apiserver.dto.TodoDTO;

@Transactional
public interface TodoService {

    TodoDTO get(Long tno);

    default TodoDTO entityToDTO(Todo todo){
        TodoDTO todoDTO =
                TodoDTO.builder()
                        .tno(todo.getTno())
                        .title(todo.getTitle())
                        .content(todo.getContent())
                        .complete(todo.isComplete())
                        .dueDate(todo.getDueDate())
                .build();

        return todoDTO;
    }

    default Todo dtoToEntity(TodoDTO todoDTO){

                return Todo.builder()
                        .tno(todoDTO.getTno())
                        .title(todoDTO.getTitle())
                        .content(todoDTO.getContent())
                        .complete(todoDTO.isComplete())
                        .dueDate(todoDTO.getDueDate())
                        .build();

    }

}