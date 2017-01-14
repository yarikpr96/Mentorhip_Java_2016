package CoolTasks_1.Task;

public class Numbers {
    public static void main(String[] args) {

        int[] mas = {1, 2, 3, 4, 5, 6, 7, 8,};

        int required = 9;


        for (int s : mas) {
            for (int ss : mas) {
                if (s + ss == required) {
                    //        if (s<=5){
                    System.out.println(s + " " + "+" + " " + ss);
                    //    }
                }
            }
        }
    }
}

