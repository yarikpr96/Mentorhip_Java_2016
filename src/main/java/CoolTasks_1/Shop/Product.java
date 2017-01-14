package CoolTasks_1.Shop;


public class Product {
    private String nameProduct;
    private int numberOfProducts;
    private int price;

    public Product(String nameProduct, int numberOfProducts, int price) {
        this.nameProduct = nameProduct;
        this.numberOfProducts = numberOfProducts;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", numberOfProducts=" + numberOfProducts +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (getNumberOfProducts() != product.getNumberOfProducts()) return false;
        if (getPrice() != product.getPrice()) return false;
        return getNameProduct() != null ? getNameProduct().equals(product.getNameProduct()) : product.getNameProduct() == null;

    }

    @Override
    public int hashCode() {
        int result = getNameProduct() != null ? getNameProduct().hashCode() : 0;
        result = 31 * result + getNumberOfProducts();
        result = 31 * result + getPrice();
        return result;
    }
}
