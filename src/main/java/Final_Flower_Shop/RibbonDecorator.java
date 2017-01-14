package Final_Flower_Shop;


public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return (40 + item.getPrice());
    }

    public String getDescription() {
        return item.getDescription() + " in ribbon wrap";
    }
}
