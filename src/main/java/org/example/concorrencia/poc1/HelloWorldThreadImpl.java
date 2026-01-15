package org.example.concorrencia.poc1;

public class HelloWorldThreadImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("!Hello World - IMPL");
    }
}
