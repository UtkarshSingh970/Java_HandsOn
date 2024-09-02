package Searching;

public class SearchIn2d {

    static boolean searchMatrix(int arr[][],int target){
        //number of rows=n, number of column=m
        int n=arr.length;
        int m=arr[0].length;

        int st=0,end=m*n-1;

        while (st<=end){
            int mid=st+(end-st)/2;
            int midElement= arr[mid/m][mid%n];

            if (midElement==target){
                return true;
            } else if (midElement<target) {
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(arr,4));
    }
}
