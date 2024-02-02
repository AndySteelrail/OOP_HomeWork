package org.home_work2.Sportsmen;

public class Robot extends Machine{

    public Robot(String name, double maxRunDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    public void run(double distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Робот '" + name + "' пробежал дистанцию в " +
                    distance + " м. Слава роботам!");
        } else {
            System.out.println("Робот '" + name + "' не пробежал дистанцию в " +
                    distance + " м. Аккумулятор сел.");
            this.status = "Not ok";
        }
    }

    @Override
    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println("Робот '" + name + "' перепрыгнул стену в " +
                    height + " м. Слава науке!");
        } else {
            System.out.println("Робот '" + name + "' не перепрыгнул стену в " +
                    height + " м. Тяги не хватило.");
            this.status = "Not ok";
        }
    }

    @Override
    public String getStatus() {
        return this.status;
    };

}
