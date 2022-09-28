package Entities;

public class IndividualTax extends GeneralTax {

    public IndividualTax(){

    }

    private Double HealthXp;

    public Double getHealthXp() {
        return HealthXp;
    }

    public void setHealthXp(Double healthXp) {
        HealthXp = healthXp;
    }

    public IndividualTax(String name, Double anualIncome, Double healthXp) {
        super(name, anualIncome);
        HealthXp = healthXp;
    }
    @Override
    public double paid(){
        if (getAnualIncome()<20000){
            return getAnualIncome() * 0.15 - getHealthXp() * 0.50;
        }else{
            return getAnualIncome() * 0.25 - getHealthXp() * 0.50;
        }
    }
}
