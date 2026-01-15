package org.example.orientacaoobjetos.narutooo.heranca;

public class Haruno extends Ninja{

    public Haruno() {
    }

    public Haruno(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void ativarCura(){
        System.out.println("Meu nome é "+this.getNome()+" O modo cura Ativou, eu sou um Haruno");
    }
}
