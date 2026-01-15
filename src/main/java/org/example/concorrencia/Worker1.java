package org.example.concorrencia;

public class Worker1 implements Runnable {

    @Override
    public void run() {
        Todo.work(2,5);
    }
}
