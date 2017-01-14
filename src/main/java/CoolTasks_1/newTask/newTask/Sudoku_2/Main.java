package CoolTasks_1.newTask.newTask.Sudoku_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Sudoku2 sud = new Sudoku2();
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            int variable = r.nextInt(4) + 1;
            if (variable == 1) {
                sud.move1();
            } else if (variable == 2) {
                sud.move2();
            } else if (variable == 3) {
                sud.move3();
            } else if (variable == 4) {
                sud.move4();
            }
        }
        sud.dell();
        sud.seeMas();
        //  sud.seeStr();
    }
}
