package org.example.orientacaoobjetos.narutooo.heranca;

public class Boruto extends Uzumaki implements HyugaUzumaki{

    public Boruto() {
    }

    public Boruto(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }


    @Override
    public void ativarOkarma() {
        System.out.println("Meu nome é "+this.getNome()+" O karma Ativou, eu sou um Hyuga Uzumaki");
    }

    @Override
    public void ativarOJougan() {
        System.out.println("O Juogan Ativou com Sucesso!");
    }
}
