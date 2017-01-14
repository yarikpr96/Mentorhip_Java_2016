package CoolTasks_1.Bank;


import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, NoMoneyExceptions {
        Metods metods = new Metods();
        metods.bankCount.shareCapital();
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        int variable = 0;
        do {
            if (variable == 1) {
                metods.addKlient();
            }
            if (variable == 2) {
                metods.addMoney();
            }
            if (variable == 3) {
                metods.addDeposit();
                metods.bankCount.unionBankMoney();
            }
            if (variable == 4) {
                metods.takeCredit();
                metods.bankCount.unionBankMoney();
            }
            if (variable == 5) {
                metods.transferMoney();
            }
            if (variable == 6) {
                metods.allKlients();
            }
            if (variable == 7) {
                metods.bankCount.seeBankCount();
            }
            if (variable == 8) {
                System.exit(0);
            }
            System.out.println();
            System.out.println("Click 1 to add client");
            System.out.println("Click 2 to add money");
            System.out.println("Click 3 to put a deposit");
            System.out.println("Click 4 to take credit");
            System.out.println("Click 5 to transfer money");
            System.out.println("Click 6 to see all customers");
            System.out.println("Click 7 to see banc count");
            System.out.println("Click 8 to exit ");
            System.out.println();
            variable = scanner.nextInt();
        } while (isTrue);


    }
}