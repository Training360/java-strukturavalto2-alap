package amount;

public class BankAtm implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        int thousand = amount / 1000;
        return 1000 * (thousand + 1);
    }
}
