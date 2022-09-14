package Entities;

public class Entities {

    public String amount;

    public double price;

    public double dolar;

    public double reais() {
        return  (price * dolar * 6/100) + price * dolar;
    }
    public String toString(){ return "Amount to be pain in reais = " + reais();}
}

