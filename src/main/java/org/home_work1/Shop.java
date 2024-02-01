package org.home_work1;


import java.util.HashMap;
import java.util.Map;

public class Shop {
    private final Category[] categories;
    private final Map<String, User> users;

    Shop() {
        this.categories = new Category[2];
        this.users = new HashMap<>();

        //Инициализация товаров и категорий

        Category categoryOils = new Category("Масла");
        Product[] oils = new Product [] {
                new Product("Подсолнечное масло", 90, 123),
                new Product("Оливковое масло", 110, 64),
                new Product("Облепиховое масло", 210, 2)
        };
        for (Product oil: oils) {
            categoryOils.putInCategory(oil.getId(), oil);
        }

        Category categoryGuns = new Category("Пушки");
        Product[] guns = new Product [] {
                new Product("Kolossal", 100500, 1),
                new Product("Царь-пушка", 200500, 1),
                new Product("Dicke Bertha", 14888, 2),
                new Product("QF 6 pounder", 1000, 14111),
                new Product("M1 76 мм", 1200, 11411)
        };
        for (Product gun: guns) {
            categoryGuns.putInCategory(gun.getId(), gun);
        }

        categories[0] = categoryOils;
        categories[1] = categoryGuns;

        //Регистрация пользователей
        users.put("Иван", new User ("Иван", "KOSTROMA_MON_AMOUR"));
        users.put("Hans", new User("Hans", "BERliner_ist_ein_Donut"));
        users.put("John", new User("John", "ThereIsNothingInArea51"));
        users.put("Tommy", new User("Tommy", "HerMajestyShipNotShit"));
    }

    void trade(){
        //Показ состояния магазина
        printShop();

        //Торги
        System.out.println("Продано:");
        this.saleProduct("Иван", 5, 2);
        this.saleProduct("Hans", 4, 1);
        this.saleProduct("Hans", 6, 1);
        this.saleProduct("Иван", 6, 1);
        this.saleProduct("John", 7, 7777);
        this.saleProduct("John", 13, 100);
        this.saleProduct("Tommy", 8, 3333);
        System.out.println("______________________________________________________________\n");

        //Показ состояния магазина
        printShop();
    }

    void printShop() {
        System.out.println("Магазин:");
        for (Category category : this.categories) {
            System.out.println(category);
        }
        System.out.println("______________________________________________________________\n");
    }

    void saleProduct(String userName, int productId, int count) {
        Product product = this.getProduct(productId);
        System.out.print(userName +
                        " пробовал купить товар с id = " + productId +
                        " в количестве " + count + " штук. "
                );
        if (product == null) {
            System.out.println("Но продукт не существует. Пока что.");
        } else if (product.getCount() < count) {
            System.out.println("Но такого количества '" + product.getName() + "' в магазине нет. Пока что.");
        } else {
            this.users.get(userName).getBasket().putInBasket(productId, count);
            product.saleProduct(count);
            System.out.println("И купил " + count + " '" + product.getName() + "'!");
        }
    }

    Product getProduct(int productId) {
        for (Category category : this.categories) {
            Product product = category.getProduct(productId);
            if (product != null) {
                return product;
            }
        }
        return null;
    }
}
