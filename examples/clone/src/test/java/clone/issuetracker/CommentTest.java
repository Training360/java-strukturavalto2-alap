package clone.issuetracker;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class CommentTest {

    @Test
    void testCreateComment() {
        LocalDateTime time = LocalDateTime.of(2017, 4, 26, 8, 0, 0);
        Comment comment = new Comment("Comment", time);

        assertEquals("Comment", comment.getText());
        assertEquals(time, comment.getTime());
    }

    @Test
    void testCreateCommentBasedOnAnotherComment() {
        LocalDateTime time = LocalDateTime.of(2017, 4, 26, 8, 0, 0);
        Comment comment = new Comment("Comment", time);
        Comment copied = new Comment(comment);

        assertEquals("Comment", copied.getText());
        assertEquals(time, copied.getTime());
        assertNotSame(comment, copied);
    }
}