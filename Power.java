package Recursion;

public class Power {
    static int power(int p,int q){
        if (q==0){
            return 1;
        }
        if (p==1){
            return 1;
        }

        return power(p,q-1)*p;
    }
    public static void main(String[] args) {
        System.out.println(power(2,4));
    }
}
