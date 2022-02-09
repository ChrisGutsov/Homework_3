package Loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String [] args){

        int firstElement = 0;
        int secondElement = 1;
        int nextElement = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the max. value for Fibonacci series: ");
        int maxValue = scan.nextInt();

        for(int i = 0; i < maxValue; i++){
            System.out.print(firstElement +",");
            nextElement = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = nextElement;
        }
    }
}
