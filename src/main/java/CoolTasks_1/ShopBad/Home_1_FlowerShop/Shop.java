package CoolTasks_1.ShopBad.Home_1_FlowerShop;

import CoolTasks_1.ShopBad.Home_1_FlowerShop.Interface.AddBouquet;
import CoolTasks_1.ShopBad.Home_1_FlowerShop.Interface.FindFlower;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

@Data
public class Shop implements AddBouquet, FindFlower {

    List<Bouquet> bouquetList = new ArrayList<>();
    Random random = new Random();


    @Override
    public void newBouquetRand(String nameBouquet, int numberFlowerInBouquet) {
        List<Flower> flowerList = new ArrayList<>();
        String names[] = {"Rose", "Tulip", "Violet", "Gladiolus", "Strelitz", "Lanthanum"};
        String color[] = {"White", "Blue", " Yellow", "Green", "Red"};
        double lenght;
        double pricef;
        FreshnessFlower freshnessFlower;
        for (int i = 1; i <= numberFlowerInBouquet; i++) {
            freshnessFlower = FreshnessFlower.values()[(int) (Math.random() * FreshnessFlower.values().length)];
            flowerList.add(new Flower(names[random.nextInt(names.length)], color[random.nextInt(color.length)], lenght = random.nextInt(200) + 1, pricef = random.nextInt(200) + 1, freshnessFlower));
        }
        double price = flowerList.stream().map(Flower::getPriceFlower).reduce((x, y) -> x + y).get();
        bouquetList.add(new Bouquet(flowerList, price, nameBouquet));
    }


    @Override
    public void findObject(Flower flower) {
        List<Flower> flowerList = new ArrayList<>();
        for (Bouquet bouquet : bouquetList) {
            flowerList = bouquet.getFlowerList();
        }
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

    @Override
    public void findLongestFlower(String nameBouquet) {
        List<Flower> flowerList = new ArrayList<>();
        for (Bouquet bouquet : bouquetList) {
            if (bouquet.getNameBouquet().equals(nameBouquet)) {
                flowerList = bouquet.getFlowerList();
            }
        }
        Flower flower = flowerList.stream().max(Comparator.comparing(Flower::getLenghtFlower)).get();
        System.out.println(flower);
    }

    @Override
    public void findShortestFlower(String nameBouquet) {
        List<Flower> flowerList = new ArrayList<>();
        for (Bouquet bouquet : bouquetList) {
            if (bouquet.getNameBouquet().equals(nameBouquet)) {
                flowerList = bouquet.getFlowerList();
            }
        }
        Flower flower = flowerList.stream().min(Comparator.comparing(Flower::getLenghtFlower)).get();
        System.out.println(flower);
    }

    //Виводить всі букети
    public void allBouquet() {
        bouquetList.forEach(System.out::println);
    }
}
