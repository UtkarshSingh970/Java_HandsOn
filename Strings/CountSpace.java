package String;

public class CountSpace {

    static int spaceCount(String s1){
        int count=0;
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
    static void spacecount(String input1, String input2){
        int res=spaceCount(input1);
        int res2=spaceCount(input2);

        int diff=Math.abs(res-res2);
        if (diff%2==0){
            System.out.println("Even:"+diff);
        }
        else {
            System.out.println("Odd:"+diff);
        }

    }
    public static void main(String[] args) {
        spacecount("abc bcd cda def","abc bc");

    }
}
