package CoolTasks_1.Shop;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Provider {
    Product product;
    Set<Product> productSetProvider = new HashSet<Product>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void addProductProvider() {
        productSetProvider.add(new Product("Potato", 1000, 5));
        productSetProvider.add(new Product("Onion", 1000, 8));
        productSetProvider.add(new Product("Cucumber", 1000, 6));
        productSetProvider.add(new Product("Tomatoes", 1000, 10));
        productSetProvider.add(new Product("Pork", 1000, 70));
        productSetProvider.add(new Product("Beef", 1000, 90));
        productSetProvider.add(new Product("Chicken", 1000, 60));
        productSetProvider.add(new Product("Hake", 1000, 50));
        productSetProvider.add(new Product("Perch", 1000, 65));
        productSetProvider.add(new Product("Cabbage", 1000, 8));
        productSetProvider.add(new Product("white Bread", 1000, 10));
        productSetProvider.add(new Product("Rye bread", 1000, 11));
        productSetProvider.add(new Product("Milk", 1000, 10));
        productSetProvider.add(new Product("Butter", 1000, 20));
        System.out.println("Product added");
    }
    public void addProductHend() throws IOException {
        System.out.println("Enter  name of product");
        String name = reader.readLine();
        System.out.println("Enter number of products");
        String n = reader.readLine();
        int number = Integer.parseInt(n);
        System.out.println("Enter price of product");
        String p = reader.readLine();
        int price = Integer.parseInt(p);
        productSetProvider.add(new Product(name, number, price));
        System.out.println("Product added");
    }
    public void allProductProvider(){
        for (Product product : productSetProvider){
            System.out.println(product);
        }
    }

}
