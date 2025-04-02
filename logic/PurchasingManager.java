package Projecte.logic;

public class PurchasingManager implements SendOrders{
    private final Client client;
    private final TimeOrder to;
    private final PriceStrategy priceStrategy;

    public PurchasingManager(Client client, PriceStrategy strategy) {
        this.client = client;
        this.to = new TimeOrder(client.getTime());
        this.priceStrategy = strategy;
    }

    @Override
    public String sendMessage() {
        double finalPrice = priceStrategy.calculatePrice(client, client.getWood());
        return client.getCompanyName() + " has an order for " + client.getUbication() + " worth " + finalPrice + ".";
    }

    @Override
    public String sendTime() {
        if (to.isExpired()) {
            return "¡Package sent!";
        } else {
            return client.getCompanyName() + " order has " + to.remainingTime() + " hours remaining.";
        }
    }

    public boolean isDelivered() {
        return to.isExpired();
    }
}
