package app;

public class Product {
    private String name;
    private int quota;
    private double price;

    public Product(String name, int quota, double price){
        this.name = name;
        this.price = price;
        this.quota = quota;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuota() {
        return quota;
    }

    @Override
    public String toString(){
        return "Product: " + name +
                ", quota is " + quota + " " +
                Constants.MEASURE +
                ", price is " + Constants.CURRENCY + " " +
                price + ".";
    }
}
