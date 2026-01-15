package org.example.concorrencia;

public class Worker2 extends Thread{

    public Worker2() {
        start();
    }

    public void run(){
        Todo.work(2,5);
    }
}
