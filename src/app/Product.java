package app;

public class Product {
    String name;
    int quota;
    double price;

    public Product(String name, int quota, double price) {
        this.name = name;
        this.quota = quota;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuota() {
        return quota;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Product %s, quota is %d %s, price is %s %.2f.", name, quota, Constants.MEASURE,
                Constants.CURRENCY, price );
    }
}

