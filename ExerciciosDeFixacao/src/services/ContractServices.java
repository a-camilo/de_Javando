package services;

import enttities.Contract;
import enttities.Installments;

import java.util.Calendar;
import java.util.Date;

public class ContractServices {

    private OnlinePaymentService onlinePaymentService;

    public ContractServices(OnlinePaymentService onlinePaymentService){this.onlinePaymentService = onlinePaymentService;}

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i<=3;i++){
            double updateQuota = basicQuota + onlinePaymentService.interest(basicQuota,i);
            double fullQuota = updateQuota + onlinePaymentService.paymentFee(updateQuota);
            Date dueDate = addMonths(contract.getDate(),i);
            contract.getInstallments().add(new Installments(dueDate,fullQuota));
        }
    }

    private Date addMonths(Date date, int N){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,N);
        return calendar.getTime();
    }

}
