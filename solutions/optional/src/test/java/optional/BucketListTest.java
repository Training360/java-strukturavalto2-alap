package optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BucketListTest {

    BucketList bucketList;

    @BeforeEach
    void init() {
        bucketList = new BucketList();
        bucketList.addDestination(new Destination("Koppenhága", "városnézés", 1300));
        bucketList.addDestination(new Destination("Tirol", "síelés", 720));
        bucketList.addDestination(new Destination("Lomnici-csúcs", "hegymászás, lanovkázás", 280));
        bucketList.addDestination(new Destination("Izland", "gleccserek, északi fény", 2900));
        bucketList.addDestination(new Destination("Szeged", "vadaspark", 175));
    }

    @Test
    void getDestinationWithKeyword() {
        assertEquals("Tirol", bucketList.getDestinationWithKeyword("sí").get().getName());
    }

    @Test
    void getDestinationWithKeywordNotFound() {
        assertEquals(Optional.empty(), bucketList.getDestinationWithKeyword("tenger"));
    }

    @Test
    void getDestinationNearerThanGiven() {
        assertEquals("Lomnici-csúcs", bucketList.getDestinationNearerThanGiven(300).get().getName());
    }

    @Test
    void getDestinationNearerThanGivenNotFound() {
        assertEquals(Optional.empty(), bucketList.getDestinationNearerThanGiven(10));
    }
}