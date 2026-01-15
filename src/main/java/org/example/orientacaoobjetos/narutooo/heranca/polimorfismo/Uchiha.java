package org.example.orientacaoobjetos.narutooo.heranca.polimorfismo;

public class Uchiha extends Ninja{

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é "+getNome()+" Esse é meu ataque uchiha");
    }
}
