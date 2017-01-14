package LesBigDecimal;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Long> longs = new ArrayList<Long>();
        List<Number> numberList =  new ArrayList<>();

//        float a = (float) 25.01;
//        float b = (float) 10.01;
//
//        System.out.println(a*b);

//        List<Number> numberList = new ArrayList<>();
        numberList.add(new Double(2.5));
        numberList.add(new Integer(2));
        printOdj(numberList);

//        BigDecimal decimal = new BigDecimal("3.141592653589792323");

//        decimal.add(BigDecimal.valueOf(3.141592653589792323));
//        System.out.println(decimal);

        List<Object> objectList = new ArrayList<Object>();

        objectList.forEach(System.out::println);


    }
     static void printOdj(List<? extends Number > objects){
//        for (Object o: objects){
//            System.out.println(o);
            objects.forEach(System.out::println);
        }
    }

