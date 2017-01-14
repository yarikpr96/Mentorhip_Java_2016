package Final_Flower_Shop;



public class CactusFlower extends Flower {
    public CactusFlower(int height) {
        super(new FlowerSpec(FlowerType.CACTUS, FlowerColor.YELLOW),height);
    }
    public double getPrice() {
        return 5*getHeight();
    }
}
