package org.example.datahora;

import java.time.LocalDate;

public class MainDataHora {

    public static void main(String[] args) {
        System.out.println("DATA ATUAL : "+LocalDate.now());
        System.out.println("Dois dias Atras : "+LocalDate.now().minusDays(2));
        System.out.println("1 Mês Atras : "+LocalDate.now().minusMonths(1));
        System.out.println("90 dias Atras : "+LocalDate.now().minusMonths(3));
    }
}
