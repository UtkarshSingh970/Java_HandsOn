import java.util.Scanner;

public class LastRepeat {
    static int lastrepeat(int arr[]){
        int ans=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    ans=arr[i];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int ans=lastrepeat(arr);
        System.out.println("Last Repeated number is:"+ans);
    }
}
