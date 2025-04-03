package Actividad4;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {

    private List<Object> payments = new ArrayList<>();

    public void loadUsers() {
        List<Object> users = ListUsers.endollUsers();
        for (Object user : users) {
            if (user instanceof NewPayment || user instanceof PreviousPayment) {
                payments.add(user);
            }
        }
    }

    public List<Object> getPayments() {
        return payments;
    }
}
