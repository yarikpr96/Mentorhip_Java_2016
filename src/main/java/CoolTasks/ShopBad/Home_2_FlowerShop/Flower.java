package Home_2_FlowerShop;

import lombok.Data;

/**
 * Created by Ярослав on 25.11.2016.
 */
@Data
public class Flower {
    private NameFlower nameFlower;
    private ColorFlower colorFlower;
    private FreshnessFlower freshnessFlower;
    private double lenghtFlower;
    private double price;

    public Flower(NameFlower nameFlower, ColorFlower colorFlower, FreshnessFlower freshnessFlower, double lenghtFlower, double price) {
        this.nameFlower = nameFlower;
        this.colorFlower = colorFlower;
        this.freshnessFlower = freshnessFlower;
        this.lenghtFlower = lenghtFlower;
        this.price = price;
    }

    public Flower() {
    }


}
