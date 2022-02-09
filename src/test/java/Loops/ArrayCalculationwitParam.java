package Loops;

import java.util.Arrays;

public class ArrayCalculationwitParam {
    public static void main(String [] args){

        int n = 5;
        int [] intArray = new int[] {0,1,2,3,4,5,6,7,8,9};
        int element;
        System.out.println("Tis program calculate an array based on parameters!");
        for (int i =0; i<intArray.length; i++){
            element = i * 5;
            intArray[i] = element;
            //System.out.print(intArray[i]);
        }
          System.out.println("Initial array: " + Arrays.toString(intArray) +"\nMmulipier: "+n+ "\nResult array"+ Arrays.toString(intArray));
    }
}
