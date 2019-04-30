/*
    CREATED BY: SHWETA J NAICK
    Selection sort : sorts an array by repeatedly finding the minimum element
    Time Complexity = O(n^2)
 */

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String args[]){
        int length,array[];
        System.out.println("Selection Sort :");
        System.out.println("Enter the number of elements: ");
        Scanner input = new Scanner(System.in);
        length=input.nextInt();
        array = new int[length];

        System.out.println("Enter the array elements one by one : ");
        for (int i=0;i<length;i++)
            array[i]=input.nextInt();
        System.out.println("Unsorted array is : "+ Arrays.toString(array));
        selectionSort(array,length);
        System.out.println("Sorted Array is : "+Arrays.toString(array) );
    }

    private static void selectionSort(int[] array, int length) {
        int min,k;
        for(int i=0;i<length-1;i++){
            min=i;
            for (int j=i+1;j<length;j++)
                if(array[j]<array[min])
                    min=j;

            //swap  arr[min] and arr[i]
            k=array[min];
            array[min]=array[i];
            array[i]=k;
        }
    }
}

