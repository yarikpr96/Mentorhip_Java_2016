package CoolTasks_1.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    private double a;
    private double b;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void sum() throws IOException {
        System.out.println("Enter a");
        String aa = reader.readLine();
        a = Double.parseDouble(aa);
        System.out.println("Enter b");
        String bb = reader.readLine();
        b = Double.parseDouble(bb);
        double c = a + b;
        System.out.println(c);
    }

    public void subtrahend() throws IOException {
        System.out.println("Enter a");
        String aa = reader.readLine();
        a = Double.parseDouble(aa);
        System.out.println("Enter b");
        String bb = reader.readLine();
        b = Double.parseDouble(bb);
        double c = a - b;
        System.out.println(c);
    }

    public void multiplier() throws IOException {
        System.out.println("Enter a");
        String aa = reader.readLine();
        a = Double.parseDouble(aa);
        System.out.println("Enter b");
        String bb = reader.readLine();
        b = Double.parseDouble(bb);
        double c = a * b;
        System.out.println(c);
    }

    public void divider() throws IOException {
        System.out.println("Enter a");
        String aa = reader.readLine();
        a = Double.parseDouble(aa);
        System.out.println("Enter b");
        String bb = reader.readLine();
        b = Double.parseDouble(bb);
        double c = a / b;
        System.out.println(c);
    }

    public void squareRoot() throws IOException {
        System.out.println("Enter a");
        String aa = reader.readLine();
        a = Double.parseDouble(aa);
        double c = Math.sqrt(a);
        System.out.println(c);
    }

    public void module() throws IOException {
        System.out.println("Enter a");
        String aa = reader.readLine();
        a = Double.parseDouble(aa);
        double c = Math.abs(a);
        System.out.println(c);
    }
    public void power() throws IOException {
        System.out.println("Enter a");
        String aa = reader.readLine();
        a = Double.parseDouble(aa);
        System.out.println("Enter pow");
        String bb = reader.readLine();
        b = Double.parseDouble(bb);
        double c = Math.pow(a,b);
        System.out.println(c);
    }

}
