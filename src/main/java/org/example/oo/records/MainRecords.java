package org.example.oo.records;

public class MainRecords {

    public static void main(String[] args) {
        var p = new Person("maria",15);
        System.out.printf("Name : %s idade : %d",p.name(), p.age());

        System.out.println();
        for (int i = 0; i < 5 ; i++) {
            Person.displayCount();
        }
    }
}
