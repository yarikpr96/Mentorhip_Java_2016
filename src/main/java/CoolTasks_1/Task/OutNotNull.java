package CoolTasks_1.Task;

import java.io.IOException;

public class OutNotNull {
    public static void main(String[] args) throws IOException {
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      //  System.out.println("Enter the number");
      //  String r = reader.readLine();
        double a = 333.000;
        if (a % 2 == 0) {
            int b = (int) a;
            System.out.println(b);
        } else {
            double c = a % 10;
            System.out.println(c);
        }
    }
}
