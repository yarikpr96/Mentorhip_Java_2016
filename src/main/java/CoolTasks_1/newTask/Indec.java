package CoolTasks_1.newTask;

import java.util.Random;

public class Indec {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = rnd.nextInt(1000);
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        int max = 0;
        int imax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                imax = i;
            }
        }
        for (int i : array) {
            if (i > max) max = i;
        }
        System.out.println();
        System.out.println("Max eelement: " + max);
        System.out.println("Indekc: " + imax);
    }
}
