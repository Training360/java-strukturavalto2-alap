package collectionsmap;

import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        int nextNumber = Integer.MAX_VALUE;
        for (Integer i : applicants.keySet()) {
            if (i > lastNumber && i < nextNumber) {
                nextNumber = i;
            }
        }
        return applicants.get(nextNumber);
    }
}
