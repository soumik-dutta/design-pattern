package com.soumik.strategy_pattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private Product product;
    private List<Product> productList;

    public ShoppingCart() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (null != product) {
            if (!productList.contains(product)) {
                System.out.println(" Adding product " + product);
                productList.add(product);
            } else
                System.out.println("Product is already present");
        } else {
            System.out.println("product can't be null");
        }
    }

    public void removeProduct(Product product) {
        if (null != product) {
            if (productList.contains(product)) {
                System.out.println(" Removing product " + product);
                productList.remove(product);
            } else
                System.out.println("Product is not present in your shopping cart");
        } else {
            System.out.println("Product can't be null");
        }
    }

    public int calculateTotal() {
        return productList.stream()
                .reduce(0, (sum, p) -> sum + p.getPrice(), Integer::sum);
    }

    public void pay(Payment paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
