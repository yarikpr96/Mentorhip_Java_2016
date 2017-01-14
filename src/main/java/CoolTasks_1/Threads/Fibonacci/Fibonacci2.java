package CoolTasks_1.Threads.Fibonacci;


public class Fibonacci2 extends Thread {

    int[] Mas = new int[10];

    @Override
    public void run() {
        for (int i = 0; i < Mas.length; i++) {
            if (i < 2) {
                Mas[i] = 1;
            } else {
                Mas[i] = Mas[i - 2] + Mas[i - 1];
            }


//            int a = 9;
//            do {
//
//                System.out.print(Mas[0 + a] + "  ");
//                a--;
//            } while (a != -1);
        } try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        int a =9;
do {

    System.out.println(Mas[0 + a] + "  ");
a--;
}while (a!=-1);
}}