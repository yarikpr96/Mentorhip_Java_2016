package CoolTasks_1.Databases;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Methods methods = new Methods();

        methods.createWorker();
        methods.createWorker();
        methods.allList();
//        methods.createCompany();
//        methods.allCompany();
        methods.addMap();
        methods.addMap();

        methods.allMap();


    }
}
