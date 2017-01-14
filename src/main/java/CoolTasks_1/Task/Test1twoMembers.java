package CoolTasks_1.Task;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ярослав on 22.04.2016.
 */
public class Test1twoMembers {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(2001) - 1000;
        System.out.println(a);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter b");
        int b = s.nextInt();
        System.out.println("Enter c");
        int c = s.nextInt();

        if (a > 0) {
            b = Math.abs(a - b);
            c = Math.abs(a - c);
            if (b > c) {
                System.out.println("c" + c);
            } else {
                System.out.println("b" + b);
            }
        }
        if (a < 0) {
            if (b > a) {
                b = Math.abs(b);
                b = b - a;
            } else if (c > a) {
                c = Math.abs(c);
                c = c - a;
            } else if (b < 0) {
                a = Math.abs(a);
                b = a - b;
            } else if (c < 0) {
                a = Math.abs(a);
                c = a - b;
            } else if (b > 0) {
                b = a - b;
            } else if (c > 0) {
                c = a - b;
            }
            if (b > c) {
                System.out.println("c" + c);
            } else {
                System.out.println("b" + b);
            }
        }
        if (a == 0) {
            if (b == 0) {
                System.out.println("b" + b);
            } else if (b < a || b > a) {
                b = Math.abs(b - a);
            } else if (c == 0) {
                System.out.println("c" + c);
            } else if (c < a || c > a) {
                c = Math.abs(c - a);
            }
            if (b > c) {
                System.out.println("c" + c);
            } else {
                System.out.println("b" + b);
            }
        }
    }
}