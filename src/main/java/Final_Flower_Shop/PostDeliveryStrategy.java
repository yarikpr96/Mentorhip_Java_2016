package Final_Flower_Shop;


import java.util.List;

public class PostDeliveryStrategy implements IDelivery {


    @Override
    public void deliver(List<Item> items) {
        System.out.println("Доставка" + items);
    }
}
