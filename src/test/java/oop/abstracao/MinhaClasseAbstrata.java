package oop.abstracao;

public abstract class MinhaClasseAbstrata {
    public abstract void meuMetodoAbstrato();

    public void meuMetodoConcreto(){
        System.out.println("Metodo concreto implementado na classe abstrata");
    }

    public void meuSegundoMetodoConcreto(){
        System.out.println("Segundo metodo concreto implementado na classe abstrata");
    }
}
