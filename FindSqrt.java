package Searching;

public class FindSqrt {
    static int sqrt(int x){
        int st=0;int end=x;
        int ans=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (mid*mid==x){
                return mid;
            } else if (mid*mid>x) {
                end=mid-1;
            }else {
                st=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x=24;
        System.out.println(sqrt(x));
    }
}
