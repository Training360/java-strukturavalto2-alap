package typeconversion;

import java.util.Arrays;

public class ConversionMain {

    public static void main(String[] args) {

        Conversion conversion = new Conversion();

        System.out.println(conversion.convertDoubleToDouble(628.426718));

        int[] numbers = {5, -14, 6, 2, 125, 354, 9738, 3};
        byte[] result = conversion.convertIntArrayToByteArray(numbers);
        System.out.println(Arrays.toString(result));

        System.out.println(conversion.getFirstDecimal(628.7291));
    }
}
