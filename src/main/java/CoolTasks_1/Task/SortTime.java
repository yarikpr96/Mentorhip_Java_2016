package CoolTasks_1.Task;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SortTime {
    public static void main(String[] args) {
        LocalTime a = LocalTime.of(10, 20, 30);
        LocalTime b = LocalTime.of(7, 30, 11);
        LocalTime c = LocalTime.of(23, 59, 59);
        LocalTime d = LocalTime.of(13, 30, 30);

        List<LocalTime> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.stream().sorted((p1,p2)-> p1.compareTo(p2));


     //   list.forEach(( LocalTime value) -> System.out.println(value));
        list.forEach(System.out::println);


    }
}