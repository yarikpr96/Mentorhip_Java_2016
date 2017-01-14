package CoolTasks_1.VerRada;


import java.util.Scanner;

public class Deputat extends Human{
    private String surname;
    private String name;
    private int age;
    private boolean habar;


    public Deputat(int height, int weight, String surname, String name, int age, boolean habar) {
        super(height, weight);
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.habar = habar;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getHabar() {
        return habar;
    }

    public void setHabar(boolean habar) {
        this.habar = habar;
    }
    public void  doHabar(){
        if (habar==false){
            System.out.println("цей депутат небере хабарів");

        }else if (habar== true){
            System.out.println("Введіь суму хабаря");
            Scanner s = new Scanner(System.in);
            int sumhabar= s.nextInt();
            s.close();
            if (sumhabar>5000){
                System.out.println("Люстрація");

            }else {
                System.out.println("Сума хабаря складає "+ sumhabar );
            }
        }

    }

    @Override
    public String toString() {
        return "Deputat{" +
                "age=" + age +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", habar=" + habar +
                "} " + super.toString();
    }
}
