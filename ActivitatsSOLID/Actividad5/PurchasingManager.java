public class PurchasingManager implements SendOrders{
    Client client = new Client();
    PriceCalculator priceCalculator = new PriceCalculator();
    @Override
    public void sendMessaje() {
        System.out.println(client.getCompanyName() + " has an order for " + client.getUbication() + " worth " + priceCalculator.finalPrice() + ".");
    }

    @Override
    public void sendTime() {
        System.out.println(client.getCompanyName() + " order has " + );
    }
}
