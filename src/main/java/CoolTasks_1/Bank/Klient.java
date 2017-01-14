package CoolTasks_1.Bank;


import java.time.LocalDate;

public class Klient {

    private String name;
    private String surname;
    private String sex;
    private LocalDate dateBirthday;
    private String pasport;
    private int numberCount;
    private String valuteCount;
    private int balanceCount;

    public Klient(String name, String surname, String sex, LocalDate dateBirthday, String pasport, int numberCount, String valuteCount, int balanceCount) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.dateBirthday = dateBirthday;
        this.pasport = pasport;
        this.numberCount = numberCount;
        this.valuteCount = valuteCount;
        this.balanceCount = balanceCount;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(LocalDate dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public String getPasport() {
        return pasport;
    }

    public void setPasport(String pasport) {
        this.pasport = pasport;
    }

    public int getNumberCount() {
        return numberCount;
    }

    public void setNumberCount(int numberCount) {
        this.numberCount = numberCount;
    }

    public String getValuteCount() {
        return valuteCount;
    }

    public void setValuteCount(String valuteCount) {
        this.valuteCount = valuteCount;
    }

    public int getBalanceCount() {
        return balanceCount;
    }

    public void setBalanceCount(int balanceCount) {
        this.balanceCount = balanceCount;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                ", dateBirthday=" + dateBirthday +
                ", pasport='" + pasport + '\'' +
                ", numberCount=" + numberCount +
                ", valuteCount='" + valuteCount + '\'' +
                ", balanceCount=" + balanceCount +
                '}';
    }
}
