package interfaces.simpletasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleTasksTest {

    @Test
    void testRunWithEmptyTasks() {
        List<String> tasks = new ArrayList<>();
        SimpleTasks simpleTasks = new SimpleTasks(tasks);
        simpleTasks.run();

        assertEquals(0, simpleTasks.getTasks().size());
    }

    @Test
    void testRunWithTasks() {
        List<String> tasks = new ArrayList<>();
        tasks.add("süt");
        tasks.add("főz");
        tasks.add("takarít");
        SimpleTasks simpleTasks = new SimpleTasks(tasks);
        simpleTasks.run();

        assertEquals(0, simpleTasks.getTasks().size());
    }
}