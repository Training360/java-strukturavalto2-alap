package lambdacollectors.honey;

public class Honey {

    private HoneyType honeyType;

    private GlassSize glassSize;

    public Honey(HoneyType honeyType, GlassSize glassSize) {
        this.honeyType = honeyType;
        this.glassSize = glassSize;
    }

    public HoneyType getHoneyType() {
        return honeyType;
    }

    public GlassSize getGlassSize() {
        return glassSize;
    }
}
