package org.example.referencebook.enums.ex3;

import java.util.EnumSet;

public class ExemploEnumSet{

    public static void main(String[] args) {

        //Inicializando set vazio
        EnumSet<DiaDaSemana> diasUteis = EnumSet.noneOf(DiaDaSemana.class);

        System.out.println("--- Adicionar elementos (forma 1) ---");
        diasUteis.add(DiaDaSemana.SEGUNDA);
        diasUteis.add(DiaDaSemana.TERCA);
        diasUteis.add(DiaDaSemana.QUARTA);
        diasUteis.add(DiaDaSemana.QUINTA);
        diasUteis.add(DiaDaSemana.SEXTA);

        diasUteis.forEach(System.out::println);



        System.out.println("--- Adicionar elementos (forma 2) ---");

        EnumSet<DiaDaSemana> diasUteis2 = EnumSet.of(
                DiaDaSemana.DOMINGO,
                DiaDaSemana.SEGUNDA,
                DiaDaSemana.TERCA,
                DiaDaSemana.QUARTA,
                DiaDaSemana.QUINTA,
                DiaDaSemana.SEXTA,
                DiaDaSemana.SABADO
        );
        diasUteis2.forEach(System.out::println);



        System.out.println("------- TODOS OS DIAS DA SEMANA -----------");
        EnumSet<DiaDaSemana> todosDias = EnumSet.allOf(DiaDaSemana.class);
        System.out.println(todosDias);

    }
}