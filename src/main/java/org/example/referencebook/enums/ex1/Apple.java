package org.example.referencebook.enums.ex1;
/*Caracteristicas do enum

* Implicitamente seus atributos são:
* public, static, final
* Os atributos podem ser escritos em lower case, mas por convenção escreve-se em UPPERCASE
* */
public enum Apple {
    /*Cada constante se comporta como enum Apple que é um tipo de classe
    * Por isso o parenteses apos a constante indicando o construtor
    * */
    JONATHAN(10),
    GOLDENDEL(12),
    REDDEL(9),
    WINESAP(15),
    CORTLAND(8);

    /*variavel de instancia
    que vai receber valor passado no parametro do construtor*/
    private int price;

    /*Construtor para receber valor inteiro*/
    Apple(int value) {
        this.price = value;
    }

    /*Metodo de acesso que vai ser usado pelo cliente
    * para obter o valor de um constante.
    * */
    public int getPrice() {
        return price;
    }
}

