package org.example.programacaoparalela.threads5;

public class AccountDanger implements Runnable{

    private Account acc = new Account();

    public static void main(String[] args) {

        AccountDanger danger = new AccountDanger();
        //NEW
        Thread one = new Thread(danger);
        Thread two = new Thread(danger);

        one.setName("Fred");
        two.setName("Lucy");

        //RUNNABLE
        one.start();
        two.start();


    }//main

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            makeWithDrawn(10);
            if (acc.getBalance()<=0){
                System.out.println("Account is overdrawn");
            }

        }
    }//Runnable

    private void makeWithDrawn(int amt){
        if (acc.getBalance() >= amt){
            System.out.println(Thread.currentThread().getName()+"is going to withdraw "+amt);

            try {
                Thread.sleep(500);
                acc.withDraw(amt);
                System.out.println(Thread.currentThread().getName()+" Completes the withdrawal ");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }else {
            System.out.println("Not enough in account for "+Thread.currentThread().getName()+" to withdraw "+acc.getBalance());
        }
    }
}
