import java.util.*;
public class SecondMax {

    static int findmax(int arr[]){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static int secondmax(int arr[]){
        int maxnumber=findmax(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i]==maxnumber){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int result=findmax(arr);
        return result;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int ans=secondmax(arr);
        System.out.println(ans);
    }
}
