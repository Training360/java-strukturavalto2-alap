package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {
        Performance performance = new Performance("Queen", LocalDate.of(1980, 06, 02), LocalTime.of(18, 00), LocalTime.of(20, 00));
        System.out.println(performance.getArtist());
        System.out.println(performance.getDate());
        System.out.println(performance.getStartTime());
        System.out.println(performance.getEndTime());

        System.out.println(performance.getInfo());
    }
}
