package CoolTasks_1.newTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Password {
    public static void main(String[] args) throws IOException {
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the count of password");
        String red = reader.readLine();
        int r = Integer.parseInt(red);
        for (int ii = 0; ii < r; ii++) {
            int len = rnd.nextInt(30) + 10;
            StringBuilder sb = new StringBuilder(len);
            for (int i = 0; i < len; i++)
                sb.append(AB.charAt(rnd.nextInt(AB.length())));
            list.add(sb.toString());
//            list.sort(String::compareTo);
//            list.sort((o1, o2) -> o2.compareTo(o1));
            list.sort(Comparator.comparing(String::length));
//            list.sort(Comparator.comparing(String::length).reversed());
//            list.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
        }
        list.forEach(System.out::println);
    }
}

