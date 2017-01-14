package CoolTasks_1.Calculator;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Ярослав on 30.05.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        int variable = 0;
        do {
            if (variable == 1) {
                calculator.sum();
            }
            if (variable == 2) {
                calculator.subtrahend();
            }
            if (variable == 3) {
                calculator.multiplier();
            }
            if (variable == 4) {
                calculator.divider();
            }
            if (variable == 5) {
                calculator.squareRoot();
            }
            if (variable == 6) {
                calculator.module();
            }
            if (variable == 7) {
                calculator.power();
            }
            if (variable == 8) {
                System.exit(0);
            }
            System.out.println("1 +");
            System.out.println("2 -");
            System.out.println("3 *");
            System.out.println("4 /");
            System.out.println("5 sqr");
            System.out.println("6 module");
            System.out.println("7 ^");
            System.out.println("8 Exit");

            variable = scanner.nextInt();
        } while (isTrue);

    }
}
