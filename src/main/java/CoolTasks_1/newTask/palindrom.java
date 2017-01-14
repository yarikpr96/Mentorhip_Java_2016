package CoolTasks_1.newTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindrom {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        String red = reader.readLine();
        StringBuffer sb = new StringBuffer(red);
        String a = String.valueOf(sb.reverse());
        if (red.equals(a)) {
            System.out.println("palindrom");
        } else {
            System.out.println("No");
        }
    }
}
