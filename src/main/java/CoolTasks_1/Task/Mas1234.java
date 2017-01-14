package CoolTasks_1.Task;

/**
 * Created by Ярослав on 14.05.2016.
 */
public class Mas1234 {
    public static void main(String[] args) {
//        int n = 6;
//        int[][] matrix = new int[n][n];
//
//        int row = 0;
//        int col = 0;
//        int dx = 1;
//        int dy = 0;
//        int dirChanges = 0;
//        int visits = n;
//
//        for (int i = 0; i < n * n; i++) {
//            matrix[row][col] = i + 1;
//            if (--visits == 0) {
//                visits = n * (dirChanges % 2) +
//                        n * ((dirChanges + 1) % 2) -
//                        (dirChanges / 2 - 1) - 2;
//                int temp = dx;
//                dx = -dy;
//                dy = temp;
//                dirChanges++;
//            }
//            col += dx;
//            row += dy;
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++)
//                System.out.print(matrix[i][j] + "\t");
//            System.out.println();
//        }
//    }


            int n = 6;
            int m = 6;

            int f = n-1;
            int w = m-1;

            int c = 0;
            int i = 0;
            int j = 0;
            int p = 0;


            int [][] mas = new int [n][m];

            while (c != n*m-1){

                while (j < w) {
                    mas[i][j] = c++;
                    j++;
                }

                while (i < f) {
                    mas[i][j] = c++;
                    i++;
                }

                while (j > p) {
                    mas[i][j] = c++;
                    j--;
                }

//Здесь уменьшаем количество шагов в каждом цикле по строкам, столбцам и по количеству проходимых клеток клеток
                f--;
                w--;
                p++;
                while (i > p) {
                    mas[i][j] = c++;
                    i--;
                }

            }
//Вот условие добавления последнего элемента
            if(c == n*m-1){
                mas[i][j] = c++;
            }

            for (i = 0; i < n; i++){
                for (j = 0; j < m; j++){
                    System.out.printf("%4d", mas[i][j]);
                }
                System.out.println();
            }


        }
    }
