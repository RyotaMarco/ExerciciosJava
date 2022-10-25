package Service;

import Entities.Contract;
import Entities.Installment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(Contract contract, int installments, OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {

        double installmentAmount = contract.getTotalValue() / months;



        LocalDate finalDate = null;
        for (int i = 1; i <= months; i++) {
            finalDate = contract.getDate().plusMonths(i);
            double valueInterest = onlinePaymentService.interest(installmentAmount, i);
            double valueFee = onlinePaymentService.paymentFee(valueInterest);
            double total = valueFee + valueInterest;

            contract.getInstallments().add(new Installment(finalDate, total));
        }



    }
}