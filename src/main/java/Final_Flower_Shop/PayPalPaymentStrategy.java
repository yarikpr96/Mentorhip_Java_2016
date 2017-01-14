package Final_Flower_Shop;

public class PayPalPaymentStrategy implements IPayment {

    @Override
    public void pay(double price) {
        System.out.println("Оплачено"+price);
    }
}
