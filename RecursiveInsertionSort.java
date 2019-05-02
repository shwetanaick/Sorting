/*
    CREATED BY: SHWETA J NAICK
    Recursive Insertion Sort: Sorts each elements by comparing it with its previous elements
    Time Complexity: O(n*2)
*/

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveInsertionSort {
    public static void main(String args[]) {

        int array[];
        System.out.println("\n ============================RECURSIVE INSERTION SORT=============================");
        System.out.println("Enter the Array Limit: ");
        Scanner input = new Scanner(System.in);
        array = new int[input.nextInt()];
        System.out.println("Enter the Array elements one by one: ");

        //Read Elements of the unsorted array

        for (int i = 0; i < array.length; i++)
            array[i] = input.nextInt();

        //Print the unsorted array
        System.out.println("Unsorted Array: " + Arrays.toString(array));

        //Sort the elements
        recursiveInsertionSort(array,array.length);

        //Print sorted array
        System.out.println(" Sorted Array: " + Arrays.toString(array));
    }

    private static void recursiveInsertionSort(int[] array,int n) {

        if(n<=1)
            return;

        //sort n-1 elements
        recursiveInsertionSort(array,n-1);

        int last = array[n-1];
        int j=n-2;

        while(j>=0 && array[j]>last){
            array[j+1] = array[j];
            j--;
        }

        array[j+1] = last;

    }
}
