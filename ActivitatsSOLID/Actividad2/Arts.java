package Activitats2;

import java.util.Arrays;
import java.util.List;

public class Arts implements DistinctionDecider{
    List<String> arts = Arrays.asList("History", "English");

    @Override
    public void evaluateDistinction(Student student) {

        if (arts.contains(student.department)) {
            if (student.score > 70) {
                System.out.println(student.regNumber + " has received a distinction in arts.");
            }
        }
    }
}
