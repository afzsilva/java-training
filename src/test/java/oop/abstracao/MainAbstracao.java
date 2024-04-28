package oop.abstracao;

public class MainAbstracao {

    public static void main(String[] args) {
        MinhaClasseConcreta concreta = new MinhaClasseConcreta();
        concreta.meuMetodoConcreto();
        concreta.meuSegundoMetodoConcreto();
        concreta.meuMetodoAbstrato();
    }
}
