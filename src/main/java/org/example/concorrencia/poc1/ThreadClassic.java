package org.example.concorrencia.poc1;

public class ThreadClassic {

    public static void main(String[] args) {

        exer1b();
        //exer1();
        //metodosDeUmaThread();

    }

    private static void exer1(){
        //Create a thread that prints "Hello, World!"
        HelloWorldThread helloWorldThread = new HelloWorldThread();
        helloWorldThread.start();
    }

    private static void exer1b(){
        //Create a thread that prints "Hello, World!"
        //new Thread(new HelloWorldThreadImpl()).start();
        Thread thread = new Thread(new HelloWorldThreadImpl());
        thread.start();
    }
    private static void metodosDeUmaThread(){

        Thread t1 = new Thread();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t1.getState());
        System.out.println(t1.getThreadGroup());
        System.out.println(t1.getContextClassLoader());
        System.out.println(t1.getPriority());
        t1.start();
    }
}
