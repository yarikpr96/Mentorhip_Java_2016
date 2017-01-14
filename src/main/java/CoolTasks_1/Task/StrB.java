package CoolTasks_1.Task;

import java.util.Scanner;

public class StrB {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your number");
        int n = sc.nextInt();
        sb.append(n);
        sb.reverse();
        System.out.println(sb);




    }
}
