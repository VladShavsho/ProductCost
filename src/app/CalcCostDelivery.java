package app;

public class CalcCostDelivery extends CalcCostBase{
    private final static double deliveryPrise = 12.0;

    public static double getDeliveryPrise() {
        return deliveryPrise;
    }

    public double calsCost (Product product){
        return product.getQuota() + product.getPrice() + getDeliveryPrise();
    }
}
