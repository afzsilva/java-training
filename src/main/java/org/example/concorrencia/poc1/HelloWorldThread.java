package org.example.concorrencia.poc1;

public class HelloWorldThread extends Thread{

    @Override
    public void run() {
        System.out.println("Hello World");
    }
}
