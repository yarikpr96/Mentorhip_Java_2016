package Final_Flower_Shop;



public class FlowerSpec {

    private FlowerType type;
    private FlowerColor color;

    public FlowerSpec(FlowerType type, FlowerColor color) {
        this.type = type;
        this.color = color;
    }


    public FlowerType getType() {
        return type;
    }

    public void setType(FlowerType type) {
        this.type = type;
    }

    public FlowerColor getColor() {
        return color;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "FlowerSpec{" +
                "type=" + type +
                ", color=" + color +
                '}';
    }


}
