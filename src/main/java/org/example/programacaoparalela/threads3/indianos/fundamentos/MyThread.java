package org.example.programacaoparalela.threads3.indianos.fundamentos;

public class MyThread extends Thread{

     public void run(){

         //Delay
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }

         System.out.println("Thread executando");
     }
}

