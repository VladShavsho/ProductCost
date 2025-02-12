package app;

public class CalcCostDelivery extends CalcCostBase{
    private final static double DELIVERPRISE = 12.0;

    public static double getDeliveryPrise() {
        return DELIVERPRISE;
    }

    public double calsCost (Product product){
        return product.getQuota() + product.getPrice() + getDeliveryPrise();
    }
}
