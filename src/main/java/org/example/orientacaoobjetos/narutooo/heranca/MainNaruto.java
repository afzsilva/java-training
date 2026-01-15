package org.example.orientacaoobjetos.narutooo.heranca;

public class MainNaruto {

    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto","Aldeia da Folha", 17);
        naruto.modoSabioAtivado();

        Uchiha sasuke = new Uchiha("Sasuke","Aldeia da Folha",18);;
        sasuke.sharingamAtivado();

        Haruno sakura = new Haruno("Sakura","Aldeia da Folha",18);
        sakura.ativarCura();

        Hyuga hinata = new Hyuga("Hinata","Aldeia da Folha",16);
        hinata.byakuganAtivado();

        System.out.println("==========================================================");
        Boruto boruto = new Boruto("Boruto Filho","Aldeia da Foha",12);
        boruto.ativarOkarma();
        boruto.ativarOJougan();
        boruto.modoSabioAtivado();


    }
}
