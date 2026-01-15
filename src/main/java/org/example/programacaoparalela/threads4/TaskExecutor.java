package org.example.programacaoparalela.threads4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {

    public static void main(String[] args) {

        PrintTask task1 = new PrintTask("Task1");
        PrintTask task2 = new PrintTask("Task2");
        PrintTask task3 = new PrintTask("Task3");

        System.out.println("Starting executor");

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);

        // fecha ExecutorService -- ele decide quando fechar threads
        executorService.shutdown();

        System.out.printf("Tasks started, main ends.%n%n");
    }
}
