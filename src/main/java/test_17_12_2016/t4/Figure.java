package test_17_12_2016.t4;


public class Figure {
    private int weight;
    private int height;

    public Figure(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figure)) return false;

        Figure figure = (Figure) o;

        if (getWeight() != figure.getWeight()) return false;
        return getHeight() == figure.getHeight();

    }

    @Override
    public int hashCode() {
        int result = getWeight();
        result = 31 * result + getHeight();
        return result;
    }
}
