package Final_Flower_Shop;


public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        return (13 + item.getPrice());
    }

    public String getDescription() {
        return item.getDescription() + " in paper wrap";
    }
}