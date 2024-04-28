package oop.heranca;

public class Felino extends Animal{
    @Override
    void comer() {
        System.out.println("Comendo como um animal "+getClass());
    }

    @Override
    void beber() {
        System.out.println("Bebendo como um animal "+getClass());
    }
}
