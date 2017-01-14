package Final_Flower_Shop;


public abstract class ItemDecorator implements Item {
    protected Item item;
    public ItemDecorator(Item item){
        this.item = item;
    }


}