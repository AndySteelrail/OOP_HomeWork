package org.home_work2.Let;
import org.home_work2.Sportsmen.Sportsmen;


public class Wall extends Let{
    private final double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public void overcoming(Sportsmen sportsman) {
        sportsman.jump(height);
    }
}
