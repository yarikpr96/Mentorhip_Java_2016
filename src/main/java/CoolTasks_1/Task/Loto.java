package CoolTasks_1.Task;


import java.util.Random;
import java.util.Scanner;

public class Loto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter member (0-100)");
        int a = scanner.nextInt();
        Random random = new Random();
        int r = random.nextInt(101);
        int count = 0;
        while (a != r) {
            count++;
            r = random.nextInt(101);
        }
        System.out.println();
        System.out.println(count);
    }
}
