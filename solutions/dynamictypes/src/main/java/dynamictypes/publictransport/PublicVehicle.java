package dynamictypes.publictransport;

public class PublicVehicle {

    private int lineNumber;
    private double length;

    public PublicVehicle(int lineNumber, double length) {
        this.lineNumber = lineNumber;
        this.length = length;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public double getLength() {
        return length;
    }
}
