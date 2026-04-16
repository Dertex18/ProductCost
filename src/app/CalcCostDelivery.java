package app;

public class CalcCostDelivery  extends CalcCostBase {

    private final static double deliveryPrice = 49.99;

    @Override
    public double calcCost(Product product) {
        return product.getQuota() * product.getPrice()
                + deliveryPrice;
    }
}
