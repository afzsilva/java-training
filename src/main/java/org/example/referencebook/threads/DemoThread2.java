package org.example.referencebook.threads;

public class DemoThread2 {

    public static void main(String[] args) {

        MinhaThread2 minhaThread2 = new MinhaThread2();

        Thread thread = new Thread(minhaThread2);
        thread.run();
    }
}
