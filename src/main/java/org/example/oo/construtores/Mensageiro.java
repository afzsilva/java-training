package org.example.oo.construtores;

public class Mensageiro {

    public Mensageiro() {
        System.out.println("Eu sou uma instancia de "+getClass().getName());
    }

    public Mensageiro(int i){
        System.out.printf("Eu sou a instancia %d da classe %s \n",i+1,getClass().getName());
    }
}
