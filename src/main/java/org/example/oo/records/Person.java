package org.example.oo.records;

public record Person(String name, int age) {

    private static int COUNT;

    static {
        COUNT = 0;
    }

    public static void displayCount(){
        System.out.printf("Counter : %d\n", COUNT++);
    }
}
