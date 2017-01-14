package CoolTasks_1.Task;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Scanner;

public class DateLife {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now(ZoneId.systemDefault());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter day");
        int day = scanner.nextInt();
        scanner.close();
        LocalDate localDate2 = LocalDate.of(year, month, day);
        System.out.println(localDate);
        System.out.println(localDate2);
        System.out.print("You live ");
        System.out.print(+(localDate.getYear() - localDate2.getYear()) * 365
                + (localDate.getMonthValue() - localDate2.getMonthValue()) * 30
                + (localDate.getDayOfYear() - localDate2.getDayOfYear()));
        System.out.println(" days");
        System.out.println();



    }
}
