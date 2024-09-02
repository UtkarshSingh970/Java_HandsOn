package Searching;

public class binarySearchProblem {
    static int FirstOccurence(int arr[],int target){
        int left=0;
        int right=arr.length-1;

        while (left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==target){
                while (arr[mid]!=target){
                    mid--;
                }
                return mid;
            } else if (target<arr[mid]) {
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,5,5,5,6,6,8,9,9,9};
        System.out.println(FirstOccurence(arr,9));
    }
}
