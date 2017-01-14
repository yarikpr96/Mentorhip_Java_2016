package Final_Flower_Shop;

public abstract class Flower {
    private FlowerSpec spec;
    private int height;

    public Flower(FlowerSpec spec, int height) {
        this.spec = spec;
        this.height = height;
    }

    public FlowerSpec getSpec() {
        return spec;
    }

    public abstract double getPrice();

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "spec=" + getSpec() +
                ", price=" + getPrice() +
                ", height=" + getHeight() +
                '}';
    }
}
