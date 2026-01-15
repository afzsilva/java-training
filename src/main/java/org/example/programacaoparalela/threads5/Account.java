package org.example.programacaoparalela.threads5;

public class Account {

    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void withDraw(int amount) {
        this.balance -= amount;}
}
