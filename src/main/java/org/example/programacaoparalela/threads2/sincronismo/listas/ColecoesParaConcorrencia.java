package org.example.programacaoparalela.threads2.sincronismo.listas;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class ColecoesParaConcorrencia {
    /*CopyOnWriteArrayList Resolve problema sunchronized e é Thread safe
    mas é muito pesada não recomendado para muitas operações de escritas */
    private static List<String> lista = new CopyOnWriteArrayList<>();//Thread safe list

    private static Map<Integer,String> mapa = new ConcurrentHashMap<>();//Thread Safe Map

    private static BlockingQueue fila = new LinkedBlockingQueue(2);//Thread Safe Fila

    public static void main(String[] args) throws InterruptedException {

        Runnable meuRunnable = factoryRunnableCollection(3);//teste sem synchronized

        Thread t0 = new Thread(meuRunnable);
        Thread t1 = new Thread(meuRunnable);
        Thread t2 = new Thread(meuRunnable);

        t0.start();
        t1.start();
        t2.start();
        Thread.sleep(500);
        System.out.println(lista);
        System.out.println(mapa);
        System.out.println(fila);
    }

    /*
     * Dessa forma em algum momento a operação Add pode deixa de funcionar
     * por falta do uso do syncronized aplicado a lista
     * */
//    public static class MeuRunnable implements Runnable{
//        @Override
//        public void run() {
//            lista.add("Conteudo qualquer");
//            System.out.println(Thread.currentThread().getName()+" add na lista");
//        }
//    }

    private static Runnable factoryRunnableCollection(int tipo){

        switch (tipo){
            case 1:
                return new MeuRunnableList();
            case 3:
                return new MeuRunnableQueue();
            case 2:
                return new MeuRunnableMap();
            default:return null;
        }
    }


    public static class MeuRunnableMap implements Runnable{
        @Override
        public void run() {
            mapa.put(new  Random().nextInt(),"Adicionando conteudo");
            System.out.println(Thread.currentThread().getName()+" add no mapa");
        }
    }

    public static class MeuRunnableList implements Runnable{
        @Override
        public void run() {
            lista.add("Add conteudo na lista");
            System.out.println(Thread.currentThread().getName()+" add na lista");
        }
    }

    public static class MeuRunnableQueue implements Runnable{
        @Override
        public void run() {
            fila.add("Beleza add na fila");
            System.out.println(Thread.currentThread().getName()+" add na Fila");
        }
    }
}
