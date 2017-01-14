package CoolTasks_1.Task;

/*
Пошук послідовності з найбільшою сумою.
Даний масив і довжина послідовності.
Знайти послідовність даної довжини таку, що сума її елементів максимальна. (Бажано не сортувати масив)
Тест.
Масив [1, 2 ,5, 1, 7, 4]
Довжина послідовності 3
Відповідь 5 7 4
 */
/*
Мінуси у мому коді є мій код і те, що я використовую 3 цикла і ставлю умову, що елементи масивну не повторялись
а у масиві є дві одиниці .
 */
public class Top3number {
    public static void main(String[] args) {
        int mas[] = {1, 2, 5, 1, 7, 4};
        int c = 0;
        int cc = 0;
        int count = 0;

        for (int i : mas) {
            for (int ii : mas) {
                for (int iii : mas) {
                    if (i != ii && i != iii && ii != iii) {
                        cc = i * ii * iii;
                        if (cc > c) {
                            c = cc;
                            /*
                            Якщо тут виводити елементи(і,іі,ііі) то виводить і попередні результати
                            а останній результат в кінці.Тому я змушений робити ще 3 цикла(((
                             */
//                            System.out.print("[");
//                            System.out.print(i);
//                            System.out.print(" ");
//                            System.out.print(ii);
//                            System.out.print(" ");
//                            System.out.print(iii);
//                            System.out.print("]");
//                            System.out.println();
                        }
                    }
                }
            }
        }
        System.out.println(c);
        for (int s : mas) {
            for (int ss : mas) {
                for (int sss : mas) {
                    if (count == 0) {
                        if (s * ss * sss == c) {
                            count++;
                            System.out.println(s + " " + ss + " " + sss);
                        }
                    }
                }
            }
        }
    }
}
