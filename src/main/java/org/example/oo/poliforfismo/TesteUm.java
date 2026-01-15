package org.example.oo.poliforfismo;

public class TesteUm {

    public static void main(String[] args) {
        //classe
        /*Animal animal = new Animal();
        animal.mover();*/

        AnimalI animaI;

        //animaI = new Peixe();
        //animaI = new Passaro();
        animaI = new Anfibio();
        animaI.mover();

    }
}
