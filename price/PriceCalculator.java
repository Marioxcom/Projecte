package Projecte.price;

public class PriceCalculator {
    private final Client client;
    private final Wood wood;

    public PriceCalculator(Client client, Wood wood) {
        this.client = client;
        this.wood = wood;
    }

    public double finalPrice() {
        return Math.round((wood.getWeight() * wood.getKgPrice() * client.getAmount()) * 100.0) / 100.0;
    }
}
