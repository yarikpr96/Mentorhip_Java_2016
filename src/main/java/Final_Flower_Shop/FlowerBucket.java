package Final_Flower_Shop;


import java.util.LinkedList;
import java.util.List;

public class FlowerBucket implements Item {
    List<Flower> flowerList = new LinkedList<>();

    public FlowerBucket(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public FlowerBucket() {

    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public String getDescription() {
        return "Flower bouquet";
    }


    public void addFlower(Flower flower) {
        flowerList.add(flower);
    }

    public double getPrice() {
        double priceSum = flowerList.stream().map(Flower::getPrice).reduce((x, y) -> x + y).get();
//        System.out.println("Ціна букету: " + " " + priceSum);
        return priceSum;
    }

    public void searchFlower(Flower flower) {
        try {
            flowerList.stream().filter(Flower ->
                    Flower.getSpec().getColor().equals(flower.getSpec().getColor()) ||
                            Flower.getSpec().getType().equals(flower.getSpec().getType()))
                    .forEach(System.out::println);
        } catch (Exception e) {
        }
    }

    @Override
    public String toString() {
        return "FlowerBucket{" +
                "flowerList=" + flowerList +
                '}';
    }
}

