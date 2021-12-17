package collectionsautoboxing;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VoteTest {

    @Test
    void testGetResult() {
        Map<String, VoteResult> results = new HashMap<>();
        results.put("Kiss József", VoteResult.YES);
        results.put("Nagy Béla", VoteResult.NO);
        results.put("Szép Virág", VoteResult.YES);
        results.put("Szabó Miklós", VoteResult.YES);
        results.put("Németh Tibor", VoteResult.ABSTAIN);
        results.put("Fodor Károly", VoteResult.NO);
        Map<VoteResult, Integer> expected = new Vote().getResult(results);

        assertEquals(3, expected.get(VoteResult.YES));
        assertEquals(2, expected.get(VoteResult.NO));
        assertEquals(1, expected.get(VoteResult.ABSTAIN));
    }
}