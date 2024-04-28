package oop.heranca;

public class MainHeranca {

    public static void main(String[] args) {
        heranca1();

        observacaoAtribuicaoPolimorficaComObject();


    }

    private static void observacaoAtribuicaoPolimorficaComObject() {
    /*
    Essa atribuição funciona por que toda classe herda de Object
    O compilador sempre permite que a classe filha (mais especifica) seja atribuida a classe Pai (mais generica)
    Mas......nesse exemplo
    O compilador entende que você esta querendo ter acesso aos metodos de Object
    sendo assim não sera ṕossivél ter acesso ao metodos da classe Canino, por que eles não estão na classe Object
    * */
        Object obj = new Canino();
    }

    private static void heranca1() {
        /*Classe que herdam de Animal (abstract)*/
        Felino felino = new Felino();
        Canino canino = new Canino();

        felino.comer();
        felino.beber();
        felino.fazerAlgo();

        System.out.println("_".repeat(40)+"\n");

        canino.comer();
        canino.beber();
        canino.fazerAlgo();
    }
}
