package org.example.orientacaoobjetos;

public class PlayerOne extends Personagem{

    private String nomeGame;

    public String getNomeGame() {
        return nomeGame;
    }

    public void setNomeGame(String nomeGame) {
        this.nomeGame = nomeGame;
    }

    @Override
    public String toString() {
        return "PlayerOne{" +
                "nomeGame='" + nomeGame + '\'' +
                "nomePersonagem='" + this.getNome() + '\'' +
                "Plataforma='" + this.getPlataforma() + '\'' +
                '}';
    }
}
