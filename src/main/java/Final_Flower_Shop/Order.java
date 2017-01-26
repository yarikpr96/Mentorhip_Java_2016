package Final_Flower_Shop;


import java.util.LinkedList;
import java.util.List;

public class Order  {
    private List<Item> items = new LinkedList<>();
    private IPayment payment;
    private IDelivery delivery;

    public IPayment getPaymentStrategy() {
        return payment;
    }

    public List<Item> getItems() {
        return items;
    }

    public IDelivery getDeliveryStrategy() {
        return delivery;
    }

    public void setPaymentStrategy(IPayment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(IDelivery delivery) {
        this.delivery = delivery;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        double price = items.stream().map(Item::getPrice).reduce((x, y) -> x + y).get();
        return price;
    }

    public String processOrder() {
        double price = calculateTotalPrice();
        return "Payment successful"+" "+price ;

    }


}
