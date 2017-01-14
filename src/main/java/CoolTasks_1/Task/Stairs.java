package CoolTasks_1.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stairs {
    public static void main(String[] args) throws IOException {
        int a = 0, b = 1, c = 0, i = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of steps");
        String m = reader.readLine();
        int number = Integer.parseInt(m);
        while (i <= number) {
            a = b;
            b = c;
            c = a + b;
            i++;

        }
        System.out.println("there are "+c+ " ways to rise by "+ number+ " step");
    }
}