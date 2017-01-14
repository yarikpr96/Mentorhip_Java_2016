package CoolTasks_1.Shop;


import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Provider provider = new Provider();
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        int g = 0;
        do {
            if (g == 1) {
                shop.provider.addProductProvider();
            }
            if (g == 2) {
                shop.provider.addProductHend();
            }
            if (g == 3) {
                shop.provider.allProductProvider();
            }
            if (g == 4) {
                shop.addProduct();
            }
            if (g == 5) {
                shop.dellProduct();
            }
            if (g == 6) {
                shop.allProduct();
            }
            if (g == 7) {
                shop.changeNameProduct();
            }
            if (g == 8) {
                shop.changeNumberProduct();
            }
            if (g == 9) {
                shop.changePriceProduct();
            }
            if (g == 10) {
                shop.transferProduct();
            }
            if (g == 11) {
                shop.takeOrder();
            }
            if (g == 12) {
                shop.removeDish();
            }
            if (g == 13) {
                shop.allOrder();
                shop.count();
            }
            if (g == 14) {
                System.exit(0);
            }

            System.out.println("*******************************************");
            System.out.println("Enter 1, add menu product in provider");
            System.out.println("Enter 2, add  product in provider");
            System.out.println("Enter 3, to see all product in provider");
            System.out.println("*******************************************");
            System.out.println("Enter 4, add  product in shop");
            System.out.println("Enter 5, remove  product in shop");
            System.out.println("Enter 6, to see all product");
            System.out.println("Enter 7, change name product in shop");
            System.out.println("Enter 8, change number product in shop");
            System.out.println("Enter 9, change price product in shop");
            System.out.println("Enter 10, to bring the products to the shop");
            System.out.println("*******************************************");
            System.out.println("Enter 11 to take order");
            System.out.println("Enter 12 to remove dish");
            System.out.println("Enter 13 to see order");
            System.out.println("*******************************************");
            System.out.println("Enter 14 to Exit ");
            System.out.println("*******************************************");
            shop.endProduct();
            g = scanner.nextInt();
        }

        while (isTrue);
    }
}

        
        
        
        
    