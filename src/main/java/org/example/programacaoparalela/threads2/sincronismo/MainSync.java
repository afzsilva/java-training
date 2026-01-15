package org.example.programacaoparalela.threads2.sincronismo;

public class MainSync {

    static int i = -1;//recurso

    public static void main(String[] args) {

        MeuRunnable meuRunnable = new MeuRunnable();//normal
        MeuRunnable2 meuRunnable2 = new MeuRunnable2();//synchronized
        MeuRunnable3 meuRunnable3 = new MeuRunnable3();//lock
        executaThread(meuRunnable2);

    }

    //cenario1 sem syncronized
    public static class MeuRunnable implements Runnable{

        @Override
        public void run() {
            i++;
            System.out.println(Thread.currentThread().getName()+" --> "+i);
        }
    }

    /**
     * synchronized -> elimina a concorrência em cima de um recurso
     */
    public static class MeuRunnable2 implements Runnable{

        @Override
        public synchronized void run() {
            i++;
            System.out.println(Thread.currentThread().getName()+" --> "+i);
        }
    }

    public static class MeuRunnable3 implements Runnable{
       static Object lock1 = new Object();
       static Object lock2 = new Object();
        @Override
        public void run() {
            synchronized (lock1){
                i++;
                System.out.println(Thread.currentThread().getName()+" --> "+i);
            }

            synchronized (lock2){
                i++;
                System.out.println(Thread.currentThread().getName()+" --> "+i);
            }
        }
    }



    private static void executaThread(Runnable meuRunnable){
        Thread t0 = new Thread(meuRunnable);
        Thread t1 = new Thread(meuRunnable);
        Thread t2 = new Thread(meuRunnable);
        Thread t3 = new Thread(meuRunnable);
        Thread t4 = new Thread(meuRunnable);

        //Paralelismo 5 executando ao mesmo tempo concorrendo pelo recurso
        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}
