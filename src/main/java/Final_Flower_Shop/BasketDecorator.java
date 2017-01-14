package Final_Flower_Shop;


public class BasketDecorator extends ItemDecorator{
    public BasketDecorator(Item item){
        super(item);
    }
    public double getPrice(){
        return (4 + item.getPrice());
    }
    public String getDescription(){
        return item.getDescription() + " in basket";
    }

}