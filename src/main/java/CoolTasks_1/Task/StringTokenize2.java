package CoolTasks_1.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringTokenize2 {
    public static void main(String[] args) {
        String a = "Программирование - это ни разу не легко";
        String b = "Программирование 1- это легко";
        StringTokenizer st = new StringTokenizer(a);
        StringTokenizer st2 = new StringTokenizer(b);
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        int count = 0;
        while (st.hasMoreTokens()) {
            list1.add(st.nextToken());
        }
        while (st2.hasMoreTokens()) {
            list2.add(st2.nextToken());
        }

        for (String aa : list1) {
            for (String bb : list2) {
                if (bb.equals(aa)) {
                    count++;

                }
            }

        }
        if (count == list2.size()) {
            System.out.println("true");
        } else if (count < list2.size()) {
            System.out.println("false");
        }

    }
}
