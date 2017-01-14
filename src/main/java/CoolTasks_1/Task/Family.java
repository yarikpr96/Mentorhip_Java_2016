package CoolTasks_1.Task;

import java.util.Random;
import java.util.Scanner;

public class Family {
    public static void main(String[] args) {
        int countMan = 0;
        int countGirl = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numbers of family");
        int a = s.nextInt();
        Random r = new Random();

        do {
            int n = r.nextInt(2);
            if (n == 0) {
                countGirl++;
            } else if (n == 1) {
                countMan++;
            }
        }
        while (countMan != a);
        System.out.println("Girl is "+ countGirl);
        System.out.println("Man is "+ countMan);
    }
}
