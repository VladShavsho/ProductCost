package app;

public class CalcCostBase {
    public double calsCost(Product product){
        return product.getQuota() * product.getPrice();
    }

}
