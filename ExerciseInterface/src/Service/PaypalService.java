package Service;


public class PaypalService implements OnlinePaymentService{

    public Double paymentFee(Double amount){
        return amount * 0.02;
    }

    public Double interest(Double amount, Integer months) {
       return amount + (amount * months) * 0.01;
    }
}
