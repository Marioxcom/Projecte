package Projecte.price;
import Projecte.model.Client;
import Projecte.model.Wood;

public interface PriceStrategy {
    double calculatePrice(Client client, Wood wood);
}
