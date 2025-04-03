package Actividad1;

class Client {
 
    public static void main(String[] args) {
        Employee robin = new Employee("Robin", "Smith", 7.5);
        System.out.println("The employee name: " + robin.getLastName() + "," + robin.getFirstName());
        System.out.println("This employee has " + robin.getExperienceInYears() + " years of experience.");
        System.out.println("The employee id: " + robin.getEmpId());
        System.out.println("This employee is a " + robin.getLevel() + " employee.");

        System.out.println("\n*******\n");

        Employee kevin = new Employee("Kevin", "Proctor", 3.2);
        System.out.println("The employee name: " + kevin.getLastName() + "," + kevin.getFirstName());
        System.out.println("This employee has " + kevin.getExperienceInYears() + " years of experience.");
        System.out.println("The employee id: " + kevin.getEmpId());
        System.out.println("This employee is a " + kevin.getLevel() + " employee.");

    }
}
