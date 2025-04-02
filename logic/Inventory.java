package Projecte.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    HashMap<String,Wood> inventory;

    public Inventory() {
        this.inventory = new HashMap<>();
    }

    public Wood getWoodById(String id) {
        return inventory.get(id);
    }

    public void add(String id, Wood wood) {
        if (inventory.containsKey(id)) {
            System.out.println("The ID already exists");
        } else {
            inventory.put(id, wood);
        }
    }

    public void delete(String id) {
        inventory.remove(id);
    }

    public void modify(String id, Wood wood) {
        if (inventory.containsKey(id)) {
            inventory.replace(id, wood);
        } else {
            System.out.println("ID not found: " + id);
        }
    }

    public void showAll() {
        List<Map.Entry<String, Wood>> list = new ArrayList<>(inventory.entrySet());
        list.sort(Map.Entry.comparingByKey());
        for (Map.Entry<String, Wood> orderedList : list) {
            System.out.println(orderedList);
        }
    }

    public void showOne(String id) {
        if (inventory.containsKey(id)) {
            System.out.println(inventory.get(id));
        } else {
            System.out.println("ID not found: " + id);
        }
    }
}
