package Searching;

public class SearchIn2dMatrix2 {
    static boolean searchMatrix(int matrix[][],int target){
        int n=matrix.length;
        int m=matrix[0].length;

        int i=0;
        int j=m-1;

        while (i<=n && j>=0){
            if (matrix[i][j]==target){
                return true;
            } else if (target<matrix[i][j]) {
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(arr,60));
    }
}
