package CoolTasks_1.Singleton;

/**
 * Можеш створити в мейні тільки 1 екземпляр класу
 */
public class Singleton {

    private static Singleton instance  = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {

        return Singleton.instance;
    }



}
