package org.example.estrturadados.vetor;

public class MainVetor {

    public static void main(String[] args) {
        int size = 0;
        int vetor[] = new int[size+1];
        vetor[0] = 2;

        System.out.println("Tam : "+vetor.length);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
