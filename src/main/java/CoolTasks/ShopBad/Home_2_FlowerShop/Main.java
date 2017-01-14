package CoolTasks.ShopBad.Home_2_FlowerShop;


/**
 * Created by Ярослав on 25.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower(NameFlower.GLADIOLUS, ColorFlower.BLUE, FreshnessFlower.FRESH, 100, 200);
        Flower flower2 = new Flower(NameFlower.ROSE, ColorFlower.RED, FreshnessFlower.FRESH, 110, 100);
        Flower flower3 = new Flower(NameFlower.TULIP, ColorFlower.GREEN, FreshnessFlower.NOT_FRESH, 60, 50);
        Flower flower4 = new Flower(NameFlower.VIOLET, ColorFlower.WHITE, FreshnessFlower.TOTAKOE, 40, 39);
        Flower flower5 = new Flower(NameFlower.ROSE, ColorFlower.YELLOW, FreshnessFlower.FRESH, 80, 120);

        Bouquet bouquet = new Bouquet();
        bouquet.setNameBouquet("One");
        bouquet.addFlower(flower);
        bouquet.addFlower(flower2);
        bouquet.addFlower(flower3);
        bouquet.addFlower(flower4);
        bouquet.addFlower(flower5);

        Bouquet bouquet2 = new Bouquet();
        bouquet2.setNameBouquet("Two");
        bouquet2.addFlower(flower2);

        Shop shop = new Shop();
        shop.addBouquet(bouquet);
        shop.addBouquet(bouquet2);

        Flower flower0 = new Flower();
        flower0.setColorFlower(ColorFlower.RED);
        // bouquet.findObject(flower0);


        Flowerpot flowerpot = new Flowerpot("Flowerpot", "Red", 50);
  //      bouquet2.addFlower(flowerpot);
        // bouquet.priceBouquet();
        shop.allBouquet();


    }
}
