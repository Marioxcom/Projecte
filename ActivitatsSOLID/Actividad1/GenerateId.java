package Actividad1;

import java.util.Random;

public class GenerateId {
    public String generateEmpId(String FirstName) {
        int random = new Random().nextInt(1000);
        String empId = FirstName.substring(0, 1) + random;
        return empId;
    }
}
