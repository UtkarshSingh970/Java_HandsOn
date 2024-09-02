package Recursion;

public class SOD {
    static int sod(int n){
        //Base case
        if (n>=0 && n<=9){
            return n;
        }
        //recursion + self work
        int ans=sod(n/10) + (n%10);

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sod(12345));
    }
}
