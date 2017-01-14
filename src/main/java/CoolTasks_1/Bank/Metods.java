package CoolTasks_1.Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Metods {

    Klient klient;
    BankCount bankCount = new BankCount(0, 0, 0);
    Set<Klient> set = new LinkedHashSet<Klient>();

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void addKlient() throws IOException {
        System.out.println("Enter name");
        String name = reader.readLine();
        System.out.println("Enter surname");
        String surname = reader.readLine();
        System.out.println("Enter sex");
        String sex = reader.readLine();
        System.out.println("Enter dateBirthday");
        System.out.println("Enter year");
        String a = reader.readLine();
        int year = Integer.parseInt(a);
        System.out.println("Enter month");
        String aa = reader.readLine();
        int mouth = Integer.parseInt(aa);
        System.out.println("Enter day");
        String aaa = reader.readLine();
        int day = Integer.parseInt(aaa);
        System.out.println("Enter pasport");
        String pasport = reader.readLine();
        System.out.println("Enter numberCount");
        String aaaa = reader.readLine();
        int numberCount = Integer.parseInt(aaaa);
        System.out.println("Enter valuteCount");
        String valuteCount = reader.readLine();
        System.out.println("Enter balanceCount");
        String aaaaa = reader.readLine();
        int balanceCount = Integer.parseInt(aaaaa);
        set.add(new Klient(name, surname, sex, LocalDate.of(year, mouth, day), pasport, numberCount, valuteCount, balanceCount));
        System.out.println("Customer added!");
    }

    public void allKlients() {
        for (Klient klient : set) {
            System.out.println(klient);
        }
    }

    public void addMoney() throws IOException {
        Iterator<Klient> iter = set.iterator();
        System.out.println("Enter name");
        String name1 = reader.readLine();
        System.out.println("Enter surname");
        String surname1 = reader.readLine();
        while (iter.hasNext()) {
            Klient klient = iter.next();
            if (klient.getName().equals(name1) && klient.getSurname().equals(surname1)) {
                System.out.println("Enter amount of money");
                String ssum1 = reader.readLine();
                int isum1 = Integer.parseInt(ssum1);
                klient.setBalanceCount(klient.getBalanceCount() + isum1);
                System.out.println("transfer made");
            }
        }
    }

    public void transferMoney() throws IOException, NoMoneyExceptions {
        int transferM = 0;
        System.out.println("Enter  name");
        String name1 = reader.readLine();
        System.out.println("Enter surname");
        String surname1 = reader.readLine();
        for (Klient klient : set) {
            if (klient.getName().equals(name1) && klient.getSurname().equals(surname1)) {
                System.out.println("Enter amount of  money");
                String ssum2 = reader.readLine();
                transferM = Integer.parseInt(ssum2);
                if (klient.getBalanceCount() >= transferM) {
                    klient.setBalanceCount(klient.getBalanceCount() - transferM);
                    System.out.println("money deducted ...");
                } else if (klient.getBalanceCount() < transferM) {
                    throw new NoMoneyExceptions("Not have money ...");
                }
            }
        }
        System.out.println("Enter the name of the recipient");
        String name2 = reader.readLine();
        System.out.println("Enter the surname of the recipient");
        String surname2 = reader.readLine();
        for (Klient klient : set) {
            if (klient.getName().equals(name2) && klient.getSurname().equals(surname2)) {
                klient.setBalanceCount(klient.getBalanceCount() + transferM);
                System.out.println("transfer made");
            }
        }
    }

    public void addDeposit() throws IOException, NoMoneyExceptions {
        int depositMoney = 0;
        System.out.println("Enter  name");
        String name1 = reader.readLine();
        System.out.println("Enter surname");
        String surname1 = reader.readLine();
        for (Klient klient : set) {
            if (klient.getName().equals(name1) && klient.getSurname().equals(surname1)) {
                System.out.println("Enter amount of money");
                String ssum2 = reader.readLine();
                depositMoney = Integer.parseInt(ssum2);
                if (klient.getBalanceCount() >= depositMoney) {
                    klient.setBalanceCount(klient.getBalanceCount() - depositMoney);
                    System.out.println("money  deducted ...");
                    bankCount.setDepositAccount(bankCount.getDepositAccount() + depositMoney);
                    System.out.println("Deposit made");
                } else if (klient.getBalanceCount() < depositMoney) {
                    throw new NoMoneyExceptions("Not have  money ...");
                }
            }
        }
    }

    public void takeCredit() throws IOException {
        int sumCredit = 0;
        System.out.println("Enter  name");
        String name = reader.readLine();
        System.out.println("Enter surname");
        String surname = reader.readLine();
        for (Klient klient : set) {
            if (klient.getName().equals(name) && klient.getSurname().equals(surname)) {
                System.out.println("Enter sum Credit not more 300 000");
                String sc = reader.readLine();
                sumCredit = Integer.parseInt(sc);
                if (sumCredit <= 300000) {
                    klient.setBalanceCount(klient.getBalanceCount() + sumCredit);
                    bankCount.setMainAccount(bankCount.getMainAccount() - sumCredit);
                    System.out.println("Credit add");
                } else if (sumCredit > 300000) {
                    System.out.println("take lower sum of money");
                    takeCredit();
                }
            }
        }
    }


}