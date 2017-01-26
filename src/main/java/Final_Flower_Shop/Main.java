package Final_Flower_Shop;


public class Main {
    public static void main(String[] args) {
        FlowerCountObserver observer = new FlowerCountObserver();
        FlowerPriceObserver priceObserver = new FlowerPriceObserver();
        Item flowerBucket = new FlowerBucket();

        ((FlowerBucket) flowerBucket).addObserver(observer);
        ((FlowerBucket) flowerBucket).addObserver(priceObserver);
        ((FlowerBucket) flowerBucket).addFlower(new RomashkaFlower(15));
        ((FlowerBucket) flowerBucket).notifyObservers();
        ((FlowerBucket) flowerBucket).addFlower(new RomashkaFlower(55));
        ((FlowerBucket) flowerBucket).notifyObservers();
        ((FlowerBucket) flowerBucket).addFlower(new CactusFlower(31));
        ((FlowerBucket) flowerBucket).notifyObservers();
        ((FlowerBucket) flowerBucket).addFlower(new CactusFlower(32));
        ((FlowerBucket) flowerBucket).notifyObservers();

        flowerBucket = new PaperDecorator(flowerBucket);
        System.out.println(flowerBucket.getDescription());
        System.out.println(flowerBucket.getPrice());

//        Item flowerBucket2 = new FlowerBucket();
//        ((FlowerBucket) flowerBucket2).addFlower(new CactusFlower(16));
//        ((FlowerBucket) flowerBucket2).addFlower(new RomashkaFlower(17));
//        flowerBucket2 = new BasketDecorator(flowerBucket2);
//        System.out.println(flowerBucket2.getDescription());
//        System.out.println(flowerBucket2.getPrice());

//        Item flowerBucket3 = new FlowerBucket();
//        ((FlowerBucket) flowerBucket3).addFlower(new RomashkaFlower(40));
//        ((FlowerBucket) flowerBucket3).addFlower(new CactusFlower(26));
//        flowerBucket3 = new RibbonDecorator(flowerBucket3);
//        System.out.println(flowerBucket3.getDescription());
//        System.out.println(flowerBucket3.getPrice());

        Order myOrder = new Order();
        myOrder.addItem(flowerBucket);
//        myOrder.addItem(flowerBucket2);
//        myOrder.addItem(flowerBucket3);
        myOrder.setDeliveryStrategy(new PostDeliveryStrategy());
        myOrder.setPaymentStrategy(new CreditCardPaymentStrategy());
        System.out.println(myOrder.processOrder());


    }
}
