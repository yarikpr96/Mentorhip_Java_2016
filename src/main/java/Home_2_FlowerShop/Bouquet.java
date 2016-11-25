package Home_2_FlowerShop;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ярослав on 25.11.2016.
 */
@Data
public class Bouquet {
    private String nameBouquet;
    private List<Flower> flowerList = new ArrayList<>();

    public Bouquet(String nameBouquet, List<Flower> flowerList) {
        this.nameBouquet = nameBouquet;
        this.flowerList = flowerList;
    }

    public Bouquet() {
    }

    public void addFlower(Flower flower) {
        flowerList.add(flower);
    }

    public void priceBouquet() {
        double price = flowerList.stream().map(Flower::getPriceFlower).reduce((x, y) -> x + y).get();
        System.out.println("Ціна букету: "+" "+price);
    }

    public void findObject(Flower flower) {
        try {
            flowerList.stream().filter(Flower ->
                    Flower.getNameFlower().equals(flower.getNameFlower()) ||
                            Flower.getColorFlower().equals(flower.getColorFlower()) ||
                            Flower.getFreshnessFlower().equals(flower.getFreshnessFlower()) ||
                            Flower.getPriceFlower() == (flower.getPriceFlower()) ||
                            Flower.getLenghtFlower() == flower.getLenghtFlower()).forEach(System.out::println);
        } catch (Exception e) {
        }
    }


}
