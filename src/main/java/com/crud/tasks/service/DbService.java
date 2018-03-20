package com.crud.tasks.service;

import com.crud.tasks.repository.TaskRepository;
import com.crud.tasks.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks()
    {
     return  taskRepository.findAll();
    }

    public Task getTaskById(final Long id) {
        return taskRepository.findOne(id);
    }

}

