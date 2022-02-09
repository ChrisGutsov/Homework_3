package Loops;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCalculationUserinput {
    public static void main(String [] args){

        //int multiplier = 5;
        //int index = 20;
        int arrayElement;

        Scanner scan = new Scanner(System.in);
            System.out.println("+-------------------------------------------------------------------------------------+");
            System.out.println("|This program calculate array based on user input for index and multiplier.           |");
            System.out.println("|The base array is created from 1 to n, where n = user defined size as index of array.|");
            System.out.println("+-------------------------------------------------------------------------------------+");
        System.out.println("Please enter the size of array: ");
        int index = scan.nextInt();
        int[] myArray = new int[index];

        System.out.println("Please enter the multiplier value: ");
        int multiplier = scan.nextInt();

        for (int i = 0; i<myArray.length; i++){
            arrayElement = i * multiplier;
            myArray[i] = arrayElement;
            System.out.printf("Array index: %d, value: %d %n", i, myArray[i]);
        }
        System.out.printf("Total number of array elements is %d, the multipier is %d \n", index, multiplier);
        System.out.println("Result Array:" + Arrays.toString(myArray));
    }

}
