package org.example;

class User {
    private static int counterId = 0;
    private final int id;
    private final String login;
    private final String password;
    private final Basket basket;

    User(String login, String password){
        counterId++;
        this.id = counterId;
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    int getId() {
        return id;
    }

    String getLogin() {
        return login;
    }

    public Basket getBasket() {
        return basket;
    }

    @Override
    public String toString() {
        return "User {" +
                "id = '" + id + "', " +
                "login = '" + login + "', " +
                "корзина = '" + basket + '\'' +
                '}';
    }
}