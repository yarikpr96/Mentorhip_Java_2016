package CoolTasks.Bank;


public class BankCount {
    private int mainAccount;
    private int depositAccount;
    private int creditAccount;

    public BankCount(int mainAccount, int depositAccount, int creditAccount) {
        this.mainAccount = mainAccount;
        this.depositAccount = depositAccount;
        this.creditAccount = creditAccount;
    }

    public int getMainAccount() {
        return mainAccount;
    }

    public void setMainAccount(int mainAccount) {
        this.mainAccount = mainAccount;
    }

    public int getDepositAccount() {
        return depositAccount;
    }

    public void setDepositAccount(int depositAccount) {
        this.depositAccount = depositAccount;
    }

    public int getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(int creditAccount) {
        this.creditAccount = creditAccount;
    }

    public void shareCapital() {
        mainAccount = mainAccount + 10000000;
    }

    public void seeBankCount() {
        System.out.println("Main account of Bank " + getMainAccount());
        System.out.println("Deposit account of Bank " + getDepositAccount());
        System.out.println("Credit account of Bank " + getCreditAccount());

    }

    public void unionBankMoney() {
        mainAccount = mainAccount + depositAccount + creditAccount;
        depositAccount = depositAccount - depositAccount;
        creditAccount = creditAccount - creditAccount;
    }

    @Override
    public String toString() {
        return "BankCount{" +
                "mainAccount=" + mainAccount +
                ", depositAccount=" + depositAccount +
                ", creditAccount=" + creditAccount +
                '}';
    }
}
