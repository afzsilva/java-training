package org.example.oo.construtores;

public class Televisao {

    public void ligar(){
        System.out.println("Ligando TV");
    }

    public void desligar(){
        System.out.println("Desligando TV");
    }


    public void aumentarVolume(int valor){
        System.out.println("Aumentando volume para "+valor);
    }


    public void abaixarVolume(int valor){
        System.out.println("Abaixando volume para "+valor);
    }
}
