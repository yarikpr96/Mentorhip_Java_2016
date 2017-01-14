package CoolTasks_1.Task;


public class MassRun {
    public static void main(String[] args) {
//        int[][] mas = new int[2][2];
//        int[][] mas1 = new int[2][2];
//        mas[0][0] = 1;
//        mas[0][1] = 2;
//        mas[1][0] = 3;
//        mas[1][1] = 4;
//        int count = 4;
//
//        for (int a = 0; a < count; a++) {
//            for (int i = 0; i < mas.length; i++) {
//                for (int j = 0; j < mas.length; j++) {
//                    mas1[0][0] = mas[1][0];
//                    mas1[0][1] = mas[0][0];
//                    mas1[1][0] = mas[1][1];
//                    mas1[1][1] = mas[0][1];
//
//                    //System.out.print(mas1[i][j] + "  ");
//                }
//              //  System.out.println();
//            }
//            mas[0][0] = mas1[0][0];
//            mas[0][1] = mas1[0][1];
//            mas[1][0] = mas1[1][0];
//            mas[1][1] = mas1[1][1];
//
//        }
//        for (int i = 0; i < mas.length; i++) {
//            for (int j = 0; j < mas.length; j++) {
//                System.out.print(mas[i][j] + "  ");
//            }
//            System.out.println();
//        }

        int[][] mas = new int[4][4];
        int[][] mas1 = new int[4][4];
        mas[0][0] = 1;
        mas[0][1] = 2;
        mas[1][0] = 3;
        mas[1][1] = 4;
        mas[0][2] = 5;
        mas[0][3] = 6;
        mas[1][2] = 7;
        mas[1][3] = 8;
        mas[2][0] = 9;
        mas[2][1] = 10;
        mas[3][0] = 11;
        mas[3][1] = 12;
        mas[2][2] = 13;
        mas[2][3] = 14;
        mas[3][2] = 15;
        mas[3][3] = 16;

        int count = 3;

        for (int a = 0; a < count; a++) {
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas.length; j++) {
                    mas1[0][0] = mas[0][2];
                    mas1[0][1] = mas[0][3];
                    mas1[1][0] = mas[1][2];
                    mas1[1][1] = mas[1][3];

                    mas1[0][2] = mas[2][2];
                    mas1[0][3] = mas[2][3];
                    mas1[1][2] = mas[3][2];
                    mas1[1][3] = mas[3][3];

                    mas1[2][2] = mas[2][0];
                    mas1[2][3] = mas[2][1];
                    mas1[3][2] = mas[3][0];
                    mas1[3][3] = mas[3][1];

                    mas1[2][0] = mas[0][0];
                    mas1[2][1] = mas[0][1];
                    mas1[3][0] = mas[1][0];
                    mas1[3][1] = mas[1][1];

                }
            }
            mas[0][0] = mas1[0][0];
            mas[0][1] = mas1[0][1];
            mas[1][0] = mas1[1][0];
            mas[1][1] = mas1[1][1];

            mas[0][2] = mas1[0][2];
            mas[0][3] = mas1[0][3];
            mas[1][2] = mas1[1][2];
            mas[1][3] = mas1[1][3];

            mas[2][2] = mas1[2][2];
            mas[2][3] = mas1[2][3];
            mas[3][2] = mas1[3][2];
            mas[3][3] = mas1[3][3];

            mas[2][0] = mas1[2][0];
            mas[2][1] = mas1[2][1];
            mas[3][0] = mas1[3][0];
            mas[3][1] = mas1[3][1];
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
