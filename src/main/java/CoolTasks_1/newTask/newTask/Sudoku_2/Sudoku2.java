package CoolTasks_1.newTask.newTask.Sudoku_2;

import java.util.Random;

public class Sudoku2 {
    Random r = new Random();
    int[][] mas1 = new int[9][9];
    int[][] mas = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {4, 5, 6, 7, 8, 9, 1, 2, 3},
            {7, 8, 9, 1, 2, 3, 4, 5, 6},
            {2, 3, 4, 5, 6, 7, 8, 9, 1},
            {5, 6, 7, 8, 9, 1, 2, 3, 4},
            {8, 9, 1, 2, 3, 4, 5, 6, 7},
            {3, 4, 5, 6, 7, 8, 9, 1, 2},
            {6, 7, 8, 9, 1, 2, 3, 4, 5},
            {9, 1, 2, 3, 4, 5, 6, 7, 8}
    };

    public void move1() {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas1[i][0] = mas[i][1];
                mas1[i][1] = mas[i][0];
                mas1[i][3] = mas[i][5];
                mas1[i][5] = mas[i][3];
                mas1[i][6] = mas[i][8];
                mas1[i][8] = mas[i][6];
            }
            mas[i][0] = mas1[i][0];
            mas[i][1] = mas1[i][1];
            mas[i][3] = mas1[i][3];
            mas[i][5] = mas1[i][5];
            mas[i][6] = mas1[i][6];
            mas[i][8] = mas1[i][8];
        }
    }

    public void move2() {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas1[0][j] = mas[1][j];
                mas1[1][j] = mas[0][j];
                mas1[3][j] = mas[5][j];
                mas1[5][j] = mas[3][j];
                mas1[6][j] = mas[8][j];
                mas1[8][j] = mas[6][j];
                mas[0][j] = mas1[0][j];
                mas[1][j] = mas1[1][j];
                mas[3][j] = mas1[3][j];
                mas[5][j] = mas1[5][j];
                mas[6][j] = mas1[6][j];
                mas[8][j] = mas1[8][j];
            }
        }
    }

    public void move3() {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas1[0][j] = mas[6][j];
                mas1[6][j] = mas[0][j];
                mas1[1][j] = mas[7][j];
                mas1[7][j] = mas[1][j];
                mas1[2][j] = mas[8][j];
                mas1[8][j] = mas[2][j];
                mas[0][j] = mas1[0][j];
                mas[6][j] = mas1[6][j];
                mas[1][j] = mas1[1][j];
                mas[7][j] = mas1[7][j];
                mas[2][j] = mas1[2][j];
                mas[8][j] = mas1[8][j];
            }
        }
    }

    public void move4() {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas1[i][0] = mas[i][6];
                mas1[i][6] = mas[i][0];
                mas1[i][1] = mas[i][7];
                mas1[i][7] = mas[i][1];
                mas1[i][2] = mas[i][8];
                mas1[i][8] = mas[i][2];
            }
            mas[i][0] = mas1[i][0];
            mas[i][6] = mas1[i][6];
            mas[i][1] = mas1[i][1];
            mas[i][7] = mas1[i][7];
            mas[i][2] = mas1[i][2];
            mas[i][8] = mas1[i][8];
        }
    }

    public void dell() {
        for (int i = 0; i < 70; i++) {
            int a = r.nextInt(9);
            int b = r.nextInt(9);
            mas[a][b] = 0;
        }
    }

    public void seeMas() {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void seeStr() {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                String s = String.valueOf(mas[i][j]);
                if (mas[i][j] == 0) {
                    s = " ";
                }
                System.out.print(s + "\t");
            }
            System.out.println("\t");
        }
    }
}
