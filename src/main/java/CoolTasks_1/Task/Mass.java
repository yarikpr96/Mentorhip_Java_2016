package CoolTasks_1.Task;

/**
 * Created by Ярослав on 19.04.2016.
 */
public class Mass {
    public static void main(String args[]) {
//        int val = 1;
//        for (int i = 0; i < 8; i++) {
//            for (int t = 128; t > 0; t = t / 2) {
//                if ((val & t) != 0) System.out.print("1 ");
//                else System.out.print("0 ");
//            }
//            System.out.println();
//            val = val << 1; // сдвинуть влево
//        }
//        System.out.println();
//        val = 128;
//        for (int i = 0; i < 8; i++) {
//            for (int t = 128; t > 0; t = t / 2) {
//                if ((val & t) != 0) System.out.print("1 ");
//                else System.out.print("0 ");
//            }
//            System.out.println();
//            val = val >> 1; // сдвинуть вправо
//        }

        int arr[][] = new int[5][5];



        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {

                arr[i][j]=25-j;
                System.out.print(arr[i][j] +
                        "\t");
            }

            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {

                arr[0][4] = i - j;
                System.out.print(arr[i][j] +
                        "\t");
            }

            System.out.println();


        }

    }}
