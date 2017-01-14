package Final_Flower_Shop;

public enum FlowerType {
    ROSE, TULIP, CACTUS, ROMASHKA;

    @Override
    public String toString() {
        switch (this) {
            case ROSE:
                return "Rose";
            case TULIP:
                return "Tulip";
            case ROMASHKA:
                return "Romashka";
            case CACTUS:
                return "Cactus";
            default:
                return "No type";
        }
    }
}