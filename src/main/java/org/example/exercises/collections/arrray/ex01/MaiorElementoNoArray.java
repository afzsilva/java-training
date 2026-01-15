package org.example.exercises.collections.arrray.ex01;

import java.util.Collections;

public class MaiorElementoNoArray {

    public static void main(String[] args) {
        int[] meuArray = {1,5,0,6,55,33};

        juniorMethod(meuArray);



    }


    private static void juniorMethod(int [] arr){
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]  > flag){
                flag = arr[i];
            }
        }

        System.out.printf("Maior numero no array [ %d ]",flag);
    }

    private static void plenoMethod(int[] arr){

    }

}
