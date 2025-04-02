package Projecte.model;

public class Client {
    private String companyName;
    private String ubication;
    private int amount;
    private long time;
    Wood wood;

    public Client() {
    }

    public Client(String companyName, long time, String ubication, int amount) {
        this.companyName = companyName;
        this.ubication = ubication;
        this.amount = amount;
        this.time = time;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Wood getWood() {
        return wood;
    }

    public void setWood(Wood wood) {
        this.wood = wood;
    }
}
