package CoolTasks_1.VerRada;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Fraction {
    private String nameFr;
    Set<Deputat> d = new HashSet<>();
    Deputat p;

    public Fraction(Set<Deputat> d, String nameFr, Deputat p) {
        this.d = d;
        this.nameFr = nameFr;
        this.p = p;

    }

    public Fraction(String nameFr) {
    }

    public Set<Deputat> getD() {
        return d;
    }

    public void setD(Set<Deputat> d) {
        this.d = d;
    }

    public String getNameFr() {
        return nameFr;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    public Deputat getP() {
        return p;
    }

    public void setP(Deputat p) {
        this.p = p;
    }

    public void addDeputat() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введіть ім'я депутата ");
        String name = s.nextLine();
        System.out.println("Введіть прізвище депутата ");
        String surname = s.nextLine();
        System.out.println("Введіть вік депутата");
        int age = s.nextInt();
        System.out.println("Введіть вагу депутата");
        int weight = s.nextInt();
        System.out.println("Введіть ріст депутата");
        int height = s.nextInt();
        System.out.println("Якщо депутат хабарник введіть 1");
        int r = s.nextInt();
        boolean habar = false;
        if (r == 1)
            habar = true;
        d.add(new Deputat(height, weight, surname, name, age, habar));
        System.out.println("Депутата додано");
        s.close();
    }

    public void deleteDeputat() {
        System.out.println("Введіть прізвище депутата щоб видалити");
        Scanner s = new Scanner(System.in);
        String q = s.nextLine();
        Iterator<Deputat> iterator = d.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getSurname().equals(q)) {
                iterator.remove();
                System.out.println("Депутат " + q + "Виключений з фракції");
            }
        }


    }

    // перевір
    public void allHab() {
        for (Deputat deputat : d) {
            if (deputat.getHabar() == true)

                System.out.println(deputat + " розмір хабаря " + deputat.getHabar() + "$");
        }
    }

    public void allDepInF() {
        System.out.println(" Фракція " + nameFr);
        for (Deputat depytat : d) {
            System.out.println(depytat);
        }
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "d=" + d +
                ", nameFr='" + nameFr + '\'' +
                ", p=" + p +
                '}';
    }
}
