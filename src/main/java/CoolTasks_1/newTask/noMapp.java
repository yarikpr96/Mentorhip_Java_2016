package CoolTasks_1.newTask;

import java.util.Scanner;

/**
 * Created by Ярослав on 22.06.2016.
 */
public class noMapp {
    public static void main(String[] args) {
        String output = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String word = sc.nextLine();
        for(int i = 0, length = 1; i < word.length(); i++) {
            if (i + 1<word.length() && word.charAt(i) == word.charAt(i + 1) ){
                length++;
            } else {
                output+=word.charAt(i);
                if(length>1) output+=length;
                length = 1;
            }
        }
        System.out.print(word + " = " + output);
    }
}
