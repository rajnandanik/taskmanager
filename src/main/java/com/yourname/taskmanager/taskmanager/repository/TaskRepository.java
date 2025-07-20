package com.yourname.taskmanager.taskmanager.repository;
import com.yourname.taskmanager.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long>{
}
