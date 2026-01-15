package org.example.programacaoparalela.threads3.indianos.fundamentos;

public class ThreadDemo2 {

    public static void main(String[] args) {
        Runnable tImpl = new MyThreadImpl();
        Thread thread = new Thread(tImpl);
        thread.start();
    }
}
