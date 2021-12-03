package amount;

public class Cash implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        int remainder = amount % 5;
        if (remainder <= 2) {
            amount -= remainder;
        } else {
            amount += (5 - remainder);
        }
        return amount;
    }
}
