/*
    CREATED BY: SHWETA J NAICK
    Insertion Sort: Sorts each elements by comparing it with its previous elements
    Time Complexity: O(n*2)
*/

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String args[]) {

        int array[];
        System.out.println("\n ============================INSERTION SORT=============================");
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
        insertionSort(array);

        //Print sorted array
        System.out.println(" Sorted Array: " + Arrays.toString(array));
    }

    static void insertionSort(int[] array) {
        int i,j,key;
        for( i=1;i<array.length;i++){

            key= array[i];
            j=i-1;

            while(j>=0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = key;
        }
    }


}
