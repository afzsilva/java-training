package org.example.orientacaoobjetos.narutooo.heranca;

public class Uzumaki extends Ninja{

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void modoSabioAtivado(){
        System.out.println("Meu nome é "+this.getNome()+" O modo sabio Ativou, eu sou um Uzumaki");
    }

}
