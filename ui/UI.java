package Projecte.ui;

import java.util.*;
import Projecte.logic.Inventory;
import Projecte.logic.OrderManager;
import Projecte.model.Client;
import Projecte.model.Wood;

public class UI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        OrderManager orderManager = new OrderManager(inventory);
        Data.loadSampleData(inventory,orderManager);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Inventory Management");
            System.out.println("2. Order Management");
            System.out.println("3. Exit");
            System.out.print("Option: ");
            String option = sc.nextLine();

            switch (option) {
                case "1" -> inventoryMenu(sc, inventory);
                case "2" -> orderMenu(sc, orderManager);
                case "3" -> exit = true;
                default -> System.out.println("Invalid option.");
            }
        }
        System.out.println("Exiting...");
        sc.close();
    }

    private static void inventoryMenu(Scanner sc, Inventory inventory) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- INVENTORY ---");
            System.out.println("1. Show all");
            System.out.println("2. Show one");
            System.out.println("3. Add wood");
            System.out.println("4. Modify wood");
            System.out.println("5. Delete wood");
            System.out.println("6. Back");
            System.out.print("Option: ");
            String op = sc.nextLine();

            switch (op) {
                case "1" -> inventory.showAll();
                case "2" -> {
                    System.out.print("Enter wood ID: ");
                    String id = sc.nextLine();
                    inventory.showOne(id);
                }
                case "3" -> {
                    System.out.print("Type wood: ");
                    String type = sc.nextLine();
                    System.out.print("Shape: ");
                    String shape = sc.nextLine();
                    System.out.print("Height: ");
                    double height = Double.parseDouble(sc.nextLine());
                    System.out.print("Width: ");
                    double width = Double.parseDouble(sc.nextLine());
                    System.out.print("Thick: ");
                    double thick = Double.parseDouble(sc.nextLine());
                    System.out.print("Weight: ");
                    double weight = Double.parseDouble(sc.nextLine());
                    System.out.print("Origin: ");
                    String origin = sc.nextLine();
                    System.out.print("Grade (A-D): ");
                    char grade = sc.nextLine().charAt(0);
                    System.out.print("Varnished? (true/false): ");
                    boolean varnish = Boolean.parseBoolean(sc.nextLine());
                    Wood wood = new Wood(type, shape, height, width, thick, weight, origin, grade, varnish);
                    wood.generateIdRandom();

                    inventory.add(wood.getId(), wood);
                }
                case "4" -> {
                    System.out.print("Enter ID to modify: ");
                    String id = sc.nextLine();
                    System.out.print("Type wood: ");
                    String type = sc.nextLine();
                    System.out.print("Shape: ");
                    String shape = sc.nextLine();
                    System.out.print("Height: ");
                    double height = Double.parseDouble(sc.nextLine());
                    System.out.print("Width: ");
                    double width = Double.parseDouble(sc.nextLine());
                    System.out.print("Thick: ");
                    double thick = Double.parseDouble(sc.nextLine());
                    System.out.print("Weight: ");
                    double weight = Double.parseDouble(sc.nextLine());
                    System.out.print("Origin: ");
                    String origin = sc.nextLine();
                    System.out.print("Grade (A-D): ");
                    char grade = sc.nextLine().charAt(0);
                    System.out.print("Varnished? (true/false): ");
                    boolean varnish = Boolean.parseBoolean(sc.nextLine());
                    Wood updated = new Wood(type, shape, height, width, thick, weight, origin, grade, varnish);


                    inventory.modify(id, updated);
                }
                case "5" -> {
                    System.out.print("Enter wood ID to delete: ");
                    String id = sc.nextLine();
                    inventory.delete(id);
                }
                case "6" -> back = true;
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private static void orderMenu(Scanner sc, OrderManager orderManager) {
        boolean back = false;
        while (!back) {
            System.out.println("\n--- ORDERS ---");
            System.out.println("1. Create order");
            System.out.println("2. Check order status");
            System.out.println("3. View delivered orders");
            System.out.println("4. Cancel active order");
            System.out.println("5. Back");
            System.out.print("Option: ");
            String op = sc.nextLine();

            switch (op) {
                case "1" -> {
                    System.out.print("Enter wood ID: ");
                    String id = sc.nextLine();
                    System.out.print("Company name: ");
                    String name = sc.nextLine();
                    System.out.print("Location: ");
                    String location = sc.nextLine();
                    System.out.print("Delivery time (seconds): ");
                    int time = Integer.parseInt(sc.nextLine());
                    System.out.print("Quantity: ");
                    int quantity = Integer.parseInt(sc.nextLine());
                    Client client = new Client(name, time, location, quantity);
                    orderManager.createOrder(id, client);
                }
                case "2" -> {
                    System.out.print("Enter order ID: ");
                    String id = sc.nextLine();
                    System.out.println(orderManager.showOrderStatus(id));
                }
                case "3" -> orderManager.showDeliveredOrders();
                case "4" -> back = true;
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
