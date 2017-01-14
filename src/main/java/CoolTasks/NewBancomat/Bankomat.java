package CoolTasks.NewBancomat;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bankomat {
    private int balance;
    private int amount;
    User user;
    Set<User> users = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    public void addUsers() {
        System.out.println("Enter ID");
        System.out.println("Enter pin");
        users.add(new User(scanner.nextInt(), scanner.nextInt()));
        System.out.println("User add!!!");
    }

    public void Control() throws NoMoneyExceptions {
        for (User user : users) {
            System.out.println("Enter You pin");
            if (user.getPin() == scanner.nextInt()) {
                System.out.println("Hello!");
                System.out.println("If You want add money enter 1 ");
                System.out.println("If You want with drow money enter 2");
                int a = scanner.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("Add money");
                        amount = scanner.nextInt();
                        balance = balance + amount;
                        System.out.println("You have " + balance);
                        System.out.println("If you wont go menu enter 1, exit enter 0");
                        if (scanner.nextInt() == 1) {
                            Control();
                        } else {
                            System.exit(0);
                        }
                    case 2:
                        System.out.println("Enter sum");
                        amount = scanner.nextInt();
                        if (this.balance > amount) {
                            this.balance = this.balance - amount;
                            System.out.println("Pleas wait ... here you are " + amount);
                            System.out.println("Your balance is " + this.balance);
                            System.out.println("If you wont go menu enter 1, exit enter 0");
                            Scanner sc = new Scanner(System.in);
                            int z = sc.nextInt();
                            if (z == 1) {
                                Control();
                            }else {
                               System.exit(0);
                            }


                        } else {
                            System.out.println("Not have money ... Your balance is " + this.balance);
                            Integer i = amount;
                            String amountStr = i.toString();
                            throw new NoMoneyExceptions("You don`t have: " + amountStr);
                        }
                }
            } else {
                System.out.println("Enter again you pin");
                Control();
            }
        }
    }
}






