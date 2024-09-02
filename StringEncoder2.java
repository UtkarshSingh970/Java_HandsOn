package String;

import java.util.HashMap;
import java.util.*;

public class StringEncoder2 {
    static String decodeString(String encoded){

        StringBuilder st=new StringBuilder();

        Map<Integer,Character> letterMapping=new HashMap<>();
        for (int i=1;i<=26;i++){
            letterMapping.put(i,(char)('A'+i-1));
        }

        String[] sequence=encoded.split("0");

        for (String seq:sequence){
            int length=seq.length();
            st.append(letterMapping.get(length));
        }
        return st.toString();
    }
    public static void main(String[] args) {
        String encoded = "101101110"; // Example input
        String decodedWord = decodeString(encoded);
        System.out.println(decodedWord); // Output: ABC
    }
}
