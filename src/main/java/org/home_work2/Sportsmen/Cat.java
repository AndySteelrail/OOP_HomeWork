package org.home_work2.Sportsmen;

public class Cat extends Organism{

    public Cat(String name, double maxRunDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    public void run(double distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Кот '" + name + "' пробежал дистанцию в " +
                    distance + " м. Смог");
        } else {
            System.out.println("Кот '" + name + "' не пробежал дистанцию в " +
                    distance + " м. Устал");
            this.status = "Not ok";
        }
    }

    @Override
    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println("Кот '" + name + "' перепрыгнул стену в " +
                    height + " м. Вот это грация!");
        } else {
            System.out.println("Кот '" + name + "' не перепрыгнул стену в " +
                    height + " м. Фиаско");
            this.status = "Not ok";
        }
    }

    @Override
    public String getStatus() {
        return this.status;
    };

}
