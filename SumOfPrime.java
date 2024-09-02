public class SumOfPrime {

    static boolean isprime(int num){
        int count=0;
        for (int i=1;i<=num;i++){
            if (num%i==0){
                count++;
            }
        }
        if (count==2){
            return true;
        }
        return false;
    }
    static int maxprime(int arr[]){
        int i=Integer.MIN_VALUE;
        for (int j=0;j<arr.length;j++){
            if (isprime(arr[j])){
                if (arr[j]>i){
                    i=arr[j];
                }
            }
        }
        return i;
    }

    static int sumOfPrime(int arr[]){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if (isprime(arr[i])){
                sum+=arr[i];
            }
        }
        int max=maxprime(arr);
        return sum-max;
    }
    public static void main(String[] args) {
        int arr[]={41,43,31,29,59,67};
        System.out.println(sumOfPrime(arr));
    }
}
