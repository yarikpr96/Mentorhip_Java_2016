package Final_Flower_Shop;



public class RomashkaFlower extends Flower
{
    public RomashkaFlower(int height) {
        super(new FlowerSpec(FlowerType.ROMASHKA, FlowerColor.WHITE),height);
    }
    public double getPrice() {
        return  3 * getHeight();
    }
}
