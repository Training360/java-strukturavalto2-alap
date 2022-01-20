package yellowroad;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class FinderRobot extends Robot {

    public static final int FULL_TURN = 360;
    public static final int MAX_POWER = 3;

    boolean found = false;

    double targetBearing = 0;

    double targetDistance = 0;

    @Override
    public void run() {
        while (!found) {
            turnGunLeft(FULL_TURN);
        }
        turnRight(targetBearing);
        ahead(targetDistance);
        while(true) {
            fire(MAX_POWER);
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        System.out.println("Found: " + event.getBearing() + " " + event.getDistance());
        found = true;
        targetBearing = event.getBearing();
        targetDistance = event.getDistance();
    }
}
