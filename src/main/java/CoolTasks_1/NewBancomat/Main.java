package CoolTasks_1.NewBancomat;


public class Main {
    public static void main(String[] args) throws NoMoneyExceptions {

        Bankomat bankomat = new Bankomat();
        bankomat.addUsers();
        System.out.println();
        bankomat.Control();


    }
}
