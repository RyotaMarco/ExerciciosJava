package Entities;

public class Entities {


    private String name;

    private double price;

    private int quantity;

    public Entities(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }



    public double totalValueInStock(){
        return quantity * price;
    }

    public void addProduct(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name + ", $ " + String.format("%.2f",price) +  ", "  + quantity + " units, Total: $ " + String.format("%.2f",totalValueInStock());

    }
}
