package CoolTasks_1.NewBancomat;


class NoMoneyExceptions extends Exception{
    private String error;

    public NoMoneyExceptions(String error) {
        super(error);
        this.error = error;
    }
}
