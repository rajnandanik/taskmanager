package com.yourname.taskmanager.taskmanager.dto;
import com.yourname.taskmanager.taskmanager.enums.Priority;
import com.yourname.taskmanager.taskmanager.enums.TaskStatus;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class TaskRequestDto {
    @NotBlank(message = "Title is required")
    @Size(min = 3, max = 100)
    private String title;

    private String description;

    private TaskStatus status;

    private Priority priority;

    private LocalDate dueDate;

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
