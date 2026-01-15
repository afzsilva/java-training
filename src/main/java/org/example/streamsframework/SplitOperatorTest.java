package org.example.streamsframework;

import java.util.List;
import java.util.Spliterator;

public class SplitOperatorTest {

    public static void main(String[] args) {
        var numeros = List.of(1,2,3,4,5,6,7,8,9);

         Spliterator<Integer> numerosSplit =  numeros.spliterator();

         Spliterator<Integer> primeiraMetade = numerosSplit.trySplit();
         //primeiro
         primeiraMetade.forEachRemaining(System.out::print);
        System.out.println();


         //segundo
        numerosSplit.forEachRemaining(System.out::print);
    }
}
