package oop.abstracao;

public class MinhaClasseConcreta extends MinhaClasseAbstrata{
    private String frase;

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public void meuMetodoAbstrato() {
        System.out.println("Metodo abstrato sobrescrito na classe herdeira");
    }
}
