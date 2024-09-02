import java.util.ArrayList;
import java.util.Set;

public class SumOfUnique {
    static boolean checkUnique(int i,int []arr){
        int count=0;
        for (int x:arr){
            if(x==i){
                count++;
            }
            if (count>1)return false;

        }
        return true;
    }

    static int sumofunique(int []arr){
        int sum=0;
        for (int i:arr){
            boolean unique= checkUnique(i,arr);
            if (unique){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,2};
        System.out.println(sumofunique(arr));
    }
}
