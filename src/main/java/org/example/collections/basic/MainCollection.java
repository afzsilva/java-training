package org.example.collections.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class MainCollection {

    public static void main(String[] args) {
        //teste1();

        Collection<String> myColletion = new ArrayList<>();

        /*Adiconar elementos a uma coleção * */
        myColletion.add("Uva");
        myColletion.add("Maça");
        myColletion.add("maça");
        myColletion.add("Pera");
        myColletion.add("Melancia");
        myColletion.add("");

        /*Remever elementos a uma coleção * */
        myColletion.remove("Maça");
        myColletion.remove("Jabuticaba");

        /*Contar elementos em uma coleção*/
        System.out.println("Quantidade de items na lista : "+myColletion.size());

        /*Verificar se a coleção esta vazia*/
        System.out.println("Esta vazia ? "+myColletion.isEmpty());

        /*Limpar uma lista*/
        //myColletion.clear();
        System.out.println("Esta vazia ? "+myColletion.isEmpty());

        /*checar se existe um conteúdo especifico na lista*/
        System.out.println("Contem ? "+myColletion.contains("Uva"));

        /*Remover elementos diante de uma condição atendida*/
        myColletion.removeIf(s -> s.toUpperCase().startsWith("M") || s.isEmpty());


        printListaForeach(myColletion);
        //printListaForeachLambda(myColletion);
        //printListaForeach(myColletion);
        //printListaForeachReferenceMethod(myColletion);
        //printListaIterator(myColletion);

    }

    private static void printListaForeach(Collection<String> collection){
        for (String s: collection){
            System.out.println(s);
        }
    }


    private static void printListaForeachLambda(Collection<String> collection){
        collection.forEach(s -> System.out.println(s));

    }

    private static void printListaForeachReferenceMethod(Collection<String> collection){
        collection.forEach(System.out::println);
    }


    private static void printListaIterator(Collection<String> collection){
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();;
            System.out.println(str);
        }
    }



    private static void teste1(){
        Collection<String>  l= new ArrayList<>();
        //nesse caso sempre retorna true
        System.out.println(l.add("OK"));
        System.out.println(l.add("OK"));
        for (String l1: l){
            System.out.println(l1);
        }

        //nesse caso apenas uma das linhas retorna true
        Collection<String> s = new HashSet<>();
        s.add("OK");
        s.add("OK");

        for (String s1: s){
            System.out.println(s1);
        }
    }
}
