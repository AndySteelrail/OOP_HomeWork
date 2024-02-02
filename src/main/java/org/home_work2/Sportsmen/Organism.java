package org.home_work2.Sportsmen;


public abstract class Organism extends Sportsmen {
    protected String sportsmanType = "organism";
    public Organism(String name, double maxRunDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
        sportsmanType = "organism";
    }

    public abstract void run(double distance);
    public abstract void jump(double height);
    public abstract String getStatus();

}
