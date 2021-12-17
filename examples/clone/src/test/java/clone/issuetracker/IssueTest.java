package clone.issuetracker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class IssueTest {

    LocalDateTime time = LocalDateTime.of(2017, 4, 26, 8, 0, 0);

    Issue issue = new Issue("Issue", time, Status.IN_PROGRESS);

    @BeforeEach
    void addComments() {
        issue.getComments().add(new Comment("Comment", LocalDateTime.now()));
        issue.getComments().add(new Comment("Another comment", LocalDateTime.now()));
    }

    @Test
    void testCreateIssue() {
        assertEquals("Issue", issue.getName());
        assertEquals(time, issue.getTime());
        assertEquals(Status.IN_PROGRESS, issue.getStatus());
    }

    @Test
    void testCopyIssue() {
        Issue copied = new Issue(issue, CopyMode.WITHOUT_COMMENTS);

        assertEquals("Issue", copied.getName());
        assertEquals(time, copied.getTime());
        assertEquals(Status.IN_PROGRESS, copied.getStatus());
        assertTrue(copied.getComments().isEmpty());
        assertNotSame(issue, copied);
    }

    @Test
    void testDeepCopyIssue() {
        Issue copied = new Issue(issue, CopyMode.WITH_COMMENTS);

        assertEquals("Issue", copied.getName());
        assertEquals(time, copied.getTime());
        assertEquals(Status.IN_PROGRESS, copied.getStatus());
        assertEquals(2, copied.getComments().size());
        assertNotSame(issue, copied);
    }

    @Test
    void testDeepCopyIssueAndSetText() {
        Issue copied = new Issue(issue, CopyMode.WITH_COMMENTS);

        copied.getComments().get(0).setText("Comment modified");
        assertEquals("Comment", issue.getComments().get(0).getText());
        assertEquals("Comment modified", copied.getComments().get(0).getText());
    }
}