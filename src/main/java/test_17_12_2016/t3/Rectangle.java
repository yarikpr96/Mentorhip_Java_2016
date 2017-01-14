package test_17_12_2016.t3;

/**
 * Created by Ярослав on 10.01.2017.
 */
public class Rectangle extends Figure {
    String name;

    public Rectangle(int weight, int hight, String name) {
        super(weight, hight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Area() {

        System.out.println(getHight() * getWeight());
    }

    @Override
    public void Perimeter() {

        System.out.println((getHight() + getWeight()) * 2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
