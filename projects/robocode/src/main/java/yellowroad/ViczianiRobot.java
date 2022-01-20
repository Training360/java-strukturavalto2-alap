package yellowroad;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class ViczianiRobot extends Robot {

    @Override
    public void run() {
        while (true) {
            ahead(200);
            turnGunLeft(360);
            back(200);
            turnGunRight(360);
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        fire(1);
    }
}
