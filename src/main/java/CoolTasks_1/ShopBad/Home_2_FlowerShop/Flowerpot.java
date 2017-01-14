package CoolTasks_1.ShopBad.Home_2_FlowerShop;

import lombok.Data;

/**
 * Created by Ярослав on 26.11.2016.
 */
@Data
public class Flowerpot {
    private String  nameFlowerpot;
    private String colorFlowerpot;
    private double price;

    public Flowerpot(String nameFlowerpot, String colorFlowerpot, double price) {
        this.nameFlowerpot = nameFlowerpot;
        this.colorFlowerpot = colorFlowerpot;
        this.price = price;
    }

    public Flowerpot() {
    }
}
