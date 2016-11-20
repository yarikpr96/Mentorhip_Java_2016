package Home_1_FlowerShop;
import lombok.Data;

@Data
public class Flower {
    private String nameFlower;
    private String colorFlower;
    private double lenghtFlower;
    private double priceFlower;
    private FreshnessFlower freshnessFlower;


    public Flower(String nameFlower, String colorFlower, double lenghtFlower, double priceFlower,FreshnessFlower freshnessFlower) {
        this.nameFlower = nameFlower;
        this.colorFlower = colorFlower;
        this.lenghtFlower = lenghtFlower;
        this.priceFlower = priceFlower;
        this.freshnessFlower = freshnessFlower;
    }

    public Flower() {
    }
}
