package org.example.programacaoparalela.threads3;

import org.example.programacaoparalela.ThreadUtil;

public class Main {

    public static void main(String[] args) {
        Runnable r = new MyThread();
        Thread t = new Thread(r);
        t.start();

        System.out.println("Fim thread main");

        ThreadUtil.printDados(t);

    }
}
