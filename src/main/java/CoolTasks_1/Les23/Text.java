package CoolTasks_1.Les23;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
/*
game machine guesses your letter
 */

public class Text {
    public static void main(String[] args) throws IOException {
        Random r = new Random();
        char[] rText = new char[10000];
        for (int i = 0; i < rText.length; i++) {
            rText[i] = (char) (r.nextInt(58) + 65);
           // System.out.print(rText[i]);
        }
       // System.out.println();
        System.out.println("Enter the letter");
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        int w = 0;
        for (int j = 0; j < rText.length; j++) {
            if (rText[j] == a) {
                w++;
            }
        }
        System.out.println(w);
    }
}
