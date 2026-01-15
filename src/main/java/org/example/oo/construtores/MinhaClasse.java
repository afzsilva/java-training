package org.example.oo.construtores;

public class MinhaClasse {

    String atributo;
    int numerico;

    public MinhaClasse(){
        System.out.println("Referencia da minha classe criada");
    }

    public MinhaClasse(String valor){
        //this.atributo = valor;
        this(valor, 0);
    }

    public MinhaClasse(String valor, int valorNumerico){
        this.atributo = valor;
        this.numerico = valorNumerico;
    }

    public void minhaAcao(){
        System.out.println("Executanação minha primeira ação");
    }

    public void minhaAcao(String argumento){
        System.out.println("Executando a sobrecarga do metodo "+argumento);
    }


}
