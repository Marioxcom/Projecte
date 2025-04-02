package Projecte.ui;


import Projecte.logic.Inventory;
import Projecte.logic.OrderManager;
import Projecte.model.Client;
import Projecte.model.Wood;

public class Data {
    public static void loadSampleData(Inventory inventory, OrderManager orderManager) {

        Wood w1 = new Wood("Oak", "Plank", 2000, 100, 50, 12.5, "Spain", 'A', true);
        w1.generateIdRandom();
        inventory.add(w1.getId(), w1);

        Wood w2 = new Wood("Pine", "Beam", 1500, 80, 40, 10.0, "Sweden", 'B', true);
        w2.generateIdRandom();
        inventory.add(w2.getId(), w2);

        Client c1 = new Client("WoodCorp", 600, "Madrid", 3);
        orderManager.createOrder(w1.getId(), c1);

        Client c2 = new Client("PineWorld", 250, "Barcelona", 2); // 0 para que esté entregado ya
        orderManager.createOrder(w2.getId(), c2);
    }
}
