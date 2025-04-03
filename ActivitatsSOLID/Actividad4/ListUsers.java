package Actividad4;

import java.util.ArrayList;
import java.util.List;

public class ListUsers {
    public static List<Object> endollUsers() {
        List<Object> users = new ArrayList<>();
        users.add(new GuestUserPayment()); // Implementa NewPayment
        users.add(new RegisteredUserPayment("Oscar")); // Implementa ambos
        users.add(new RegisteredUserPayment("Laura"));
        return users;
    }
}
