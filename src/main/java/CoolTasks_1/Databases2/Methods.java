package CoolTasks_1.Databases2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Methods {
    private Map<Company, Worker> map = new HashMap<>();
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Random random = new Random();
    String names[] = {"Ivan", "Petro", "Kata", "Ben", "Ina", "Yarik", "Den", "Rita", "Meri", "Yra"};
    String surnames[] = {"Ivanov", "Prtrov", "Abromov", "Kovalthyk", "Yarmak", "Konovaleth", "Iyarmolenko", "Koval"};
    String positions[] = {"programmer", "economist", "worker", "manager", "accountant", "director"};

    public void createCompany() throws IOException {
        System.out.println("Enter name Company");
        String name = reader.readLine();

        map.put(new Company(name), new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], positions[random.nextInt(positions.length)], random.nextInt(50) + 18, random.nextInt(10000) + 1400));

    }

    public void addWorcer() throws IOException {
        System.out.println("Enter name Company");
        String name = reader.readLine();
        for( Map.Entry<Company, Worker> entry : map.entrySet()){

            entry.setValue(new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], positions[random.nextInt(positions.length)], random.nextInt(50) + 18, random.nextInt(10000) + 1400));
        }
    }
    public void allMap() {
//        for (Company company : map.keySet()) {
//            System.out.println(company);
//            for (List<Worker> workers : map.values()) {
//                System.out.println(workers);
//            }
//        }
        for( Map.Entry<Company, Worker> entry : map.entrySet() ){
            System.out.println( entry.getKey() + " " + entry.getValue() );
        }

    }
}
