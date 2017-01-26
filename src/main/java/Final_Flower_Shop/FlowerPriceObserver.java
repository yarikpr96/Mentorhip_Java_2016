package Final_Flower_Shop;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Ярослав on 26.01.2017.
 */
public class FlowerPriceObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        double count = ((FlowerBucket) o).getPrice();
        System.out.println("Changed the price of flowers in the bouquet" +" "+ count);
    }
}
