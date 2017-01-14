package test_17_12_2016.t3;

/**
 * Created by Ярослав on 10.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Square square = new Square(10,10,"One");
        Rectangle rectangle = new Rectangle(15,20,"Two");
        square.Area();
        square.Perimeter();
        rectangle.Area();
        rectangle.Perimeter();
    }
}
