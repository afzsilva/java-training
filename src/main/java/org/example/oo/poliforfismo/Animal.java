package org.example.oo.poliforfismo;

import java.util.Random;

public class Animal {

    public void mover(){

        double x = new Random().nextDouble();
        double y = new Random().nextDouble();
        System.out.printf("Animal se movendo localizado nas coordenadas X:%.2f e Y:%.2f ",x,y);
    }
}


