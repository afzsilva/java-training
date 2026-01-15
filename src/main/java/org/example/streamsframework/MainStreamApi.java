package org.example.streamsframework;

import java.util.ArrayList;
import java.util.List;

public class MainStreamApi {

    public static void main(String[] args) {

        ArrayList<Pessoa> list = new ArrayList<>();
        list.add(new Pessoa(12,"Andre"));
        list.add(new Pessoa(11,"Manoel"));
        list.add(new Pessoa(12,"Pedro"));
        list.add(new Pessoa(12,"Maria"));


       /* if (existeIdade(list,11)){
            System.out.println("Existe");
        }else {
            System.out.println("Não existe");
        }*/


        list.stream().forEach(pessoa -> System.out.println(pessoa.getIdade()));
        System.out.println(list.stream().map(pessoa -> pessoa.getIdade()).toList());
    }


    private static boolean existeIdade(List<Pessoa> pessoas, int idade){
        return pessoas.contains(idade);
    }



}
