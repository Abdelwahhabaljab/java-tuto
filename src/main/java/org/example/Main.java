package org.example;

import org.example.model.Task;
import org.example.service.TaskService;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskService taskService=new TaskService();
        Task myTask = new Task();
        taskService.addTask(myTask,"Support","26/11/2023","P1",false);
        System.out.println(myTask.getDescription());
        System.out.println("bon courage");




    }
}
