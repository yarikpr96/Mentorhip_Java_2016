package test_17_12_2016.t2;

/**
 * Created by Ярослав on 19.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        String a0 = "a";
        String a1 = "a";
        String a2 = new String("a");

        System.out.println(a0==a1);
        System.out.println(a0==a2);
        System.out.println(a0.equals(a1));
        System.out.println(a0.equals(a2));

    }
}