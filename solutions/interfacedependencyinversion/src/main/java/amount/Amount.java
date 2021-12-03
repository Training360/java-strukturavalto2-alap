package amount;

public class Amount implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        return amount;
    }
}
