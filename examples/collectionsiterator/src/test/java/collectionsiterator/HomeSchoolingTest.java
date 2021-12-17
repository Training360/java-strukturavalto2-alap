package collectionsiterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeSchoolingTest {

    HomeSchooling schooling;

    @BeforeEach
    void init() {
        schooling = new HomeSchooling();
        schooling.addNewLesson(new OnlineLesson("Kiss József", "matematika", LocalDateTime.of(2021, 12, 14, 8, 0)));
        schooling.addNewLesson(new OnlineLesson("Nagy Béla", "biológia", LocalDateTime.of(2021, 12, 15, 8, 0)));
        schooling.addNewLesson(new OnlineLesson("Kiss József", "matematika", LocalDateTime.of(2021, 12, 16, 8, 0)));
    }

    @Test
    void testAddNewLesson() {
        OnlineLesson lesson = new OnlineLesson("Nagy Béla", "biológia", LocalDateTime.of(2021, 12, 14, 12, 0));
        schooling.addNewLesson(lesson);

        assertEquals(4, schooling.getLessons().size());
        assertEquals(1, schooling.getLessons().indexOf(lesson));
    }

    @Test
    void testGetLessonsByTitle() {
        List<OnlineLesson> expected = schooling.getLessonsByTitle("matematika");

        assertEquals(2, expected.size());
    }

    @Test
    void testRemoveLesson() {
        LocalDateTime startTime = LocalDateTime.of(2021, 12, 15, 8, 0);
        schooling.removeLesson(startTime);

        assertEquals(2, schooling.getLessons().size());
        assertEquals("Kiss József", schooling.getLessons().get(0).getTeacherName());
        assertEquals("Kiss József", schooling.getLessons().get(1).getTeacherName());
    }
}