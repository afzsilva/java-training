package org.example.condicional;

import java.util.Random;

public class MainSwitch {

    public static void main(String[] args) {

        String dia = "SAB";

       String diaSemana = switch (dia){
            case "SEG","TER","QUA","QUI","SEX" -> "Trabalhar";

            case "SAB","DOM" -> "Descansar";

            default -> "Desconhecido";
        };//swith
        System.out.println(diaSemana);
    }//main
}
