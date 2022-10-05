package cp_10_09;

import java.util.Scanner;

public class Product {

    private String name;
    private double price;
    private int count;

    public Product(String code, double price, int count) {
        this.name = code;
        this.price = price;
        this.count = count;
    }
    public void addInventory(int amt) {
        this.count += amt;
    }
    public void sellInventory(int amt) {
        this.count -= amt;
    }


    // getters
    public String getCode() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getCount() {
        return count;
    }

    // setters
    public void setCode(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setCount(int count) {
        this.count = count;
    }


    // main
    public static void main(String args[]) {
        //Uncomment statement lines below once you've added the missing fields, constructors and methods
        String name = "Apple";
        double price = 0.40;
        int num = 3;
        Product prod = new Product(name, price, num);

        // Test 1 - Are instance variables set/returned properly?
        System.out.println("Name: " + prod.getCode());
        System.out.printf("Price: %.2f\n", prod.getPrice());
        System.out.println("Count: " + prod.getCount());
        System.out.println();

        // Test 2 - Are instance variables set/returned properly after adding and selling?
        num = 10;
        prod.addInventory(num);
        num = 5;
        prod.sellInventory(num);
        System.out.println("Name: " + prod.getCode());
        System.out.printf("Price: %.2f\n", prod.getPrice());
        System.out.println("Count: " + prod.getCount());
        System.out.println();

        // Test 3 - Do setters work properly?
        name = "Golden Delicious";
        prod.setCode(name);
        price = 0.55;
        prod.setPrice(price);
        num = 4;
        prod.setCount(num);
        System.out.println("Name: " + prod.getCode());
        System.out.printf("Price: %.2f\n", prod.getPrice());
        System.out.println("Count: " + prod.getCount());
    }
}
