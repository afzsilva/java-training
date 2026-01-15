package org.example.orientacaoobjetos.narutooo.heranca;

public class Uchiha extends Ninja{

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void sharingamAtivado(){
        System.out.println("Meu nome é "+this.getNome()+" O sharingan Ativou, eu sou um Uchira");
    }
}
