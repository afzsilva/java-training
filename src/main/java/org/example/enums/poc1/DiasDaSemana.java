package org.example.enums.poc1;

public enum DiasDaSemana {
    DOM("DOMINGO",1),
    SEG("SEGUNDA",2),
    TER("TERÇA",3),
    QUA("QUARTA",4),
    QUI("QUINTA",5),
    SEX("SEXTA",6),
    SAB("SABADO",7);

    private final String descricao;
    private final int numero;

    DiasDaSemana(String descricao, int numero){
        this.descricao = descricao;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public static String getDescricaoByNumero(int numero){
        return "";
    }

    public static int getNumeroByDescricao(int numero){
        return 0;
    }
}
