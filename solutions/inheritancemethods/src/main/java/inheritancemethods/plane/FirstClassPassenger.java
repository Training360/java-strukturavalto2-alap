package inheritancemethods.plane;

public class FirstClassPassenger extends PriorityPassenger {

    private final int extraCharge = 20000;

    public FirstClassPassenger(String name, int priceOfPlaneTicket, int percent) {
        super(name, priceOfPlaneTicket, percent);
    }

    public int getExtraCharge() {
        return extraCharge;
    }

    @Override
    public int getPriceOfPlaneTicket() {
        return (int) (super.getPriceOfPlaneTicket() + extraCharge);
    }
}
