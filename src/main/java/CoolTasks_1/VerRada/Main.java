package CoolTasks_1.VerRada;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VerhovnaRada v = new VerhovnaRada();
        @SuppressWarnings("unused")
        Scanner s = new Scanner(System.in);
        boolean isTrue = true;
        int g = 0;
        do {
            if (g == 1) {
                v.addFraction();
            }
            if (g == 2) {
                v.deleteFraction();
            }
            if (g == 3) {
                v.clearFraction();
            }
            if (g == 4) {
                v.printAllFraction();
            }
            if (g == 5) {
                v.vuvestyFrakciy();
            }
            if (g == 6) {
                v.addDepytats();
            }
            if (g == 7) {
                v.deleteDep();
            }
            if (g == 8) {
                v.vyvidHabar();
            }

            System.out.println("Ввіедіть 1 щоб додати фракцію.");
            System.out.println("Ввіедіть 2 щоб видалити фракцію.");
            System.out.println("Ввіедіть 3 щоб очистити фракцію.");
            System.out.println("Ввіедіть 4 - щоб вивести фракції.");
            System.out.println("Ввіедіть 5 - щоб вивести фракцію.");
            System.out.println("Ввіедіть 6 - щоб додати депутата в фракцію.");
            System.out.println("Ввіедіть 7 - щоб видалити депутата з фракції.");
            System.out.println("Ввіедіть 8 - щоб вивести список хабарників");

            System.out.println("==================================");
            System.out.println();
            System.out.println();
            g = s.nextInt();
        } while (isTrue);
    }
}