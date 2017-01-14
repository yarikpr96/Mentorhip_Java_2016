package CoolTasks_1.Databases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Methods {
    private List<Worker> workerList = new ArrayList<Worker>();
    private Set<Company> companySet = new HashSet<Company>();
    private Map<Company, ArrayList<Worker>> map = new HashMap<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void createWorker() {
        String names[] = {"Ivan", "Petro", "Kata", "Ben", "Ina", "Yarik", "Den", "Rita", "Meri", "Yra"};
        String surnames[] = {"Ivanov", "Prtrov", "Abromov", "Kovalthyk", "Yarmak", "Konovaleth", "Iyarmolenko", "Koval"};
        String positions[] = {"programmer", "economist", "worker", "manager", "accountant", "director"};
        Random random = new Random();
        workerList.add(new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)],
                positions[random.nextInt(positions.length)], random.nextInt(50) + 18, random.nextInt(10000) + 1400));
    }

    public void allList() {
        for (Worker worker : workerList) {
            System.out.println(worker);
        }
    }

    public void createCompany() throws IOException {
        System.out.println("Enter the name of Company ");
        String name = reader.readLine();
        System.out.println("Enter the number of workers ");
        String n = reader.readLine();
        int number = Integer.parseInt(n);
        companySet.add(new Company(name, number));
    }

    public void allCompany() {
        for (Company company : companySet) {
            System.out.println(company);
        }
    }

    public void addMap() throws IOException {
        System.out.println("Enter the name of Company ");
        String name = reader.readLine();
        System.out.println("Enter the number of workers ");
        String n = reader.readLine();
        int number = Integer.parseInt(n);
        map.put(new Company(name,number),new ArrayList<Worker>());
    }

    public void allMap() {
        for (Company company : map.keySet()){
            System.out.println(company);
            for (ArrayList<Worker>workers:map.values()){
                System.out.println(workers);
            }
        }

    }

}
