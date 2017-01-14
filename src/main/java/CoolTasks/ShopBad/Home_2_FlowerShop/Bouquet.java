package CoolTasks.ShopBad.Home_2_FlowerShop;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ярослав on 25.11.2016.
 */
@Data
public class Bouquet {
    private String nameBouquet;
    private List<Flower> list = new ArrayList<>();

    public Bouquet(String nameBouquet, List<Flower> list) {
        this.nameBouquet = nameBouquet;
        this.list = list;
    }

    public Bouquet() {
    }

    public void addFlower(Flower o) {
        list.add(o);
    }

    public void priceBouquet() {
        double price = list.stream().map(Flower::getPrice).reduce((x, y) -> x + y).get();
        System.out.println("Ціна букету: "+" "+price);
    }

    public void findObject(Flower flower) {
        try {
            list.stream().filter(Flower ->
                    Flower.getNameFlower().equals(flower.getNameFlower()) ||
                            Flower.getColorFlower().equals(flower.getColorFlower()) ||
                            Flower.getFreshnessFlower().equals(flower.getFreshnessFlower()) ||
                            Flower.getPrice() == (flower.getPrice()) ||
                            Flower.getLenghtFlower() == flower.getLenghtFlower()).forEach(System.out::println);
        } catch (Exception e) {
        }
    }


}
