package org.example.service;

import org.example.model.Task;

public class TaskService {

    public Task addTask( Task task,String description,String dueDate,String priority,boolean completd){

        task.setDescription(description);
        task.setDueDate(dueDate);
        task.setPriority(priority);
        task.setCompleted(completd);


        return task ;

    }

}
