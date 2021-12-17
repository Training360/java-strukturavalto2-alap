package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> results) {
        Map<VoteResult, Integer> finalResults = new HashMap<>();
        for (VoteResult v : results.values()) {
            if (!finalResults.containsKey(v)) {
                finalResults.put(v, 0);
            }
            finalResults.put(v, finalResults.get(v) + 1);
        }
        return finalResults;
    }
}
