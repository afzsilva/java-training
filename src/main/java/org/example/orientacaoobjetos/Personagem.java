package org.example.orientacaoobjetos;

public abstract class Personagem {

    private String nome;

    private String plataforma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

//    @Override
//    public String toString() {
//        return "Personagem{" +
//                "nome='" + nome + '\'' +
//                ", plataforma='" + plataforma + '\'' +
//                '}';
//    }
}
