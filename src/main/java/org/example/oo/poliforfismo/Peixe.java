package org.example.oo.poliforfismo;

public class Peixe implements AnimalI {

    @Override
    public void mover() {
        System.out.println("Peixe nadando 1 metro por seg.");
    }
}
