package org.example.referencebook.enums.ex2;

import java.util.List;

public class EnumNumerosTest {

    public static void main(String[] args) {

        System.out.println(Numeros.PAR.getNumeroInternos());
        System.out.println(Numeros.IMPAR.getNumeroInternos());

         List<Integer> numeros =  List.of(98,6,9,12,55,3,4,6,77);

        System.out.println(numeros.stream()
                .filter(integer -> !Numeros.IMPAR.getNumeroInternos().contains(integer)).toList());


    }
}
