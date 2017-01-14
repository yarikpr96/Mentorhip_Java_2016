package CoolTasks_1.VerRada;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class VerhovnaRada {
    Scanner s = new Scanner(System.in);
    Set<Fraction> verhovnaRada = new HashSet<>();
    int count = 0;

    public void addFraction() {
        count++;
        System.out.println("Введіть назву фракції");
        String nameFr = s.nextLine();
        verhovnaRada.add(new Fraction(nameFr));
        System.out.println("Фракцію " + nameFr + " доданодо верховноїради ");

    }

    public void deleteFraction() {
count--;
        System.out.println("Введіть назву фракції щоб видалити");
        for (Fraction frakcia : verhovnaRada) System.out.print(frakcia.getNameFr() + ", ");
        Iterator<Fraction> iterator = verhovnaRada.iterator();
        String g = s.nextLine();
        while (iterator.hasNext()) {
            if (iterator.next().getNameFr().toLowerCase().equals(g))
                iterator.remove();

        }
        System.out.println();
        System.out.println("Фракцію " + g + " видалено");
        System.out.println("===============================================");

    }

    public void printAllFraction() {
        int com = 1;
        System.out.println("Вверховній раді є  " + count + " фракцій");
        for (Fraction frakcia : verhovnaRada) {
            System.out.println("		" + com + ". " + frakcia.getNameFr());
            com++;
        }
    }

    public void addDepytats() {
        System.out.println("Введіть назву фракції в яку додати депутата");
        printAllFraction();
        String r = s.nextLine();
        for (Fraction frakcia : verhovnaRada) {
            if (frakcia.getNameFr().toLowerCase().equals(r))
                frakcia.addDeputat();
        }
    }

    public void clearFraction() {
        System.out.println("Введіть назву фракції щоб очистити");
        for (Fraction frakcia : verhovnaRada) {
            System.out.print(frakcia.getNameFr() + ", ");
        }
        String g = s.nextLine();
        for (Fraction frakcia : verhovnaRada) {
            if (frakcia.getNameFr().toLowerCase().equals(g))
                frakcia.d.clear();
        }
        System.out.println();
        System.out.println("Фракцію " + g + " очищено");
        System.out.println("===================================");

    }

    public void vuvestyFrakciy() {
        System.out.println("Введіть назву фракції щоб вивести на екран");
        for (Fraction frakcia : verhovnaRada) {
            System.out.print(frakcia.getNameFr() + ", ");
        }
        String g = s.nextLine();
        for (Fraction frakcia : verhovnaRada) {
            if (frakcia.getNameFr().toLowerCase().equals(g))
                frakcia.allDepInF();
        }
        System.out.println("=============================");
        System.out.println();
        System.out.println();
    }

    public void deleteDep() {
        System.out.println("Введіть фракцію з якої потрібн видалити депутата");
        for (Fraction frakcia : verhovnaRada) {
            System.out.print(frakcia.getNameFr() + ", ");
        }
        String g = s.nextLine();

        for (Fraction frakcia : verhovnaRada) {
            if (frakcia.getNameFr().toLowerCase().equals(g))
                frakcia.deleteDeputat();
        }
    }

    public void vyvidHabar() {
        for (Fraction frakcia : verhovnaRada) {
            System.out.println(frakcia.getNameFr());
            frakcia.allHab();
        }
    }



}
