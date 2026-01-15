package org.example.programacaoparalela.threads3;

public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Minha custom thread");
    }
}
