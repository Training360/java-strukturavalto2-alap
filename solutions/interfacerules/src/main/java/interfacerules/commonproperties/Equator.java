package interfacerules.commonproperties;

public class Equator implements Name, Length {

    private final static String NAME = "Equator";
    private final static double LENGTH = 40_075.0;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getLength() {
        return LENGTH;
    }
}
