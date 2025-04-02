package Projecte.price;

import Projecte.model.Client;
import Projecte.model.Wood;

public class DefaultPriceCalculator implements PriceStrategy{

    @Override
    public double calculatePrice(Client client, Wood wood) {
        return Math.round((wood.getWeight() * wood.getKgPrice() * client.getAmount()) * 100.0) / 100.0;
    }
}