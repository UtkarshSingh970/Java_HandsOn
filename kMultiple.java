package Recursion;

public class kMultiple {

    static void kmultiple(int num, int k){
        if (k==1){
            System.out.println(num);
            return;
        }

        kmultiple(num,k-1);
        System.out.println(num*k);
    }
    public static void main(String[] args) {
        kmultiple(12,5);
    }
}
