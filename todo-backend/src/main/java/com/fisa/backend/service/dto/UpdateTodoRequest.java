package com.fisa.backend.service.dto;

import com.fisa.backend.model.Category;
import com.fisa.backend.model.Member;
import com.fisa.backend.model.Todo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateTodoRequest {

    private Long id;
    private String title;
    private String description;
    private String category;

    public UpdateTodoRequest() {
    }

    public UpdateTodoRequest(Long id, String title, String description, String category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
    }

    public Todo toTodo(Member member, Category category) {
        return Todo.builder()
                .member(member)
                .category(category)
                .title(title)
                .description(description).build();
    }
}
