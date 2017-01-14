package CoolTasks_1.TimeSort;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
/*
Сортировка времени. #java
Дано определенное количество различных состояний цифровых часов в формате чч::мм::cc
Необходимо вывести их на экран таким образом, чтобы каждое новое состояние было больше (позже), чем предыдущее.
 */
public class Main {
    public static void main(String[] args) {
        List<Time> timeList = new ArrayList<>();
        timeList.add(new Time(LocalTime.of(10, 20, 30)));
        timeList.add(new Time(LocalTime.of(7, 30, 1)));
        timeList.add(new Time(LocalTime.of(23, 59, 59)));
        timeList.add(new Time(LocalTime.of(13, 30, 30)));

        timeList.stream().sorted((p1, p2) -> p1.getTime().compareTo(p2.getTime())).
                forEach(System.out::println);
//        timeList.sort((o1, o2) -> o1.getTime().compareTo(o2.getTime()));
//        timeList.forEach(System.out::println);
    }
}
