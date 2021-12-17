package typeconversion;

public class Conversion {

    public double convertDoubleToDouble(double number) {
        return  (int) number;
    }

    public byte[] convertIntArrayToByteArray(int[] numbers) {
        byte[] result = new byte[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0 && numbers[i] < 127) {
                result[i] = (byte) numbers[i];
            } else {
                result[i] = -1;
            }
        }
        return result;
    }

    public int getFirstDecimal(double number) {
        int numberInt = (int) number;
        double difference = number - numberInt;
        return  (int) (difference * 10);
    }
}
