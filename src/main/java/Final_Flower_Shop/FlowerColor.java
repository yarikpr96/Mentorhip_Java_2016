package Final_Flower_Shop;

public enum FlowerColor {
    RED,  WHITE,  YELLOW;

    @Override
    public String toString() {
        switch (this) {
            case RED:
                return "Red";

            case WHITE:
                return "White";

            case YELLOW:
                return "Yellow";

            default:
                return "No color";
        }
    }

}