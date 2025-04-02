package Projecte.model;

import java.util.Random;

public class Wood implements IdGenerate{
    private String id;
    private String typeWood;
    private String shape;
    private double height;
    private double width;
    private double thick;
    private double weight;
    private double kgPrice;
    private String origin;
    private char quality;
    private boolean varnished;

    public Wood() {
    }

    public Wood(String typeWood, String shape, double height, double width, double thick, double weight, String origin, char quality, boolean varnished) {
        this.id = id;
        this.typeWood = typeWood;
        this.shape = shape;
        this.height = height;
        this.width = width;
        this.thick = thick;
        this.weight = weight;
        this.kgPrice = 4.99;
        this.origin = origin;
        this.quality = quality;
        this.varnished = varnished;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public char getQuality() {
        return quality;
    }

    public void setQuality(char quality) {
        this.quality = quality;
    }

    public boolean isVarnished() {
        return varnished;
    }

    public void setVarnished(boolean varnished) {
        this.varnished = varnished;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getThick() {
        return thick;
    }

    public void setThick(double thick) {
        this.thick = thick;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getTypeWood() {
        return typeWood;
    }

    public void setTypeWood(String typeWood) {
        this.typeWood = typeWood;
    }

    public double getKgPrice() {
        return kgPrice;
    }

    public void setKgPrice(double kgPrice) {
        this.kgPrice = kgPrice;
    }

    @Override
    public void generateIdRandom() {
        Random random = new Random();
        int numberRandom = random.nextInt(NUMBER);
        char letter1 = typeWood.toUpperCase().charAt(0);
        char letter2 = typeWood.toUpperCase().charAt(1);
        StringBuilder sb = new StringBuilder();
        sb.append(letter1);
        sb.append(letter2);
        sb.append(numberRandom);
        String generate = sb.toString();
        setId(generate);
        System.out.println(generate);
    }

    public void showDimensions() {
        System.out.println(getHeight() + " mm, " + getWidth() + " mm, " + getThick() + " mm.");
    }

    @Override
    public String toString() {
        return "Wood [ID=" + id + ", type=" + typeWood + ", weight=" + weight + ", price/kg=" + kgPrice + "]";
    }
}
