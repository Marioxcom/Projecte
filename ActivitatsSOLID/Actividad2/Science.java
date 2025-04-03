package Actividad2;

import java.util.Arrays;
import java.util.List;

public class Science implements DistinctionDecider{
    List<String> science = Arrays.asList("Comp.Sc.", "Physics");

    @Override
    public void evaluateDistinction(Student student) {
        if (science.contains(student.department)) {
            if (student.score > 80) {
                System.out.println(student.regNumber + " has received a distinction in science.");
            }
        }
    }
}
