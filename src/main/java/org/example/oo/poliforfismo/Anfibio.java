package org.example.oo.poliforfismo;

public class Anfibio implements AnimalI {
    @Override
    public void mover() {
        System.out.println("Anfibio (Sapo) pulando alto");
    }
}
