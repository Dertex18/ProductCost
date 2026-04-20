package app;

public class CalcCostDelivery extends CalcCostBase {

    private final static double DELIVERY_PRICE = 49.99;

    @Override
    public double calcCost(Product product) {
        return super.calcCost(product) + DELIVERY_PRICE;
    }
}
