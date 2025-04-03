package Actividad4;

import java.util.ArrayList;
import java.util.List;

public class ShowHelper {
    PaymentManager paymentManager;

    public ShowHelper(PaymentManager paymentManager) {
        this.paymentManager = paymentManager;
    }

    public void showPreviousPayments() {
        for (Object helper : paymentManager.getPayments()) {
            if(helper instanceof PreviousPayment){
                ((PreviousPayment)helper).previousPaymentInfo();
            }
            System.out.println("------");
        }
    }

    public void processNewPayments() {
        for (Object helper : paymentManager.getPayments()) {
            if (helper instanceof NewPayment) {
                ((NewPayment) helper).newPayment();
            }
            System.out.println("------");
        }
    }
}