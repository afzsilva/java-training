package org.example.orientacaoobjetos.narutooo.heranca.polimorfismo;

public class MainPolimorfismo {

    public static void main(String[] args) {

        sobrescritaDeMetodo();
    }


    private static void sobrescritaDeMetodo(){

        Uchiha uchiha = new Uchiha();
        uchiha.setNome("Sasuke");
        uchiha.habilidadeEspecial();

        Uzumaki uzumaki = new Uzumaki();

        uzumaki.setNome("Naruto");
        uzumaki.habilidadeEspecial();


    }
}
