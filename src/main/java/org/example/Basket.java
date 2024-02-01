package org.example;

import java.util.HashMap;
import java.util.Map;

class Basket {
    private static int counterId = 0;
    private final int id;
    private final Map<Integer, Integer> purchasedProducts = new HashMap<>();

    Basket(){
        counterId++;
        this.id = counterId;
    }

    int getId() {
        return id;
    }

    Map<Integer, Integer> getProducts() {
        return purchasedProducts;
    }

    void putInBasket(int productId, int count) {
        purchasedProducts.put(productId, count);
    }

    @Override
    public String toString() {
        return "Корзина {" +
                "id = '" + id + "', " +
                "куплены товары с id = '" + purchasedProducts + '\'' +
                '}';
    }
}
