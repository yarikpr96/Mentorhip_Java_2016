package CoolTasks_1.HappyNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        String r = reader.readLine();
        int number =Integer.parseInt(r);
        Set<Integer> set = new HashSet<Integer>();
        while (set.add(number)) {
            int value = 0;
            while (number > 0) {
                value += Math.pow(number % 10, 2);
                number /= 10;
            }
            number = value;
        }
        if (number == 1) {
            System.out.println("Revers");
        } else {
            System.out.println("No happy");
        }
    }
}

