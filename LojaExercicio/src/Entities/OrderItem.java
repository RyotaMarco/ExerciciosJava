package Entities;
import Entities.Product;
import java.util.ArrayList;
import java.util.List;

public class OrderItem {

    public Product getProduct() {
        return product;
    }

    public OrderItem(Product product, Integer quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private Double subTotal;

    private Product product;
    private Integer quantity;
    private double price;

    public Double subTotal(){
        return  price * quantity;

    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = price * quantity;
    }

    public OrderItem(){

    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;}


    public String toString() {
        return  getProduct().getProductName() +", $" +  String.format("%.2f",price) + ", Quantity:" +  quantity + ", Subtotal: $" + String.format("%.2f",subTotal()) ;
    }
}



