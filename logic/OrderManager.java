package Projecte.logic;

import Projecte.model.Client;
import Projecte.model.Wood;
import Projecte.price.DefaultPriceCalculator;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    private final Inventory inventory;
    private final Map<String, PurchasingManager> deliveredOrders = new HashMap<>();
    private final Map<String, PurchasingManager> activeOrders;

    public OrderManager(Inventory inventory) {
        this.inventory = inventory;
        this.activeOrders = new HashMap<>();
    }

    public boolean createOrder(String woodId, Client client) {
        Wood wood = inventory.getWoodById(woodId);

        if (wood == null) {
            System.out.println("That product does not exist in the inventory.");
            return false;
        }

        client.setWood(wood);

        inventory.delete(woodId);

        PurchasingManager manager = new PurchasingManager(client, new DefaultPriceCalculator());
        activeOrders.put(woodId, manager);

        System.out.println("Order created:");
        System.out.println(manager.sendMessage());
        return true;
    }

    public String showOrderStatus(String woodId) {
        PurchasingManager manager = activeOrders.get(woodId);

        if (manager == null) {
            return deliveredOrders.containsKey(woodId)
                    ? "Order with ID " + woodId + " has already been delivered."
                    : "There is no active order with that ID.";
        }

        if (manager.isDelivered()) {
            deliveredOrders.put(woodId, manager);
            activeOrders.remove(woodId);
            return "Order with ID " + woodId + " has just been delivered.";
        }
        return manager.sendTime();
    }

    public void showDeliveredOrders() {
        if (deliveredOrders.isEmpty()) {
            System.out.println("No delivered orders yet.");
        } else {
            for (Map.Entry<String, PurchasingManager> entry : deliveredOrders.entrySet()) {
                System.out.println("Delivered: " + entry.getKey() + " - > " + entry.getValue().sendMessage());
            }
        }
    }

}

