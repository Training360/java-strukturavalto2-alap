package introexceptionthrowjunit4;

public class Tank {

    private int angle;

    public int getAngle() {
        return angle;
    }

    public void modifyAngle(int angleNumber) {
        angle += angleNumber;
        while (angle > 360) {
            angle -= 360;
        }
        while (angle < 0) {
            angle += 360;
        }
        if (angle > 80 && angle < 280) {
            throw new IllegalArgumentException("Turret can not reach a position between 80° and 280°!");
        }
    }
}
