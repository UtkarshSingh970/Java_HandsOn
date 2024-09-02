package Searching;

public class BinarySearch {
    static boolean binarysearch(int arr[],int target){
        int left=0;
        int right=arr.length-1;

        while (left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==target){
                return true;
            } else if (target<arr[mid]) {
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={5,8,10,13,15};
        System.out.println(binarysearch(arr,14));
    }
}
