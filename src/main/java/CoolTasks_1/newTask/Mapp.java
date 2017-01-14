package CoolTasks_1.newTask;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Mapp {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        int c = 0;
        for (char i = 65; i <= 90; i++) {
            map.put(String.valueOf(i), 0);
        }
        for (char ii = 97; ii <= 122; ii++) {
            map.put(String.valueOf(ii), 0);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter word");
        String a = reader.readLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            list.add(String.valueOf(a.charAt(c)));
            c++;
        }
        for (Map.Entry<String, Integer> er : map.entrySet()) {
            for (String o : list) {
                if (er.getKey().equals(o)) {
                    er.setValue(er.getValue() + 1);
                }
            }
            if (er.getValue() != 0) {
                System.out.print(er.getKey());
                System.out.print(" ");
                System.out.println(er.getValue());
            }
        }
    }
}
