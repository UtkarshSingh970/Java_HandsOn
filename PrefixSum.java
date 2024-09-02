import java.util.Scanner;

public class PrefixSum {

    static void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArray(int arr[]){
        for(int i=1;i< arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Input Array:");
        printArray(arr);

        int []pref=makePrefixSumArray(arr);
        printArray(pref);
    }
}
