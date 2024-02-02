package org.home_work2;
import org.home_work2.Let.Let;
import org.home_work2.Let.RunningTrack;
import org.home_work2.Let.Wall;
import org.home_work2.Sportsmen.Cat;
import org.home_work2.Sportsmen.Human;
import org.home_work2.Sportsmen.Robot;
import org.home_work2.Sportsmen.Sportsmen;


public class Main {
    public static void main(String[] args) {
        Sportsmen[] sportsman = {
                new Human("Mr.Bolt", 1000, 2),
                new Cat("Мышевский", 100, 1.5),
                new Robot("Элеонора", 150, 4),
        };

        Let[] lets = {
                new Wall(1),
                new RunningTrack(92.5),
                new Wall(1.5),
                new RunningTrack(140.5),
                new Wall(2),
                new RunningTrack(167.5)
        };

        for (var sportsmen : sportsman) {
            for (var let : lets) {
                if (!sportsmen.getStatus().equals("Ok")) break;
                if (let instanceof RunningTrack) {
                    let.overcoming(sportsmen);
                } else if (let instanceof Wall) {
                    let.overcoming(sportsmen);
                }
            }

            System.out.print("Испытуемый '" + sportsmen.getName());
            if (sportsmen.getStatus().equals("Ok")) {
                System.out.println("' испытание прошёл.\n");
            } else {
                System.out.println("' испытание бесславно провалил.\n");
            }
        }

    }
}
