/*
    CREATED BY: SHWETA J NAICK
    Bubble Sort: Sorts adjacent elements of an array
    Best Case Time Complexity: O(n)
    Worst and Average Case Time Complexity: O(n*n)

*/

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){

        int array[];
        System.out.println("\n ============================BUBBLE SORT=============================");
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
        bubbleSort(array);

        //Print sorted array
        System.out.println(" Sorted Array: "+Arrays.toString(array));
    }

     static void bubbleSort(int[] array) {
         int n,k;
         n = array.length;
        for(int i=0;i< n-1;i++)
            for(int j=0;j< n-i-1;j++)
                if(array[j]>array[j+1]){
                    //Swap array[j+1] and array[j]
                    k=array[j+1];
                    array[j+1]=array[j];
                    array[j]=k;
                }


    }
}
