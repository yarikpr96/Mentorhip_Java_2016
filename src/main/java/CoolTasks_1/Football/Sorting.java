package CoolTasks_1.Football;

import java.util.Comparator;

public class Sorting implements Comparator<Objects> {
    @Override
    public int compare(Objects o1, Objects o2) {
        return o2.getPoints()-o1.getPoints();
    }
}
