package org.example.programacaoparalela.threads2.sincronismo.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncListasMain {
    private static List<String> lista = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        lista = Collections.synchronizedList(lista);//Sobrescreve a lista com uma lista syncroizadas
        MeuRunnable meuRunnable = new MeuRunnable();

        //MeuRunnable2 meuRunnable = new MeuRunnable2();//teste sem synchronized

        Thread t0 = new Thread(meuRunnable);
        Thread t1 = new Thread(meuRunnable);
        Thread t2 = new Thread(meuRunnable);

        t0.start();
        t1.start();
        t2.start();
        Thread.sleep(500);
        System.out.println(lista);
    }


    public static class MeuRunnable implements Runnable{
        @Override
        public void run() {
            //possivel solução
            synchronized (this){
              lista.add("Conteudo qualquer");
                System.out.println(Thread.currentThread().getName()+" add na lista");
            }
        }
    }

    /*
    * Dessa forma em algum momento a operação Add pode deixa de funcionar
    * por falta do uso do syncronized aplicado a lista
    * */
    public static class MeuRunnable2 implements Runnable{
        @Override
        public void run() {
                lista.add("Conteudo qualquer");
                System.out.println(Thread.currentThread().getName()+" add na lista");
        }
    }
}
