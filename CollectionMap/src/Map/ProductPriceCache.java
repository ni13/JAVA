package Map;

import java.util.HashMap;

public class ProductPriceCache {
    public static void main(String[] args) {
        HashMap<Integer, Double> productPrices = new HashMap<>();
        productPrices.put(101, 19.99);
        productPrices.put(102, 29.49);
        productPrices.put(103, 5.75);

        int productId = 102;
        System.out.println("Price for Product " + productId + ": $" + productPrices.get(productId));
    }
}
