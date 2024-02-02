package org.home_work2.Sportsmen;


public abstract class Machine extends Sportsmen {
    protected String sportsmanType = "machine";
    public Machine(String name, double maxRunDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
        sportsmanType = "machine";
    }

    public abstract void run(double distance);
    public abstract void jump(double height);
    public abstract String getStatus();

}
