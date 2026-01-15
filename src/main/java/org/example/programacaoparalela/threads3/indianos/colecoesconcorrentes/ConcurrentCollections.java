package org.example.programacaoparalela.threads3.indianos.colecoesconcorrentes;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollections {

    public static void main(String[] args) {

        concurrentHashMapDemo();
    }

    private static void concurrentHashMapDemo() {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        //Add entry
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);

        //remove
        map.remove("Two");

        //get value by key
        System.out.println(map.get("Three"));

        //iterate
        map.forEach((s, integer) -> System.out.println(s+" : "+integer));
    }


}
