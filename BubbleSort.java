package Sorting;

import java.util.Scanner;

public class BubbleSort {

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

    static void bubblesort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            boolean flag=false;// has any swapping happend
            for (int j=i+1;j<arr.length-1;j++){
                if (arr[i]>arr[j]){
                    swap(arr,i,j);
                    flag=true;
                }
            }
            if (flag==false)return; // have any swap happend?
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

        bubblesort(arr);
        System.out.println("After sorting");
        printArray(arr);


    }
}
