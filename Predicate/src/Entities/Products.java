package Entities;


public class Products {

    private String name;

    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public Products(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", " + price ;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}





