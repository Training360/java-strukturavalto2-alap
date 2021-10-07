package compositionlist.computer;

public class Cpu {

    private String codeName;
    private double clockSignal;

    public Cpu(String codeName, double clockSignal) {
        this.codeName = codeName;
        this.clockSignal = clockSignal;
    }

    public String getCodeName() {
        return codeName;
    }

    public double getClockSignal() {
        return clockSignal;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public void setClockSignal(double clockSignal) {
        this.clockSignal = clockSignal;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "codeName='" + codeName + '\'' +
                ", clockSignal=" + clockSignal +
                '}';
    }
}
