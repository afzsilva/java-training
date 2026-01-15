package org.example.orientacaoobjetos.narutooo.heranca;

public class Hyuga extends Ninja{

    public Hyuga() {
    }

    public Hyuga(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void byakuganAtivado(){
        System.out.println("Meu nome é "+this.getNome()+" O byakugan Ativou, eu sou um Hyuga");
    }
}
