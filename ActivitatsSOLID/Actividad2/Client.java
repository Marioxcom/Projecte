package Actividad2;

import java.util.ArrayList;
import java.util.List;

class Client {

    public static void main(String[] args) {
        List<Student> enrolledStudents = enrollStudents();
        DistinctionDeciderRegistry registry = enrollDecider();


        // Display all results.
        System.out.println("===Results:===");
        for (Student student : enrolledStudents) {
            System.out.println(student);
        }

        System.out.println("===Distinctions:===");

        // Evaluate distinctions.
        for (Student student : enrolledStudents) {
            for (DistinctionDecider decider  : registry.getDeciders()) {
                decider.evaluateDistinction(student);
            }
        }
    }

    private static List<Student> enrollStudents() {
        Student sam = new Student("Sam", "R1", 81.5, "Comp.Sc.");
        Student bob = new Student("Bob", "R2", 72, "Physics");
        Student john = new Student("John", "R3", 71, "History");
        Student kate = new Student("Kate", "R4", 66.5, "English");

        List<Student> students = new ArrayList<Student>();
        students.add(sam);
        students.add(bob);
        students.add(john);
        students.add(kate);
        return students;
    }

    private static DistinctionDeciderRegistry enrollDecider() {
        Arts arts = new Arts();
        Science science = new Science();

        DistinctionDeciderRegistry deciderRegistration = new DistinctionDeciderRegistry();
        deciderRegistration.register(arts);
        deciderRegistration.register(science);
        return deciderRegistration;
    }


}



