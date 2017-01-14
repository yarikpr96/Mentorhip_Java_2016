package CoolTasks_1.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lse21T1Sqr {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter member");
        String s = bf.readLine();
        int a = Integer.parseInt(s);
        double n = 1;
     while (n * n < a) {
         n += 0.001;
     }
        System.out.println(n);
    }
}





