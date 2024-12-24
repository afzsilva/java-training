package org.example.referencebook.enums.ex1;

public class EnumDemo3 {
    public static void main(String[] args) {
        System.out.println("/*---------------Valore detalhados-------------------*/");
        for (Apple a: Apple.values()){
            //System.out.println("Valor na constante : "+a+" - "+a.getPrice());
            System.out.printf("Valor da constante [\t %s \t] = [\t%d\t] \n",a,a.getPrice());
        }

        System.out.println("/*---------------Valores das constatntes--------------*/");
        for (Apple a: Apple.values()){
            System.out.println(a.getPrice());
        }

        System.out.println("/*---------------Valor ordinal-------------------*/");
        for (Apple apple:Apple.values()){
            System.out.printf("Apple [\t %s \t] ordinal -> [ %d ] \n",apple, apple.ordinal());
        }
    }
}
