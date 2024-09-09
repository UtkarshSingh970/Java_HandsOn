package String;

public class Palindromic_String {
    static boolean ispalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="abbd";
        int count=0;
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<=str.length();j++){
                if (ispalindrome(str.substring(i,j))==true){
                    System.out.println(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("No Of Palindromic Substring:"+count);
    }
}
