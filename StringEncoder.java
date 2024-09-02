package String;

public class StringEncoder {
    public static String decodeString(String encoded) {
        // Split the encoded string by '0' to get sequences of '1's
        String[] sequences = encoded.split("0");

        // Decode each sequence
        StringBuilder decodedWord = new StringBuilder();
        for (String seq : sequences) {
            if (!seq.isEmpty()) {
                int length = seq.length();
                char letter = (char) ('A' + length - 1); // Convert length to corresponding letter
                decodedWord.append(letter);
            }
        }

        return decodedWord.toString();
    }
    public static void main(String[] args) {
        String encoded = "101101110"; // Example input
        String decodedWord = decodeString(encoded);
        System.out.println(decodedWord); // Output: ABC

    }
}
