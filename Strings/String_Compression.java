package String;

public class String_Compression {
    public static void main(String[] args) {
        String str="aaabbbbccdddeeee";
        String ans=""+str.charAt(0);
        int count=1;
        for (int i=1;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch==str.charAt(i-1)){
                count++;
            }
            else {
                ans+=count;
                count=1;
                ans+=str.charAt(i);
            }
        }
        System.out.println(ans+count);
    }
}
