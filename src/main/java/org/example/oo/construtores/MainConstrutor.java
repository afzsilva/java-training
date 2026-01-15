package org.example.oo.construtores;

public class MainConstrutor {

    public static void main(String[] args) {

        /*for (int i = 0; i < 5; i++) {
            new Mensageiro(i);
        }*/

        /*Televisao controle;
        controle = new Televisao();
        controle.ligar();*/

        testeMinhaClasse();

        //testeScopo("ola");



    }

    static void testeMinhaClasse(){

        MinhaClasse areaDaMemoria = new MinhaClasse("Valor de incialização");
        System.out.println(areaDaMemoria.atributo);

        areaDaMemoria.minhaAcao();
        areaDaMemoria.minhaAcao("minhaAcao");

        var x = new MinhaClasse("Testando chamada do construto",10);
        System.out.println(x.atributo);
        System.out.println(x.numerico);
    }

    static void testeScopo(String x){
        //Scopo de do metodo
        String y = "ola";

        if(y == x){
        //scopo do if
             y = "";
         boolean r;
         r = true;
            System.out.println("deu certo "+r);
        }

        System.out.println("y = "+y);

    }
}
