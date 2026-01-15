package org.example.programacaoparalela.threads1;

import javax.swing.*;

public class MainThread {

    public static void main(String[] args)  {


        new ProcessoEmail().start();

        ProcessoNotaFiscal nf = new ProcessoNotaFiscal();
        new Thread(nf).start();


        JOptionPane.showMessageDialog(null,"Este é um teste para aprender Threads");
        System.out.println(">> A janela do programa principal foi Fechada <<");
    }
}
