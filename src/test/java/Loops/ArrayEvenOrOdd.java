package Loops;

import java.util.Arrays;

public class ArrayEvenOrOdd {
           public static void main(String [] args){
            //int index = 20; //array index
            int sumEven = 0; //variable container for storing a Even numbers value.
            int sumOdd = 0;  //variable container for storing a Odd numbers value.
            int[] myArray ={1,2,3,4,5,6,7,8,9,10}; //size 11 elements.
            int length = myArray.length;

            System.out.println("+--------------------------------------------------------------------+");
            System.out.println("|This program calculate even an odd numbers base on an array .       |");
            System.out.println("+--------------------------------------------------------------------+");

            for (int i = 0; i < length; i++){  //main loop, increment until we get last element in array.
                if (myArray[i] %2 == 0){   //checking for even value by dividing of 2, if no reminder is left then the value is even.
                    sumEven = sumEven + myArray[i];  //addition even value.
                }else sumOdd = sumOdd + myArray[i]; //addition odd value.

            }
            System.out.println("Array: "+ Arrays.toString(myArray));
            System.out.printf("Sum of all even number in array of %d elements is %d: ",length ,sumEven); // printing the result.
            System.out.printf("\nSum of all odd numbers in array of %d elements is %d: ",length ,sumOdd);   // printing the result.

        }
}
