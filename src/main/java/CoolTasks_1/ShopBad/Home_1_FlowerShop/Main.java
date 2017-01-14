package CoolTasks_1.ShopBad.Home_1_FlowerShop;


public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.newBouquetRand("Bouquet", 10);
        Flower flower = new Flower();
        flower.setColorFlower("White");
        System.out.println("*******************************");
        shop.findObject(flower);
        System.out.println("*******************************");
        shop.findLongestFlower("Bouquet");
        System.out.println("*******************************");
        shop.findShortestFlower("Bouquet");
        System.out.println("*******************************");
        shop.allBouquet();
    }
}
