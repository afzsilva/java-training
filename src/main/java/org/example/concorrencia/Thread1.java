package org.example.concorrencia;

public class Thread1 {

    public static void main(String[] args) {

        new Thread(new Worker1()).start();
        new Worker2();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Todo.work(2,5);
            }
        }).start();

        new Thread(()-> Todo.work(2,5)).start();

        Todo.work(5,10);
    }
}
