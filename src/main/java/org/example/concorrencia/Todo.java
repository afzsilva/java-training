package org.example.concorrencia;

import java.util.Random;

public class Todo {

    private static Random rand = new Random();

    public static void  work(int a, int b){
        print("started");
        for (int i = 0, n = rand.nextInt(b - a) + a; i < n ; ++i) {
            print("Working......");
            work();
        }
        print("terminated");
    }

    private static void print(String text){
        long id = Thread.currentThread().getId();
        System.out.println("["+ id +"] "+text);
    }

    private static void work(){
        double y;
        for (int i = 0; i < 100000L ; ++i) {
            y = Math.cos(Math.sqrt(rand.nextDouble()));
        }
    }

}
