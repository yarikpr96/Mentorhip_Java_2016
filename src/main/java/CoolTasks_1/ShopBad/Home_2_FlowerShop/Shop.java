package CoolTasks_1.ShopBad.Home_2_FlowerShop;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Shop {
    private List<Bouquet> bouquetList = new ArrayList<>();

    public Shop(List<Bouquet> bouquetList) {
        this.bouquetList = bouquetList;
    }

    public Shop() {
    }

    public void addBouquet(Bouquet bouquet) {
        bouquetList.add(bouquet);
    }



    public void allBouquet() {
        bouquetList.forEach(System.out::println);
    }


}
