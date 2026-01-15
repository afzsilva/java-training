package org.example.programacaoparalela.threads3.indianos.fundamentos;

public class ThreadDemo {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" Iniciando");

        MyThread t1 = new MyThread();
        t1.start();

        try {
            System.out.println(Thread.currentThread().getName());
            t1.join();//da um pause na thread corrente main
        } catch (InterruptedException e) {
           // throw new RuntimeException(e);
            System.out.println("Exception lançada");
        }

        System.out.println(Thread.currentThread().getName()+" Finalizando");
    }
}
