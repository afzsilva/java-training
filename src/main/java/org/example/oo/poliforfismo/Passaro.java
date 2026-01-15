package org.example.oo.poliforfismo;

public class Passaro implements AnimalI
{
    @Override
    public void mover() {
        System.out.println("Passaro voando alto");
    }
}
