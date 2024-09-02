package Sorting;

import java.util.Scanner;

public class InsertionSort {
    static void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void insertionsort(int []arr){
        for (int i=1;i< arr.length;i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                swap(arr,j-1,j);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Before sorting");
        printArray(arr);

        insertionsort(arr);

        System.out.println("After sorting");
        printArray(arr);
    }
}
