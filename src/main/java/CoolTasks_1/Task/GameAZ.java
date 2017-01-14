package CoolTasks_1.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class GameAZ {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        int variable = 0;
        do {
            if (variable == 1) {
                Start();
            }
            if (variable == 2) {
                System.exit(0);
            }
            System.out.println("Click 1 to Start");
            System.out.println("Click 2 to exit ");

            variable = scanner.nextInt();
        } while (isTrue);
    }


    public static void Start() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char a = (char) ('a' + new Random().nextInt(26));
        System.out.println(a);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a-z");
            char aa = reader.readLine().charAt(0);
            if (a == aa) {
                System.out.println("You Kracav4uk");
            } else {
                System.out.println("LOL");
                if (a > aa) {
                    System.out.println("--->");
                } else if (a < aa) {
                    System.out.println("<---");
                }
            }
        }
    }
}
