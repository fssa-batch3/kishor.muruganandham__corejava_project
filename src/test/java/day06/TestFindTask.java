package day06;

import day06.practice.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class TestFindTask {

    @Test
    void testFindTaskByName() {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Wash Car", 2));
        tasks.add(new Task("Shopping", 1));
        tasks.add(new Task("Clean House", 3));

        boolean foundTask = Task.findTaskByName("Shopping", tasks);
        assertTrue(foundTask, "Existing task should be found");

        foundTask = Task.findTaskByName("Read a Book", tasks);
        assertFalse(foundTask, "Non-existing task should not be found");
    }
}