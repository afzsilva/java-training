package org.example.estrturadados.vetor;

public class Bee1022 {

    public static void main(String[] args) {
        sum("5+6");
    }


    private static void sum(String expression){

        String result[] = expression.split("\\+");
        System.out.println(result[1]);
    }
}
