package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter {

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sb = new StringBuilder();
        for (String s : billItems) {
            String[] temp = s.split(";");
            int pieces = Integer.parseInt(temp[2]);
            int price = Integer.parseInt(temp[1]);
            sb.append(String.format("%s, %d * %d = %d Ft", temp[0], pieces, price, (pieces * price))).append("\n");
        }
        return sb.toString();
    }
}
