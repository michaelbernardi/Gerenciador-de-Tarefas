package br.com.fiap.tasks;

import lombok.Data;

@Data
public class TaskContent {

    private Long id;
    private String titulo;
    private TaskStatus status;
}
