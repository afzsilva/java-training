package org.example.helpers.telefone;

public class MainHelpers {

    public static void main(String[] args) {
        //String n1 = "82988712224";
        String n1 = "61988712224";
        String r = Helper.addMascaraTelefone(n1);
 //       System.out.println(r);//mostra

        String n1Mask = "619****-2224";

        simulaSalvarNumeroAposValidarMascara(n1Mask, n1);
    }

    private static void simulaSalvarNumeroAposValidarMascara(String numeroMask, String numero){
        if (!Helper.matchesMaskComDDD(numeroMask, numero)){
            throw new RuntimeException("Mascara informada não validada com o numero de telefone");
        }

        System.out.println("Salvando numero "+numero);
    }
}
