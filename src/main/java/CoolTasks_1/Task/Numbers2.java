package CoolTasks_1.Task;


public class Numbers2 {
    public static void main(String[] args) {
        int mas[] = {1, 2, 3, 4, 5, 6, 7, 8, 12, 15, 10, 11};
        int required = 5;

        for (int s : mas) {
            for (int ss : mas) {
                for (int sss : mas) {
            if( s-ss-sss==5){
                System.out.println(s+" " +"-"+" " +ss+" " +"-"+" " +sss);
            }

                }
            }
        }
    }
}
