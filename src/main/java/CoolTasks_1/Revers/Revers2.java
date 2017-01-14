package CoolTasks_1.Revers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ярослав on 31.05.2016.
 * Вводиш 10 чисел і видає в зворотньому порядку
 */
public class Revers2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)        {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[array.length - i - 1]);
        }




    }


}
