package Final_Flower_Shop;

import java.util.Observable;
import java.util.Observer;


public class FlowerCountObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        int count = ((FlowerBucket) o).getFlowerList().size();
        System.out.println("Changed the number of flowers in the bouquet" +" "+ count);
    }
}
