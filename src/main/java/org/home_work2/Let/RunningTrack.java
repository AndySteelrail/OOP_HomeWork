package org.home_work2.Let;
import org.home_work2.Sportsmen.Sportsmen;


public class RunningTrack extends Let{
    private final double distance;

    public RunningTrack(double distance) {
        this.distance = distance;
    }

    @Override
    public void overcoming(Sportsmen sportsman) {
        sportsman.run(distance);
    }
}
