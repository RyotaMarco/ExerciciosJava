package Services;



public class UsaInterestService implements InterstService{


    private double interestRate;
    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public double getInterestRate() {
        return interestRate;
    }
}


