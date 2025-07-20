package com.yourname.taskmanager.taskmanager.service;
import com.yourname.taskmanager.taskmanager.dto.TaskRequestDto;
import com.yourname.taskmanager.taskmanager.dto.TaskResponseDto;
import com.yourname.taskmanager.taskmanager.entity.Task;
import com.yourname.taskmanager.taskmanager.enums.Priority;
import com.yourname.taskmanager.taskmanager.enums.TaskStatus;
import com.yourname.taskmanager.taskmanager.exception.TaskNotFoundException;
import com.yourname.taskmanager.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public TaskResponseDto createTask(TaskRequestDto dto) {
        Task task = new Task();
        task.setTitle(dto.getTitle());
        task.setDescription(dto.getDescription());
        task.setStatus(dto.getStatus() != null ? dto.getStatus() : TaskStatus.PENDING);
        task.setPriority(dto.getPriority());
        task.setDueDate(dto.getDueDate());

        task = taskRepository.save(task);

        TaskResponseDto response = new TaskResponseDto();
        response.setId(task.getId());
        response.setTitle(task.getTitle());
        response.setDescription(task.getDescription());
        response.setStatus(task.getStatus());
        response.setPriority(task.getPriority());
        response.setDueDate(task.getDueDate());

        return response;
    }

    public List<TaskResponseDto> getAllTasks() {
        return taskRepository.findAll().stream().map(task -> {
            TaskResponseDto dto = new TaskResponseDto();
            dto.setId(task.getId());
            dto.setTitle(task.getTitle());
            dto.setDescription(task.getDescription());
            dto.setStatus(task.getStatus());
            dto.setPriority(task.getPriority());
            dto.setDueDate(task.getDueDate());
            return dto;
        }).collect(Collectors.toList());
    }

    public TaskResponseDto getTaskById(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new TaskNotFoundException("Task not found with id: " + id));
        TaskResponseDto dto = new TaskResponseDto();
        dto.setId(task.getId());
        dto.setTitle(task.getTitle());
        dto.setDescription(task.getDescription());
        dto.setStatus(task.getStatus());
        dto.setPriority(task.getPriority());
        dto.setDueDate(task.getDueDate());
        return dto;
    }
}
