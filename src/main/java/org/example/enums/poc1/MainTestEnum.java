package org.example.enums.poc1;

import java.util.ArrayList;
import java.util.Arrays;

public class MainTestEnum {

    public static void main(String[] args) {
        new ArrayList<String>().add("x");
        //String[] perfisDescricao = {"Administrador","Usuario","Convidado"};
        //String[] perfisDescricao = {"Usuario","Convidado"};
        String[] perfisDescricao = {"Administrador","Convidado"};

       Arrays.stream(perfisDescricao).forEach(s -> System.out.println(Perfil.fromDescricao(s).getGrauAcesso()));
       Integer cod = Arrays.stream(perfisDescricao).map(s ->
               Perfil.fromDescricao(s).getGrauAcesso()).max(Integer::compareTo).get();

        System.out.println("Maior >>> "+cod);
        System.out.println(Perfil.fromCodigo(cod));

    }


    private static String getPerfilPeloMaiorGrauDeAcesso(String[] desc){
        Integer cod = Arrays.stream(desc).map(s ->
                Perfil.fromDescricao(s).getGrauAcesso()).max(Integer::compareTo).get();
        return Perfil.fromCodigo(cod).getDescricao();
    }





}
