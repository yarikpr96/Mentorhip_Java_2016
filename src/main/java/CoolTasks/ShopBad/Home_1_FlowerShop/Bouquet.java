package CoolTasks.ShopBad.Home_1_FlowerShop;

import lombok.Data;

import java.util.List;

@Data
public class Bouquet {
    private String nameBouquet;
    private List<Flower> flowerList;
    private double priceBouquet;

    public Bouquet(List<Flower> flowerList, double priceBouquet, String nameBouquet) {
        this.nameBouquet = nameBouquet;
        this.flowerList = flowerList;
        this.priceBouquet = priceBouquet;
    }


}