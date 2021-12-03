package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String binaryString) {
        if (binaryString == null)
            throw new NullPointerException("Binary string is null.");
        boolean[] booleans = new boolean[binaryString.length()];
        for (int j = 0; j < binaryString.length(); j++) {
            char c = binaryString.charAt(j);
            if (c != '0' && c != '1')
                throw new IllegalArgumentException("Binary string is not valid.");
            booleans[j] = c == '1';
        }
        return booleans;
    }

    public String booleanArrayToBinaryString(boolean[] booleans) {
        if (booleans == null)
            throw new NullPointerException("Boolean array is null.");
        if (booleans.length == 0)
            throw new IllegalArgumentException("Boolean array is empty.");
        StringBuilder sb = new StringBuilder(booleans.length);
        for (int j = 0; j < booleans.length; j++) {
            if (booleans[j])
                sb.append('1');
            else
                sb.append('0');
        }
        return sb.toString();
    }
}
