package conversions;

public class ConversionsMain {

    public static void main(String[] args) {
        int i = 100;
        byte b = (byte) i;

        System.out.println(b);

        long l = i;

        Integer o = i;

        int j = o;

        String s = Integer.toString(i);
        System.out.println(s);

        String t = "101";
        int k = Integer.parseInt(t);
        System.out.println(k);
    }
}
