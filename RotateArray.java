import java.util.Scanner;
public class RotateArray {
    static int[]rotate(int[]arr,int k){
        int n=arr.length;
        k=k%n;
        int ans[]=new int[n];
        int j=0;
        for (int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for (int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }

    static void reverse(int arr[],int i, int j){
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    static void rotateInPlace(int arr[],int k){
        int n=arr.length;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number of rotation");
        int k=sc.nextInt();

//        int ans[]= rotate(arr,k);
        rotateInPlace(arr,k);
        System.out.println("Array after rotation:");
        printArray(arr);
    }
}
