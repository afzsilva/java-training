package org.example.programacaoparalela.threads3.indianos.fundamentos;

public class ThreadDemo3 {

    public static void main(String[] args) {
        MyThreadImpl tImpl = new MyThreadImpl();
        Thread thread = new Thread(tImpl);
        thread.start();


        //sleep
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //staticos da classe Thread
        Thread.yield();

        //join
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //priority
        thread.setPriority(10);


        //Herdados desde Object
        try {
            thread.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.notify();

        thread.notifyAll();

    }
}
