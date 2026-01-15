package org.example.enums.poc1;

public enum Perfil {

    ADM("Administrador",1),
    USE("Usuario",2),
    OTH("Convidado",3);

    private final String descricao;
    private final int grauAcesso;

    Perfil(String descricao, int grauAcesso) {
        this.descricao = descricao;
        this.grauAcesso = grauAcesso;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getGrauAcesso() {
        return grauAcesso;
    }


    public static Perfil fromCodigo(int codigo) {
        for (Perfil perfil : Perfil.values()) {
            if (perfil.getGrauAcesso() == codigo) {
                return perfil;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + codigo);
    }

    public static Perfil fromDescricao(String descricao) {
        for (Perfil perfil : Perfil.values()) {
            if (perfil.getDescricao().equalsIgnoreCase(descricao)) {
                return perfil;
            }
        }
        throw new IllegalArgumentException("Descrição inválida: " + descricao);
    }
}
