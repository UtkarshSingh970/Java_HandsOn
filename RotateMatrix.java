import java.util.Scanner;

public class RotateMatrix {

    static void transposeInplace(int[][]matrix, int r,int c){
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }

    static void printMatrix(int [][]matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    static void reverseArray(int matrix[]){
        int i=0,j=matrix.length;
        while (j>i){
            int temp=matrix[i];
            matrix[i]=matrix[j];
            matrix[j]=temp;
            i++;
            j--;
        }
    }

    static void rotatematrix(int matrix[][],int r){

        //transpose
        //reverse the array

        transposeInplace(matrix,r,r);
        for (int i=0;i<r;i++){
            reverseArray(matrix[i]);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and column of matrix");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] matrix=new int[r][c];
        int totalElements=r*c;
        System.out.println("Enter "+ totalElements +" values");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Input matrix");
        printMatrix(matrix);
    }
}
