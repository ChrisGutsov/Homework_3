package Loops;

import java.util.Scanner;

public class VlauesNotDividedTo3And7 {
    public static void main (String [] args){
        int number = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("This program find all numbers which are not divide to 3 and 7");
        System.out.println("Please enter a max number: ");
        int maxValue = scan.nextInt();
        System.out.printf("From %d to %d only values which are not divided to 3 and 7 will be printed.",number, maxValue);
        System.out.println("\n-----------------------------------------------");

        for (int i = 0; i<maxValue; i++){
            if(number % 3 != 0 && number % 7 != 0){
                System.out.print(number+",");
            }//else
            number++;
        }
    }

}
