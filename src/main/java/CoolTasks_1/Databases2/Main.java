package CoolTasks_1.Databases2;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Methods methods = new Methods();
        methods.createCompany();
        methods.allMap();
        methods.addWorcer();

        System.out.println("************************");
        methods.allMap();
    }
}
