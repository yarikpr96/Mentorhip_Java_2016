package CoolTasks_1.Databases;


public class Worker {
    private String name;
    private String surname;
    private String position;
    private int age;
    private int salary;

    public Worker(String name, String surname, String position, int age, int salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.age = age;
        this.salary = salary;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;

        Worker worker = (Worker) o;

        if (getAge() != worker.getAge()) return false;
        if (getSalary() != worker.getSalary()) return false;
        if (!getName().equals(worker.getName())) return false;
        if (!getSurname().equals(worker.getSurname())) return false;
        return getPosition().equals(worker.getPosition());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getSurname().hashCode();
        result = 31 * result + getPosition().hashCode();
        result = 31 * result + getAge();
        result = 31 * result + getSalary();
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
