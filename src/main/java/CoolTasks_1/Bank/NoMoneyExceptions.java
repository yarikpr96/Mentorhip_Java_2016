package CoolTasks_1.Bank;


public class NoMoneyExceptions extends Exception {
    private String Error;

    public NoMoneyExceptions(String error) {
        Error = error;
    }
}
