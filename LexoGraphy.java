package Sorting;

public class LexoGraphy {

    static void swap(String arr[],int i,int j){
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void sortFruits(String []arr){
        for (int i=0;i< arr.length;i++){
            int min=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[min].compareTo(arr[j])>0){
                    min=j;
                }
            }
           swap(arr,i,min);
        }
    }
    public static void main(String[] args) {
        String[]fruits={"kiwi","apple","papaya","mango"};
        sortFruits(fruits);
        for (String val:fruits){
            System.out.println(val+" ");
        }
    }
}
