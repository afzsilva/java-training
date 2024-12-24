package org.example.referencebook.enums.ex1;

public class EnumDemo2 {
    public static void main(String[] args) {
        System.out.println("/*---------------Enum Metodo values()-------------------*/");

        Apple[] v = Apple.values();
        System.out.println(v[0]);//JONATHAN

        System.out.println("/*---------------For classico-------------------*/");
        for (int i=0;i < v.length;i++){
            System.out.println(v[i]);
        }

        System.out.println("/*---------------Foreach-------------------*/");
        for (Apple a: Apple.values()){
            System.out.println(a);
        }

        System.out.println("/*---------------Enum Metodo valueOf()-------------------*/");
        Apple ap;
        ap = Apple.valueOf("REDDEL");
        System.out.println(ap);

        String str = "GOLDENDEL";

        if (Apple.GOLDENDEL.equals(Apple.valueOf(str))){
            System.out.println("OK");
        }
    }
}
