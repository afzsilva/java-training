package oop.heranca;

public abstract class Animal {

    //Metodo
    void fazerAlgo(){
        System.out.println("Fazendo algo que todo animal faz ZZZZ...dormir..ZZZ");
    }

    //Metdos abstratos
    abstract void comer();
    abstract void beber();
}
