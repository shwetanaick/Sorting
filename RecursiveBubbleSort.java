/*
    CREATED BY: SHWETA J NAICK
    Recursive Bubble Sort: bubble sort using recursion.
 */

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBubbleSort {
    public static void main(String args[]){

        int array[];
        System.out.println("\n ============================RECURSIVE BUBBLE SORT=============================");
        System.out.println("Enter the Array Limit: ");
        Scanner input = new Scanner(System.in);
        array = new int[input.nextInt()];
        System.out.println("Enter the Array elements one by one: ");

        //Read Elements of the unsorted array

        for(int i =0;i<array.length;i++)
            array[i]=input.nextInt();

        //Print the unsorted array
        System.out.println("Unsorted Array: "+ Arrays.toString(array));

        //Sort the elements
        recursiveBubbleSort(array,array.length);

        //Print sorted array
        System.out.println(" Sorted Array: "+Arrays.toString(array));
    }

     static void recursiveBubbleSort(int[] array,int length) {
        //Number of elements = 1
         if(length==1)
             return;

         //Sort recursively

         for(int i=0;i<length-1;i++)
             if(array[i]>array[i+1]){

             //swap array[i] and array[i+1]
                int temp = array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
             }
             //After one iteration largest element is fixed..So Decrement array limit by one and repeat the process
            recursiveBubbleSort(array,length-1);
    }
}
