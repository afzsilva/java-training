package org.example.referencebook.enums.ex2;

import java.util.Arrays;
import java.util.List;

public enum Numeros {

    IMPAR(Arrays.asList(1,3,5)),
    PAR(Arrays.asList(2,4,6));

    private List<Integer> numeroInternos;


    Numeros(List<Integer> numeros) {
        this.numeroInternos = numeros;
    }

    public List<Integer> getNumeroInternos() {
        return numeroInternos;
    }
}
