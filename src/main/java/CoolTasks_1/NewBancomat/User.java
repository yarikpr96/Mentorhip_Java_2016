package CoolTasks_1.NewBancomat;


public class User {
    private int ID;
    private int pin;

    public User(int ID, int pin) {
        this.ID = ID;
        this.pin = pin;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", pin=" + pin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (getID() != user.getID()) return false;
        return getPin() == user.getPin();

    }

    @Override
    public int hashCode() {
        int result = getID();
        result = 31 * result + getPin();
        return result;
    }
}
