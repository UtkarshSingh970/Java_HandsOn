package String;

public class ReverseEachWord {
    public static void main(String[] args) {
        String st="I am an online educator ";
        StringBuilder sb=new StringBuilder("");
        String ans="";
        for (int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if (ch!=' '){
                sb.append(ch);
            }
            else {
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb=new StringBuilder(" ");
            }
        }
        System.out.println(ans);
    }
}
