package test_17_12_2016.t1;

import test_17_12_2016.t1.Figure;

/**
 * Created by Ярослав on 19.12.2016.
 */
public class Square implements Figure {
    private double height;
    private double weight;

    public Square(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void a() {
        System.out.println(height * height);

    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
