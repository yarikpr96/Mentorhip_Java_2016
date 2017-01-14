package test_17_12_2016.t3;


public class Figure {
    private int weight;
    private int hight;

    public Figure(int weight, int hight) {
        this.weight = weight;
        this.hight = hight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
    public void Area(){

    }
    public void Perimeter(){

    }

    @Override
    public String toString() {
        return "Figure{" +
                "weight=" + weight +
                ", hight=" + hight +
                '}';
    }
}
