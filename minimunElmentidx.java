package Searching;

public class minimunElmentidx {
    static int findminidx(int arr[]){
        int st=0;
        int ans=-1;
        int end= arr.length-1;
        int n= arr.length;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (arr[mid]>arr[n-1]){
                st=mid+1;
            } else if (arr[mid]<arr[n-1]) {
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={3,4,5,6,1,2};
        System.out.println(findminidx(arr));
    }
}
