package org.example1;

class Product {

    private static int counterId = 0;
    private final int id;
    private final String name;
    private final double price;
    private int rating;
    private int count;


    Product(String name, int price, int count) {
        counterId++;
        this.id = counterId;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public static int getCounterId() {
        return counterId;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double  getPrice() {
        return price;
    }

    int getRating() {
        return rating;
    }

    int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Продукт {" +
                "id = '" + this.id + "', " +
                "название = '" + this.name + "', " +
                "цена = '" + this.price + "', " +
                "рейтинг = '" + this.rating + "', " +
                "количество = '" + this.count + '\'' +
                '}';
    }

    void saleProduct(int count) {
        this.rating++;
        this.count -= count;
    }

}