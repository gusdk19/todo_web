package com.fisa.backend.service.dto;

import com.fisa.backend.model.Todo;
import lombok.Builder;
import lombok.Getter;

@Getter
public class TodoResponse {

    private Long id;
    private String title;
    private String description;
    private String category;

    @Builder
    public TodoResponse(Long id, String title, String description, String category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
    }

    public static TodoResponse from(Todo todo) {
        return TodoResponse.builder()
                .id(todo.getId())
                .title(todo.getTitle())
                .description(todo.getDescription())
                .category(todo.getCategory().getName())
                .build();
    }
}
