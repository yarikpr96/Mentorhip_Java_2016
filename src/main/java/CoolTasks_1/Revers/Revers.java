package CoolTasks_1.Revers;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Revers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number");
        String a = reader.readLine();
        StringBuffer sb = new StringBuffer(a);

        sb.reverse();
        System.out.println(sb);
//        int b = Integer.parseInt(sb.toString());
//        System.out.println(b);

    }
}
