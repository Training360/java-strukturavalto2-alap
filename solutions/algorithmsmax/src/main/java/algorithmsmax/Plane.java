package algorithmsmax;

public class Plane {

    public int getLongestOcean(String map) {
        char[] charsOfMap = map.toCharArray();
        int max = 0;
        int sumOcean = 0;
        for (char c : charsOfMap) {
            if (c == '0') {
                sumOcean++;
            }
            if (c == '1' && sumOcean > max) {
                max = sumOcean;
            }
            if (c == '1') {
                sumOcean = 0;
            }
        }
        return max;
    }
}
