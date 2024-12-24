package org.example.referencebook.enums.ex2;

import org.example.referencebook.enums.ex1.Apple;

import java.util.Scanner;

public class EnumTeste {

    public static void main(String[] args) {
           testDaysOfWeek();
    }

    private static void testDaysOfWeek(){

        System.out.println("Digit a number of day");
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();

        DaysOfWeek day = null;

        for (DaysOfWeek dow : DaysOfWeek.values()){
            if ((dow.ordinal()+1) == dayNumber){
                day = dow;
                break;
            }else {
                day = DaysOfWeek.UNDEFINED;
            }

        }

        //DaysOfWeek day = DaysOfWeek.STURDAY;

        switch (day){
            case SUNDAY:
                System.out.println("Lets go to beach");
                break;
            case MONDAY:
                System.out.println("Lets Work");
                break;
            case TUESDAY:
                System.out.println("Lets Work");
                break;
            case WEDNESDAY:
                System.out.println("Lets Work");
                break;
            case THURSDAY:
                System.out.println("Lets Work");
                break;
            case FRIDAY:
                System.out.println("Lets Party");
                break;
            case STURDAY:
                System.out.println("Lets rest");
                break;
            default:
                System.out.println("Is not valid");
                break;
        }
    }

}
