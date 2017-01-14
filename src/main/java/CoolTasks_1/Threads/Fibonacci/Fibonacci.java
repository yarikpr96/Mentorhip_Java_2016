package CoolTasks_1.Threads.Fibonacci;


public class Fibonacci extends Thread {
    int a = 0, b = 1, c = 0, i = 0;

    @Override
    public void run() {
        while (i < 10) {

            a = b;
            b = c;
            c = a + b;

            i++;

            System.out.println(c);


            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
