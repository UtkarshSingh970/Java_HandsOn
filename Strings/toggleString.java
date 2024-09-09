package String;

public class toggleString {
    static String togglestring(String str){
        StringBuilder st=new StringBuilder(str);
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii= (int)ch;
            if(ascii>=97){
                ascii-=32;
                char c=(char) ascii;
                st.setCharAt(i,c);
            } else if (ascii>=65 && ascii<=90) {
                ascii+=32;
                char c=(char) ascii;
                st.setCharAt(i,c);
            }
        }
        return st.toString();
    }
    public static void main(String[] args) {
        System.out.println(togglestring("UtKaSh SiNGh"));
    }
}
