package Loops;

import java.util.Arrays;

public class ArrayAvarageValue {
    public static void main(String[] args){
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        double sumArray= 0.0;
        int arrayLength = myArray.length;
        System.out.println("+--------------------------------------------------+");
        System.out.println("|This program calculate average value of the array:|");
        System.out.println("+--------------------------------------------------+");
        for (int i = 0 ; i< arrayLength; i++){
            sumArray = sumArray + myArray[i];
           // System.out.print(sumArray+",");
        }

        double average = sumArray / (double) arrayLength;
        System.out.println("");
        System.out.println("Initial Array"+ Arrays.toString(myArray));
        System.out.println("Array sum is: " +sumArray);
        System.out.println("Number of array elements are: "+arrayLength);
        System.out.println("The average value of the array is: " +average);
    }
}
