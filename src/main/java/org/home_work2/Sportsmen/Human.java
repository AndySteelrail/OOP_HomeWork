package org.home_work2.Sportsmen;

public class Human extends Organism{

    public Human(String name, double maxRunDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    public void run(double distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Человек '" + name + "' пробежал дистанцию в " +
                    distance + " м. Ну пробежал и пробежал.");
        } else {
            System.out.println("Человек '" + name + "' не пробежал дистанцию в " +
                    distance + " м. Кожанный ублюдок выдохся.");
            this.status = "Not ok";
        }
    }

    @Override
    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println("Человек '" + name + "' перемахнул стену в " +
                    height + " м., не глядя.");
        } else {
            System.out.println("Человек '" + name + "' не перепрыгнул стену в " +
                    height + " м. Жрать меньше надо!");
            this.status = "Not ok";
        }
    }

    @Override
    public String getStatus() {
        return this.status;
    };

}
