package Entities;

public class ImportedProduct extends Product {

    public ImportedProduct(){

    }

    private double customsFee;

    @Override
    public String priceTag(){
        return super.getName()+ " $" + totalPrice() + "(Customs fee: $" + getCustomsFee() + ")";
    }

    public Double totalPrice(){
        return getPrice() + customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, Double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }
}
