package CoolTasks_1.Task;

import java.util.StringTokenizer;


public class StringTokenize {
    private static final String text = "My brother is favourite gamer";

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(text);
        int maxLengthOfWord = 0;
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            int wordLength = word.length();
            //System.out.println("Token: '" + word + "' with length = " + wordLength);
            if (maxLengthOfWord == 0) {
                maxLengthOfWord = wordLength;
            } else if (wordLength > maxLengthOfWord) {
                maxLengthOfWord = wordLength;
            }
        }
        if (maxLengthOfWord > 0) {
            System.out.println("Max length of word = " + maxLengthOfWord);
        } else {
            System.out.println("No word in string!");
        }
    }
}


