package org.example.programacaoparalela;

public class ThreadUtil {

    public static void printDados(Thread t){
        System.out.println("-----------------------------------------");
        System.out.println("NAME : "+t.getName());
        System.out.println("ID : "+t.getId());
        System.out.println("STATE : "+t.getState());
        System.out.println("PRIORITY : "+t.getPriority());
        System.out.println("IS_ALIVE : "+t.isAlive());
        System.out.println("STACK : "+t.getStackTrace());
    }
}
