package Recursion;

public class NOD {
    static int nod(int n){
        if (n>=0 && n<=9){
            return 1;
        }

        return nod(n/10) +1;
    }
    public static void main(String[] args) {
        System.out.println(nod(1234));
    }
}
