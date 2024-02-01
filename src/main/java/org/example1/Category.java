package org.example1;

import java.util.HashMap;
import java.util.Map;

class Category {
    private static int counterId = 0;
    private final int id;
    private final String name;
    private Map<Integer, Product> products = new HashMap<>();

    /**
     * @apiNote Конструктор пустой категории
     * @param name Имя категории
     */
    Category(String name){
        counterId++;
        this.id = counterId;
        this.name = name;
    }

    /**
     * @apiNote Конструктор категории с наполнением
     * @param name Имя категории
     * @param products Словарь добавляемых в категорию товаров
     */
    Category(String name, Map<Integer, Product> products){
        counterId++;
        this.id = counterId;
        this.name = name;
        this.products = products;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    Map<Integer, Product> getProducts() {
        return products;
    }

    Product getProduct(int productId) {
        return products.get(productId);
    }

    void putInCategory(int productId, Product product) {
        products.put(productId, product);
    }

    void removeFromCategory(int productId) {
        products.remove(productId);
    }

    /**
     * @apiNote Стрингификатор категории и товаров
     * @return Объект в виде текстовой строки
     */
    @Override
    public String toString() {
        StringBuilder message = new StringBuilder();
        String messageAboutCategory = "Категория {" +
                "id = '" + id + "', " +
                "название = '" + this.name + '\'' +
                "}\n";
        message.append(messageAboutCategory);
        for(Map.Entry<Integer, Product> item : this.products.entrySet()) {
            message.append(item.getValue());
            message.append("\n");
        }

        return message.toString();
    }

}