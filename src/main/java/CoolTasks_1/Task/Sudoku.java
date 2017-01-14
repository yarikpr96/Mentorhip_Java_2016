package CoolTasks_1.Task;


import java.util.Random;

public class Sudoku {
    public static void main(String[] args) {
        int[][] mas = new int[9][9];
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mas[0][0] = r.nextInt(9) + 1;
                mas[1][1] = r.nextInt(9) + 1;
                mas[2][2] = r.nextInt(9) + 1;
                //System.out.print(mas[i][j] + " ");
            }
            // System.out.println();
        }

        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                mas[3][0] = r.nextInt(9) + 1;
                mas[4][1] = r.nextInt(9) + 1;
                mas[5][2] = r.nextInt(9) + 1;
                //System.out.print(mas[i][j] + " ");
            }
            // System.out.println();
        }
        for (int i = 6; i < 9; i++) {
            for (int j = 3; j < 6; j++) {
                mas[6][0] = r.nextInt(9) + 1;
                mas[7][1] = r.nextInt(9) + 1;
                mas[8][2] = r.nextInt(9) + 1;
                //System.out.print(mas[i][j] + " ");
            }
            // System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mas[0][3] = r.nextInt(9) + 1;
                mas[1][4] = r.nextInt(9) + 1;
                mas[2][5] = r.nextInt(9) + 1;
                //System.out.print(mas[i][j] + " ");
            }
            // System.out.println();
        }

        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                mas[3][3] = r.nextInt(9) + 1;
                mas[4][4] = r.nextInt(9) + 1;
                mas[5][5] = r.nextInt(9) + 1;
                //System.out.print(mas[i][j] + " ");
            }
            // System.out.println();
        }
//
        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                mas[6][3] = r.nextInt(9) + 1;
                mas[7][4] = r.nextInt(9) + 1;
                mas[8][5] = r.nextInt(9) + 1;
                //System.out.print(mas[i][j] + " ");
            }
            // System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mas[0][6] = r.nextInt(9) + 1;
                mas[1][7] = r.nextInt(9) + 1;
                mas[2][8] = r.nextInt(9) + 1;
                //System.out.print(mas[i][j] + " ");
            }
            // System.out.println();
        }

        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                mas[3][6] = r.nextInt(9) + 1;
                mas[4][7] = r.nextInt(9) + 1;
                mas[5][8] = r.nextInt(9) + 1;
                //System.out.print(mas[i][j] + " ");
            }
            // System.out.println();
        }
//
        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                mas[6][6] = r.nextInt(9) + 1;
                mas[7][7] = r.nextInt(9) + 1;
                mas[8][8] = r.nextInt(9) + 1;
                //System.out.print(mas[i][j] + " ");
            }
            // System.out.println();
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {

                // 1 2 3
                // 4 5 6
                // 7 8 9

                //1
                if (mas[0][0] == mas[1][1] || mas[0][0] == mas[2][2]) {
                    mas[0][0] = r.nextInt(9) + 1;
                }
                if (mas[0][0] == mas[3][0] || mas[0][0] == mas[6][0]) {
                    mas[0][0] = r.nextInt(9) + 1;
                }
                if (mas[0][0] == mas[0][3] || mas[0][0] == mas[0][6]) {
                    mas[0][0] = r.nextInt(9) + 1;
                }

                if (mas[1][1] == mas[2][2]) {
                    mas[1][1] = r.nextInt(9) + 1;
                }
                if (mas[1][1] == mas[4][1] || mas[1][1] == mas[7][1]) {
                    mas[1][1] = r.nextInt(9) + 1;
                }
                if (mas[1][1] == mas[1][4] || mas[1][1] == mas[1][7]) {
                    mas[1][1] = r.nextInt(9) + 1;
                }

                if (mas[2][2] == mas[5][2] || mas[2][2] == mas[8][2]) {
                    mas[2][2] = r.nextInt(9) + 1;
                }
                if (mas[2][2] == mas[2][5] || mas[2][2] == mas[2][8]) {
                    mas[2][2] = r.nextInt(9) + 1;
                }


                //2
                if (mas[0][3] == mas[1][4] || mas[0][3] == mas[2][5]) {
                    mas[0][3] = r.nextInt(9) + 1;
                }
                if (mas[0][3] == mas[3][3] || mas[0][3] == mas[6][3]) {
                    mas[0][3] = r.nextInt(9) + 1;
                }
                if (mas[0][3] == mas[0][6]) {
                    mas[0][3] = r.nextInt(9) + 1;
                }

                if (mas[1][4] == mas[2][5]) {
                    mas[1][4] = r.nextInt(9) + 1;
                }
                if (mas[1][4] == mas[4][4] || mas[1][4] == mas[7][4]) {
                    mas[1][4] = r.nextInt(9) + 1;
                }
                if (mas[1][4] == mas[1][7]) {
                    mas[1][4] = r.nextInt(9) + 1;
                }

                if (mas[2][5] == mas[5][5] || mas[8][5] == mas[7][4]) {
                    mas[2][5] = r.nextInt(9) + 1;
                }
                if (mas[2][5] == mas[2][8]) {
                    mas[2][5] = r.nextInt(9) + 1;
                }


                //3
                if (mas[0][6] == mas[1][7] || mas[0][6] == mas[2][8]) {
                    mas[0][6] = r.nextInt(9) + 1;
                }
                if (mas[0][6] == mas[3][6] || mas[0][6] == mas[6][6]) {
                    mas[0][6] = r.nextInt(9) + 1;
                }

                if (mas[1][7] == mas[2][8]) {
                    mas[1][7] = r.nextInt(9) + 1;
                }
                if (mas[1][7] == mas[4][7] || mas[1][7] == mas[7][7]) {
                    mas[1][7] = r.nextInt(9) + 1;
                }
                if (mas[2][8] == mas[5][8] || mas[2][8] == mas[8][8]) {
                    mas[2][8] = r.nextInt(9) + 1;
                }


                //4
                if (mas[3][0] == mas[4][1] || mas[3][0] == mas[5][2]) {
                    mas[3][0] = r.nextInt(9) + 1;
                }
                if (mas[3][0] == mas[6][0]) {
                    mas[3][0] = r.nextInt(9) + 1;
                }
                if (mas[3][0] == mas[3][3] || mas[3][0] == mas[3][6]) {
                    mas[3][0] = r.nextInt(9) + 1;
                }

                if (mas[4][1] == mas[5][2]) {
                    mas[4][1] = r.nextInt(9) + 1;
                }
                if (mas[4][1] == mas[7][1]) {
                    mas[4][1] = r.nextInt(9) + 1;
                }
                if (mas[4][1] == mas[4][4] || mas[4][1] == mas[4][7]) {
                    mas[4][1] = r.nextInt(9) + 1;
                }

                if (mas[5][2] == mas[8][2]) {
                    mas[5][2] = r.nextInt(9) + 1;
                }
                if (mas[5][2] == mas[5][5] || mas[5][2] == mas[5][8]) {
                    mas[5][2] = r.nextInt(9) + 1;
                }


                //5
                if (mas[3][3] == mas[4][4] || mas[3][3] == mas[5][5]) {
                    mas[3][3] = r.nextInt(9) + 1;
                }
                if (mas[3][3] == mas[6][3]) {
                    mas[3][3] = r.nextInt(9) + 1;
                }
                if (mas[3][3] == mas[3][6]) {
                    mas[3][3] = r.nextInt(9) + 1;
                }

                if (mas[4][4] == mas[5][5]) {
                    mas[4][4] = r.nextInt(9) + 1;
                }
                if (mas[4][4] == mas[7][4]) {
                    mas[4][4] = r.nextInt(9) + 1;
                }
                if (mas[4][4] == mas[4][7]) {
                    mas[4][4] = r.nextInt(9) + 1;
                }

                if (mas[5][5] == mas[8][5]) {
                    mas[5][5] = r.nextInt(9) + 1;
                }
                if (mas[5][5] == mas[5][8]) {
                    mas[5][5] = r.nextInt(9) + 1;
                }


                //6
                if (mas[3][6] == mas[4][7] || mas[3][6] == mas[5][8]) {
                    mas[3][6] = r.nextInt(9) + 1;
                }
                if (mas[3][6] == mas[6][6]) {
                    mas[3][6] = r.nextInt(9) + 1;
                }

                if (mas[3][6] == mas[6][6]) {
                    mas[3][6] = r.nextInt(9) + 1;
                }
                if (mas[4][7] == mas[5][8]) {
                    mas[4][7] = r.nextInt(9) + 1;
                }
                if (mas[4][7] == mas[7][7]) {
                    mas[4][7] = r.nextInt(9) + 1;
                }

                if (mas[5][8] == mas[8][8]) {
                    mas[5][8] = r.nextInt(9) + 1;
                }


                //7
                if (mas[6][0] == mas[7][1] || mas[6][0] == mas[8][2]) {
                    mas[6][0] = r.nextInt(9) + 1;
                }
                if (mas[6][0] == mas[6][3] || mas[6][0] == mas[6][6]) {
                    mas[6][0] = r.nextInt(9) + 1;
                }

                if (mas[7][1] == mas[8][2]) {
                    mas[7][1] = r.nextInt(9) + 1;
                }
                if (mas[7][1] == mas[7][4] || mas[7][1] == mas[7][7]) {
                    mas[7][1] = r.nextInt(9) + 1;
                }

                if (mas[8][2] == mas[8][5] || mas[8][2] == mas[8][8]) {
                    mas[8][2] = r.nextInt(9) + 1;
                }


                //8
                if (mas[6][3] == mas[7][4] || mas[6][3] == mas[8][5]) {
                    mas[6][3] = r.nextInt(9) + 1;
                }
                if (mas[6][3] == mas[6][6]) {
                    mas[6][3] = r.nextInt(9) + 1;
                }

                if (mas[7][4] == mas[8][5]) {
                    mas[7][4] = r.nextInt(9) + 1;
                }
                if (mas[7][4] == mas[7][7]) {
                    mas[7][4] = r.nextInt(9) + 1;
                }

                if (mas[8][5] == mas[8][8]) {
                    mas[8][5] = r.nextInt(9) + 1;
                }


                //9
                if (mas[6][6] == mas[7][7] || mas[6][6] == mas[8][8]) {
                    mas[6][6] = r.nextInt(9) + 1;
                }

                if (mas[7][7] == mas[8][8]) {
                    mas[7][7] = r.nextInt(9) + 1;
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                String s = String.valueOf(mas[i ][j ]);
                if(mas[i][j]==0){
                    s=" ";
                }
                System.out.print(s+"\t");
            }
            System.out.println("\t");
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + "  ");
            }
            System.out.println();
        }
   }
}