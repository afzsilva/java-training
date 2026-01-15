package org.example.programacaoparalela.threads3.indianos.colecoesconcorrentes;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockinQueueDemo {

    public static void main(String[] args) {

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

        //producer Thread
        Thread producer = new Thread(()->{
            try {
                for (int i = 0; i < 5; i++) {
                    queue.put("Item "+i);
                    System.out.println("Produced Item "+i);
                    Thread.sleep(500);
                }

            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });

        //Consumer Thread
        Thread consumer = new Thread(()->{
            try {
                for (int i = 0; i < 5; i++) {
                    String item = queue.take();
                    System.out.println("Consumed "+item);
                    Thread.sleep(1000);
                }

            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
