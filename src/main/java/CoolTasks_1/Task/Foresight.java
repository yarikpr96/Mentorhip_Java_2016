package CoolTasks_1.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Foresight {
    public static void main(String[] args) throws IOException {
        Random r = new Random();
        System.out.println("Enter your question");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String question = reader.readLine();
        boolean b = r.nextBoolean();
        int a = r.nextInt(101);
        System.out.println(b + " З ймовірністю в "+ a +" % ");

    }
}