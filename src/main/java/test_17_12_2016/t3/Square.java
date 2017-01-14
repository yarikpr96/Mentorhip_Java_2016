package test_17_12_2016.t3;

/**
 * Created by Ярослав on 10.01.2017.
 */
public class Square extends Figure {
   String name;

    public Square(int weight, int hight, String name) {
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
        System.out.println(getHight()*getHight());
    }

    @Override
    public void Perimeter() {
        System.out.println(getHight()*4);
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
