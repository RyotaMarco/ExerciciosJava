package Entities;

public class Product {
    private String productName;

    private double price;

    public String getProductName() {
        return productName;
    }

    public Product(String name, double price) {
        this.productName = name;
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double total(){
        return price =+price;
    }

    @Override
    public String toString() {
        return  productName;
    }
}




