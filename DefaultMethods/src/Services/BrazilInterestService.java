package Services;


public class BrazilInterestService implements InterstService {

    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public double getInterestRate() {
        return interestRate;
    }
}


