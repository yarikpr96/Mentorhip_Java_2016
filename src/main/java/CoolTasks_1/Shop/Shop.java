package CoolTasks_1.Shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Shop {
    Product product;
    Provider provider = new Provider();
    Set<Product> productSet = new HashSet<Product>();
    Set<Product> productSetCustomer = new HashSet<Product>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public void addProduct() throws IOException {
        System.out.println("Enter name of product");
        String name = reader.readLine();
        System.out.println("Enter number of products");
        String n = reader.readLine();
        int number = Integer.parseInt(n);
        System.out.println("Enter price of product");
        String p = reader.readLine();
        int price = Integer.parseInt(p);
        productSet.add(new Product(name, number, price));
        System.out.println("Product added");
    }

    public void dellProduct() throws IOException {
        System.out.println("Enter name of product");
        String name = reader.readLine();
        Iterator<Product> iterr = productSet.iterator();
        while (iterr.hasNext()) {
            if (iterr.next().getNameProduct().equals(name)) {
                iterr.remove();
                System.out.println("Product remove");
            }
        }
    }

    public void endProduct() {
        for (Product product : productSet) {
            if (product.getNumberOfProducts() <= 0) {
                System.out.println(product + " end");
            }
        }
    }

    public void allProduct() {
        for (Product product : productSet) {
            System.out.println(product);
        }
    }

    public void transferProduct() throws IOException {
        System.out.println("Enter name of product ");
        String name = reader.readLine();
        System.out.println("Enter number of products");
        String n = reader.readLine();
        int number = Integer.parseInt(n);
        System.out.println("Enter price of product");
        String p = reader.readLine();
        int price = Integer.parseInt(p);
        for (Product product : provider.productSetProvider) {
            if (product.getNameProduct().equals(name)) {
                productSet.add(new Product(name, number, price));
                product.setNumberOfProducts(product.getNumberOfProducts() - number);
                System.out.println("Product transfer ");
            }
        }
    }

    public void changeNameProduct() throws IOException {
        System.out.println("Enter name of product");
        String name = reader.readLine();
        for (Product product : productSet) {
            if (product.getNameProduct().equals(name)) {
                System.out.println("Enter New name");
                String newName = reader.readLine();
                product.setNameProduct(newName);
                System.out.println("name change ");
            }
        }
    }

    public void changeNumberProduct() throws IOException {
        System.out.println("Enter name of product");
        String name = reader.readLine();
        for (Product product : productSet) {
            if (product.getNameProduct().equals(name)) {
                System.out.println("Enter number of product");
                String n = reader.readLine();
                int number = Integer.parseInt(n);
                product.setNumberOfProducts(number);
                System.out.println("number change ");
            }
        }
    }

    public void changePriceProduct() throws IOException {
        System.out.println("Enter name of product");
        String name = reader.readLine();
        for (Product product : productSet) {
            if (product.getNameProduct().equals(name)) {
                System.out.println("Enter price of product");
                String n = reader.readLine();
                int price = Integer.parseInt(n);
                product.setPrice(price);
                System.out.println("price change ");
            }
        }
    }

    public void takeOrder() throws IOException {
        System.out.println("Enter name of product");
        String name = reader.readLine();
        System.out.println("Enter number of products");
        String n = reader.readLine();
        int number = Integer.parseInt(n);
        int price = 0;
        for (Product product : productSet) {
            if (product.getNameProduct().equals(name)) {
                if (product.getNumberOfProducts() >= number) {
                    productSetCustomer.add(new Product(name, number, price = number * product.getPrice()));
                    product.setNumberOfProducts(product.getNumberOfProducts() - number);
                    System.out.println("Order added");
                }else if (product.getNumberOfProducts() <= number){
                    System.out.println("No certain amount of food ");
                }
            }
        }
    }

    public void allOrder() {
        for (Product product : productSetCustomer) {
            System.out.println(product);
        }
    }

    public void removeDish() throws IOException {
        System.out.println("Enter name of product");
        String name = reader.readLine();
        Iterator<Product> iter = productSetCustomer.iterator();
        while (iter.hasNext()) {
            if (iter.next().getNameProduct().equals(name)) {
                iter.remove();
                System.out.println("Dish remove");
            }
        }
    }

    public void count() {
        int sum = 0;
        for (Product product : productSetCustomer) {
            sum += product.getNumberOfProducts();
        }
    }
}
